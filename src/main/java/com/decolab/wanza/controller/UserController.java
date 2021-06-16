package com.decolab.wanza.controller;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import org.apache.commons.lang.StringEscapeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.decolab.wanza.dto.CardDTO;
import com.decolab.wanza.dto.UserDTO;
import com.decolab.wanza.service.UserService;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import util.NewFileName;
import util.SHA256;





@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@Autowired
    private JavaMailSender mailSender;
	
	
	@RequestMapping(value = "/regi", method = {RequestMethod.GET,RequestMethod.POST})
	public String regi(UserDTO dto) {
		System.out.println("UserController regi() " + new Date() );
		System.out.println(dto.toString());
		String encryptPwd = SHA256.encryptSHA256(dto.getPwd());
		dto.setPwd(encryptPwd);
			
		return service.addUser(dto)>0?"suc":"err";
	}
	
	
	
	@RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO login(UserDTO dto) {
		System.out.println("UserController login() " + new Date() );
		System.out.println(dto.toString());
		String encryptPwd = SHA256.encryptSHA256(dto.getPwd());
		dto.setPwd(encryptPwd);
		return service.login(dto);
	}
	
	
	@RequestMapping(value = "/getUserInfo", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO getUserInfo(int userSeq) {
		System.out.println("UserController getUserInfo() " + new Date() );
		
		return service.getUserInfo(userSeq);
	}
	
	
	@RequestMapping(value = "/kakaologin", method = {RequestMethod.GET,RequestMethod.POST})
	public String kakaologin(@RequestParam(value="code", required=false) String code, UserDTO dto, HttpServletRequest req) {
		System.out.println("UserController kakaologin() " + new Date() );
		System.out.println(dto.toString());
		System.out.println("code : " + code);
		
		String accesstoken = getAccessToken(code);
		System.out.println("accesstoken : " + accesstoken);
		
		HashMap<String, Object> userInfo = getUserInfo(accesstoken);
	    System.out.println("UserController : " + userInfo);
	    
	    dto.setEmail((userInfo.get("email")).toString());
	    dto.setNickname((userInfo.get("nickname")).toString());
	    
	    
	    //Session session;
	    
	    /*
	    if (userInfo.get("email") != null) {
	        session.setAttribute("login", dto);
	        session.setAttribute("access_Token", accesstoken);
	    }
	    */
	    
	    /*이거로가
		http://localhost:8090/view/community/mainCommunity.html?
	    code=BdrNoix4NyV5IaxqLXquzKFr5LhBN7ZPw1VGpaQuMvoVGOv88cMr2KQN3ueUPnGZ0ASrLQo9c-sAAAF56togMg
		*/
	    
		service.kakaologin(dto);
		return (String)userInfo.get("email");
	}
	
	@RequestMapping(value = "/klogin", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO klogin(UserDTO dto, HttpSession session) {
		System.out.println("UserController klogin() " + new Date() );
		System.out.println("klogin() dto " + dto.toString());
			
		String email = dto.getEmail();
		System.out.println("email:" + email);
		//String nickname = dto.getNickname();

		if (email != null) {
	        session.setAttribute("login", dto);
	        // session.setAttribute("access_Token", accesstoken);
	    }
		UserDTO a = service.klogin(dto);
		
		return a;
	}
	
	
	@RequestMapping(value = "/checkEmail", method = {RequestMethod.GET,RequestMethod.POST})
	public String checkEmail(String email) {
		System.out.println("UserController checkEmail() " + new Date() );
		System.out.println("mail : " + email);
		return service.checkEmail(email);
	}

	
	@RequestMapping(value = "/CheckMail", method = {RequestMethod.GET,RequestMethod.POST})
	public void SendMail(String mail) {
		Random random=new Random();  //난수 생성을 위한 랜덤 클래스
		String key="";  //인증번호 

		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(mail); //스크립트에서 보낸 메일을 받을 사용자 이메일 주소 
		//입력 키를 위한 코드
		for(int i =0; i<3;i++) {
			int index=random.nextInt(25)+65; //A~Z까지 랜덤 알파벳 생성
			key+=(char)index;
		}
		int numIndex=random.nextInt(9999)+1000; //4자리 랜덤 정수를 생성
		key+=numIndex;
		message.setSubject("인증번호 입력을 위한 메일 전송");
		message.setText("인증 번호 : "+key);
		mailSender.send(message);
	}
	
	@RequestMapping(value = "/sendMail", method = {RequestMethod.GET,RequestMethod.POST})
	public void sendMail(UserDTO dto) throws MessagingException {
		
		dto.setEmail(StringEscapeUtils.unescapeHtml(dto.getEmail()));
		System.out.println(dto.getEmail());
		
		UserDTO info = service.getUserNickname(dto);
		
		String nickName = info.getNickname();
		if(nickName==""||nickName==null) {
			nickName = info.getEmail();
		}
			
		MimeMessage mimeMessage = mailSender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
    	
		StringBuffer emailcontent = new StringBuffer();
		emailcontent.append("<!DOCTYPE html>");
		emailcontent.append("<html>");
		emailcontent.append("<head>");
		emailcontent.append("</head>");
		emailcontent.append("<body>");
		emailcontent.append(
				" <div" 																																																	+ 
				"	style=\"font-family: 'Apple SD Gothic Neo', 'sans-serif' !important; width: 400px; height: 600px; border-top: 4px solid #f38766; margin: 100px auto; padding: 30px 0; box-sizing: border-box;\">"		+ 
				"	<h1 style=\"margin: 0; padding: 0 5px; font-size: 28px; font-weight: 400;\">"																															+ 
				"		<span style=\"font-size: 15px; margin: 0 0 10px 3px;\">WANZA</span><br />"																													+ 
				"		<span style=\"color: #f38766\">비밀번호 재설정</span> 안내입니다."																																				+ 
				"	</h1>\n"																																																+ 
				"	<p style=\"font-size: 16px; line-height: 26px; margin-top: 50px; padding: 0 5px;\">"																													+
				nickName+
				"		님 안녕하세요.<br />"																																													+ 
				"		완자를 이용해 주셔서 진심으로 감사드립니다.<br />"																																						+ 
				"		아래 <b style=\"color: #f38766\">'비밀번호 재설정'</b> 버튼을 클릭하여 비밀번호를 재설정해주세요<br />"																													+ 
				"		감사합니다."																																															+ 
				"	</p>"																																																	+ 
				"	<a style=\"color: #fff; text-decoration: none; text-align: center;\""																																	+
				"	href=\"http://localhost:8090/view/login/newPw.html?userSeq="+info.getUserSeq()+"\">"														+ 
				"		<p"																																																	+
				"			style=\"display: inline-block; width: 210px; height: 45px; margin: 30px 5px 40px; background: #f38766; line-height: 45px; vertical-align: middle; font-size: 16px;\">"							+ 
				"			비밀번호 재설정</p>"																																														+ 
				"	</a>"																																																	+
				"	<div style=\"border-top: 1px solid #DDD; padding: 5px;\"></div>"																																		+
				" </div>"
		);
		emailcontent.append("</body>");
		emailcontent.append("</html>");
		
				
		helper.setFrom("bit210324@gmail.com"); //보내는사람
    	helper.setTo(dto.getEmail()); //받는사람
    	helper.setSubject("[완자] 비밀번호 재설정 안내"); //메일제목
    	helper.setText(emailcontent.toString(), true); //ture넣을경우 html
    	mailSender.send(mimeMessage);
	}
	
	@RequestMapping(value = "/newPwd", method = {RequestMethod.GET,RequestMethod.POST})
	public String newPwd(UserDTO dto) {
		System.out.println("UserController newPwd() " + new Date() );
		System.out.println(dto.toString());
		String encryptPwd = SHA256.encryptSHA256(dto.getPwd());
		dto.setPwd(encryptPwd);
		
		return service.newPwd(dto)>0?"suc":"err";
		
	}

	@RequestMapping(value = "/sendSms", method = {RequestMethod.GET,RequestMethod.POST})
	public String sendSms(UserDTO dto) {
		System.out.println("UserController sendSms() " + new Date() );
		// 폰넘버로 받아온 유저 정보를 가지고 이메일이 존재하는지 확인
		UserDTO info = service.getUserEmail(dto);
		
		 Random rand  = new Random();
	        String numStr = "";
	        for(int i=0; i<4; i++) {
	            String ran = Integer.toString(rand.nextInt(10));
	            numStr+=ran;
	        }

	        System.out.println("수신자 번호 : " + info.getPhone());
	        System.out.println("인증번호 : " + numStr);
	        service.certifiedPhoneNumber(dto.getPhone(),numStr);
	        return numStr; 
	}
	
	@RequestMapping(value = "/loginsendSms", method = {RequestMethod.GET,RequestMethod.POST})
	public String loginsendSms(String phone) {
		
		Random rand  = new Random();
        String numStr = "";
        for(int i=0; i<4; i++) {
            String ran = Integer.toString(rand.nextInt(10));
            numStr+=ran;
        }

        System.out.println("수신자 번호 : " + phone);
        System.out.println("인증번호 : " + numStr);
        service.certifiedPhoneNumber(phone ,numStr);
        return numStr; 
	}
	
	
	
	@RequestMapping(value = "/findId", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO findId(UserDTO dto) {
		System.out.println("UserController findId() " + new Date() );
		return service.getUserEmail(dto);
	}
	
	//카카오에 쓰는 함수
	public String getAccessToken (String authorize_code) {
        String access_Token = "";
        String refresh_Token = "";
        String reqURL = "https://kauth.kakao.com/oauth/token";
        System.out.println("겟 엑세스 토큰 들어옴?");
        try {
            URL url = new URL(reqURL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            
            //    POST 요청을 위해 기본값이 false인 setDoOutput을 true로
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            
            //    POST 요청에 필요로 요구하는 파라미터 스트림을 통해 전송
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(conn.getOutputStream()));
            StringBuilder sb = new StringBuilder();
            sb.append("grant_type=authorization_code");
            sb.append("&client_id=e55eb67c927feac9076da403729a23f8");
            sb.append("&redirect_uri=http://localhost:8090/view/login/login.html");
            sb.append("&code=" + authorize_code);
            bw.write(sb.toString());
            bw.flush();
            
            //    결과 코드가 200이라면 성공
            int responseCode = conn.getResponseCode();
            System.out.println("responseCode : " + responseCode);
 
            //    요청을 통해 얻은 JSON타입의 Response 메세지 읽어오기
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line = "";
            String result = "";
            
            while ((line = br.readLine()) != null) {
                result += line;
            }
            System.out.println("response body : " + result);
            
            //    Gson 라이브러리에 포함된 클래스로 JSON파싱 객체 생성
            JsonParser parser = new JsonParser();
            JsonElement element = parser.parse(result);
            
            access_Token = element.getAsJsonObject().get("access_token").getAsString();
            refresh_Token = element.getAsJsonObject().get("refresh_token").getAsString();
            
            System.out.println("access_token : " + access_Token);
            System.out.println("refresh_token : " + refresh_Token);
            
            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
        return access_Token;
    }
	
	@SuppressWarnings("deprecation")
	public HashMap<String, Object> getUserInfo (String access_Token) {
	    
	    //    요청하는 클라이언트마다 가진 정보가 다를 수 있기에 HashMap타입으로 선언
	    HashMap<String, Object> userInfo = new HashMap<>();
	    String reqURL = "https://kapi.kakao.com/v2/user/me";
	    try {
	        URL url = new URL(reqURL);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setRequestMethod("POST");
	        
	        //    요청에 필요한 Header에 포함될 내용
	        conn.setRequestProperty("Authorization", "Bearer " + access_Token);
	        
	        int responseCode = conn.getResponseCode();
	        System.out.println("responseCode : " + responseCode);
	        
	        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	        
	        String line = "";
	        String result = "";
	        
	        while ((line = br.readLine()) != null) {
	            result += line;
	        }
	        System.out.println("response body : " + result);

			JsonParser parser = new JsonParser();
	        JsonElement element = parser.parse(result);
	        
	        JsonObject properties = element.getAsJsonObject().get("properties").getAsJsonObject();
	        JsonObject kakao_account = element.getAsJsonObject().get("kakao_account").getAsJsonObject();
	        
	        String nickname = properties.getAsJsonObject().get("nickname").getAsString();
	        String email = kakao_account.getAsJsonObject().get("email").getAsString();
	        String agerange = kakao_account.getAsJsonObject().get("age_range").getAsString();
	        String birth = kakao_account.getAsJsonObject().get("birthday").getAsString();
	        String gender = kakao_account.getAsJsonObject().get("gender").getAsString();
	       
	        userInfo.put("nickname", nickname);
	        userInfo.put("email", email);
	        userInfo.put("agerange", agerange);
	        userInfo.put("gender", gender);
	        userInfo.put("birth", birth);
	        
	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	    
	    return userInfo;
	}
	
	@RequestMapping(value = "/report", method = {RequestMethod.GET,RequestMethod.POST})
	public void report(int userSeq, String nickname,String report,String reportContent,String reportseq)throws MessagingException {
		
		// id 값이 중복되지 않게 하기위해 유저닉네임 뒤에 rprpwanza+i를 넣었고 그것을 잘라서 보여줄 것
        System.out.println(nickname);    
        int idx = nickname.indexOf("rprpwanza");         
        String realnickname = nickname.substring(0, idx);



		
		UserDTO dto = service.getUserInfo(userSeq);
		
		System.out.println(dto.getNickname()); //신고자
		System.out.println(realnickname);		   // 신고당한자
		System.out.println(report);			   // 리폿사유
		System.out.println(reportContent);	   // 리폿내용
		System.out.println(reportseq);
		
		MimeMessage mimeMessage = mailSender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
    	
		StringBuffer emailcontent = new StringBuffer();
		emailcontent.append("<!DOCTYPE html>");
		emailcontent.append("<html>");
		emailcontent.append("<head>");
		emailcontent.append("</head>");
		emailcontent.append("<body>");
		emailcontent.append(
				" <div" 																																																	+ 
				"	style=\"font-family: 'Apple SD Gothic Neo', 'sans-serif' !important; width: 400px; height: 600px; border-top: 4px solid #f38766; margin: 100px auto; padding: 30px 0; box-sizing: border-box;\">"		+ 
				"	<h1 style=\"margin: 0; padding: 0 5px; font-size: 28px; font-weight: 400;\">"																															+ 
				"		<span style=\"font-size: 15px; margin: 0 0 10px 3px;\">WANZA</span><br />"																													+ 
				"		<span style=\"color: #f38766\">신고 접수</span> 안내입니다."																																				+ 
				"	</h1>\n"																																																+ 
				"	<p style=\"font-size: 16px; line-height: 26px; margin-top: 50px; padding: 0 5px;\"><b>"																													+
						dto.getNickname() +
				"		</b>님의 신고입니다.<br />"																																													+
				"<strong>신고 당한 유저 : </strong>"+realnickname+"<br />"+
				"<strong>신고 사유 : </strong>"+report+"<br />"+
				"<strong>신고 세부 내용 : </strong>" +reportContent+"<br />"+ 
				"		아래 <b style=\"color: #f38766\">'신고 확인'</b> 버튼을 클릭하여 신고를 확인해주세요<br />"																													+ 
				"	</p>"																																																	+ 
				"	<a style=\"color: #fff; text-decoration: none; text-align: center;\""																																	+
				"	href=\"http://localhost:8090/view/community/storyDetail.html?seq="+reportseq+"#"+nickname+"\">"														+ 
				"		<p"																																																	+
				"			style=\"display: inline-block; width: 210px; height: 45px; margin: 30px 5px 40px; background: #f38766; line-height: 45px; vertical-align: middle; font-size: 16px;\">"							+ 
				"			신고 확인</p>"																																														+ 
				"	</a>"																																																	+
				"	<div style=\"border-top: 1px solid #DDD; padding: 5px;\"></div>"																																		+
				" </div>"
		);
		emailcontent.append("</body>");
		emailcontent.append("</html>");
		
				
		helper.setFrom("bit210324@gmail.com"); //보내는사람
    	helper.setTo("bit2final@gmail.com"); //받는사람 - 운영자
    	helper.setSubject("[완자]"+dto.getNickname()+" 님의 신고접수"); //메일제목
    	helper.setText(emailcontent.toString(), true); //true넣을경우 html
    	mailSender.send(mimeMessage);
	
	}

}




	
	
	
