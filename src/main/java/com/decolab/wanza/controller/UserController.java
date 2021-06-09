package com.decolab.wanza.controller;

import java.util.Date;
import java.util.Random;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.UserDTO;
import com.decolab.wanza.service.UserService;

import util.KakaoLogin;


@RestController
public class UserController {

	@Autowired
	UserService service;
	
	@Autowired
    private JavaMailSender mailSender;
	
	
	KakaoLogin Kakao;
	
	
	@RequestMapping(value = "/regi", method = {RequestMethod.GET,RequestMethod.POST})
	public String regi(UserDTO dto) {
		System.out.println("UserController regi() " + new Date() );
		System.out.println(dto.toString());
			
		return service.addUser(dto)>0?"suc":"err";
	}
	
	
	
	@RequestMapping(value = "/login", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO login(UserDTO dto) {
		System.out.println("UserController login() " + new Date() );
		System.out.println(dto.toString());
		
		return service.login(dto);
	}
	
	
	@RequestMapping(value = "/getUserInfo", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO getUserInfo(int userSeq) {
		System.out.println("UserController getUserInfo() " + new Date() );
		
		return service.getUserInfo(userSeq);
	}
	
	/*
	@RequestMapping(value = "/kakaologin", method = {RequestMethod.GET,RequestMethod.POST})
	public String kakaologin(@RequestParam("code") String code, UserDTO dto) {
		System.out.println("UserController kakaologin() " + new Date() );
		System.out.println(dto.toString());
		System.out.println("code" + code);
		
		//String accesstoken = Kakao.getAccessToken(code);
		//System.out.println("accesstoken" + accesstoken);
		
		return service.kakaologin(dto);
	}
	*/
	@RequestMapping(value = "/login/getKakaoAuthUrl", method = {RequestMethod.GET,RequestMethod.POST})
	public String kakaologin(@RequestParam("code") String code, HttpServletRequest req, HttpServletResponse resp, UserDTO dto) {
		String kakaoApiKey = "e55eb67c927feac9076da403729a23f8";
		String kakaoAuthUrl = "https://kauth.kakao.com";
		String redirectURI = "http://localhost:8090/view/community/mainCommunity.html";
		String reqUrl = kakaoAuthUrl + "/oauth/authorize?client_id=" + kakaoApiKey + "&redirect_uri="+ redirectURI + "&response_type=code";
		
		String access_Token = Kakao.getAccessToken(code);
		System.out.println("controller access_token : " + access_Token);
		
		return reqUrl;
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
				"		아래 <b style=\"color: #f38766\">'비밀번호 재설정하러가기'</b> 버튼을 클릭하여 비밀번호를 재설정해주세요<br />"																													+ 
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
		
		return service.newPwd(dto)>0?"suc":"err";
		
	}
	
	

	/*
	// 카카오 연동정보 조회
	@RequestMapping(value = "/login/oauth_kakao")
	public String oauthKakao(HttpServletRequest req, HttpServletResponse resp) throws Exception {

	    String accessToken = getAccessToken(code);
	    String kakaoUniqueNo = getKakaoUniqueNo(accessToken);

	    if (kakaoUniqueNo != null && !kakaoUniqueNo.equals("")) {
	        

	    return "redirect:/";
	    
	    // 카카오톡 정보조회 실패했을경우
	    } else {
	        throw new ErrorMessage("카카오톡 정보조회에 실패했습니다.");
	    }

	}
	*/
	/** 
    
    TO DO : 리턴받은 kakaoUniqueNo에 해당하는 회원정보 조회 후 로그인 처리 후 메인으로 이동

	 */
	
}
