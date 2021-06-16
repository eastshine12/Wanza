package com.decolab.wanza.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.AddressDTO;
import com.decolab.wanza.dto.UserDTO;

@Mapper
@Repository
public interface UserEditDAO {
	
	public UserDTO getUserAllInfo(UserDTO dto);
	
	public UserDTO getUserAllInfoCopy(UserDTO dto);
	
	public int overlapNickname(UserDTO dto);
	
	public int userEdit(UserDTO dto);
	
	public int userEdit2(UserDTO dto);
	
	public int deleteAdd(int addressSeq);
	
	public AddressDTO getAddress(AddressDTO dto);
	
	public int updateDeli(AddressDTO dto);
	
	public int noProfilename(UserDTO dto);

}
