package com.decolab.wanza.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.UserDTO;

@Mapper
@Repository
public interface UserDAO {
	
	public int addUser(UserDTO dto);
	
	public UserDTO login(UserDTO dto);
	
	public UserDTO getUserInfo(int userSeq);

	public void kakaologin(UserDTO dto);
	
	public UserDTO getUserNickname(UserDTO dto);
	
	public int newPwd(UserDTO dto);
	
	public UserDTO getUserEmail(UserDTO dto);

	
	
}
