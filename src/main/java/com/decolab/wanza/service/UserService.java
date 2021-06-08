package com.decolab.wanza.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.decolab.wanza.dao.UserDAO;
import com.decolab.wanza.dto.UserDTO;


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
	
	public String kakaologin(UserDTO dto) {
		return dao.kakaologin(dto);
	}
	
	public UserDTO getUserNickname(UserDTO dto) {
		return dao.getUserNickname(dto);
	}
	
	public int newPwd(UserDTO dto) {
		return dao.newPwd(dto);
	}
	
	
}
