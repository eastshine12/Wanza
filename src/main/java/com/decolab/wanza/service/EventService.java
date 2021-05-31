package com.decolab.wanza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.EventDAO;
import com.decolab.wanza.dto.EventDTO;

@Service
@Transactional
public class EventService {
	
	@Autowired
	EventDAO dao;
	
	public int eventWrite(EventDTO dto) {
		return dao.eventWrite(dto);
	}

}
