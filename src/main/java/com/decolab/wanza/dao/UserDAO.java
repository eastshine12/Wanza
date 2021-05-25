package com.decolab.wanza.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.UserDTO;

@Mapper
@Repository
public interface UserDAO {
	
	public int addUser(UserDTO dto);
	
	public UserDTO login(UserDTO dto);

	
}
