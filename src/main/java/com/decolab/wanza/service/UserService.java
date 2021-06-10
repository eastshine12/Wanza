package com.decolab.wanza.service;



import java.util.HashMap;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.decolab.wanza.dao.UserDAO;
import com.decolab.wanza.dto.UserDTO;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;


@Service
@Transactional
public class UserService {

	@Autowired
	UserDAO dao;
	
	public int addUser(UserDTO dto) {
		return dao.addUser(dto);
	}
	
	public UserDTO login(UserDTO dto) {
		return dao.login(dto);
	}
	
	public UserDTO getUserInfo(int userSeq) {
		return dao.getUserInfo(userSeq);
	}
	
	public UserDTO kakaologin(UserDTO dto) {
		return dao.kakaologin(dto);
	}
	
	public UserDTO getUserNickname(UserDTO dto) {
		return dao.getUserNickname(dto);
	}
	
	public int newPwd(UserDTO dto) {
		return dao.newPwd(dto);
	}
	
	public UserDTO getUserEmail(UserDTO dto) {
		return dao.getUserEmail(dto);
	}
	
	 public void certifiedPhoneNumber(String phoneNumber, String cerNum) {

        String api_key = "NCS2YEWZ5WIVTPDC";
        String api_secret = "DHVIBSMPZNXBJHUSWPCGLXIFEVPXPPHA";
        Message coolsms = new Message(api_key, api_secret);

        // 4 params(to, from, type, text) are mandatory. must be filled
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("to", phoneNumber);    // 수신전화번호
        params.put("from", "01099509214");    // 발신전화번호. 테스트시에는 발신,수신 둘다 본인 번호로 하면 됨
        params.put("type", "ATA");
        params.put("text", "완자 휴대폰인증 메시지 : 인증번호는" + "["+cerNum+"]" + "입니다.");
        params.put("app_version", "test app 1.2"); // application name and version

        try {
            JSONObject obj = (JSONObject) coolsms.send(params);
            System.out.println(obj.toString());
        } catch (CoolsmsException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCode());
        }

    }
	
	
}
