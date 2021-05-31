package com.decolab.wanza.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.EventDTO;
import com.decolab.wanza.service.EventService;

@RestController
public class EventController {
	
	@Autowired
	EventService service;

	@RequestMapping(value = "/eventWrite", method = {RequestMethod.GET,RequestMethod.POST})
	public String eventWrite(EventDTO dto) {
		System.out.println("EventController eventWrite() " + new Date());
		System.out.println(dto.toString());
						
		return service.eventWrite(dto)>0?"suc":"err";

	}
	
	
}
