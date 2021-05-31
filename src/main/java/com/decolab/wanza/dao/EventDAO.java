package com.decolab.wanza.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.EventDTO;

@Mapper
@Repository
public interface EventDAO {
	
	public int eventWrite(EventDTO dto);

}
