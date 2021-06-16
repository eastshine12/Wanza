package com.decolab.wanza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.UserEditDAO;
import com.decolab.wanza.dto.AddressDTO;
import com.decolab.wanza.dto.UserDTO;

@Service
@Transactional
public class UserEditService {
	 @Autowired
	 UserEditDAO dao;
	
	 public UserDTO getUserAllInfo(UserDTO dto) {
		 return dao.getUserAllInfo(dto);
	 }
	 
	 public UserDTO getUserAllInfoCopy(UserDTO dto) {
		 return dao.getUserAllInfoCopy(dto);
	 }
	 
	 public int overlapNickname(UserDTO dto) {
		 return dao.overlapNickname(dto);
	 }
	 public int userEdit(UserDTO dto) {
		 return dao.userEdit(dto);
	 }
	public int userEdit2(UserDTO dto) {
		return dao.userEdit2(dto);
	}
	
	public int deleteAdd(int addressSeq) {
		return dao.deleteAdd(addressSeq);
	}
	public AddressDTO getAddress(AddressDTO dto) {
		return dao.getAddress(dto);
	}
	
	public int updateDeli(AddressDTO dto) {
		return dao.updateDeli(dto);
	}
	
	public int noProfilename(UserDTO dto) {
		return dao.noProfilename(dto);
	}
	

}
