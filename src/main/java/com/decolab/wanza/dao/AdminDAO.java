package com.decolab.wanza.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.admin.AdminStoryTagDTO;

@Mapper
@Repository
public interface AdminDAO {
	
	public List<AdminStoryTagDTO> getStoryTagList();
	
	

}
