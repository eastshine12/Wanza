package com.decolab.wanza.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.EventDTO;

@Mapper
@Repository
public interface EventDAO {
	
	public int eventWrite(EventDTO dto);
	
	public List<EventDTO> getEventList(EventDTO dto);

}
