package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.AdminDAO;
import com.decolab.wanza.dto.admin.AdminStoryTagDTO;

@Service
@Transactional
public class AdminService {
	
	
	@Autowired
	AdminDAO dao;
	
	public List<AdminStoryTagDTO> getStoryTagList(){
		return dao.getStoryTagList();
	}
	
	
	
	
	
	
	
	

}
