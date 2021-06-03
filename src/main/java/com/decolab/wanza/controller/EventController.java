package com.decolab.wanza.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.decolab.wanza.dto.CardDTO;
import com.decolab.wanza.dto.EventDTO;
import com.decolab.wanza.service.EventService;

import util.NewFileName;

@RestController
public class EventController {
	
	@Autowired
	EventService service;

	/*
	 * @RequestMapping(value = "/eventWrite", method =
	 * {RequestMethod.GET,RequestMethod.POST}) public String eventWrite(EventDTO
	 * dto) { System.out.println("EventController eventWrite() " + new Date());
	 * System.out.println(dto.toString());
	 * 
	 * return service.eventWrite(dto)>0?"suc":"err"; }
	 */
	@RequestMapping(value = "/eventWrite", method = {RequestMethod.GET,RequestMethod.POST})
	public String storyWrite(@RequestParam("eventFile1")MultipartFile eventFilename,EventDTO dto, HttpServletRequest req) {
		System.out.println("dto 들어오나 : "+dto.toString());
		System.out.println("EventController eventWrite() " + new Date());
		
		/* 경로	src/main/webapp/upload 폴더를 생성할 것 */
		String uploadPath = req.getServletContext().getRealPath("/upload");
		//String uploadPath = "d:\\tmp";
		
		String filename = eventFilename.getOriginalFilename();
		
		String newFilename = NewFileName.getNewFileName(filename);
		String filepath = uploadPath + File.separator + newFilename;
		
		System.out.println("filepath :" + filepath);
		dto.setEventFilename(newFilename);

		System.out.println("dto 들어오나 : "+dto.toString());
		
		try {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			System.out.println("11111111111111111111111111 ");
			os.write(eventFilename.getBytes());
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "file upload fail";
		}
		System.out.println("2222222222222222222222222222222");
		 return service.eventWrite(dto)>0?"suc":"err";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value = "/getEventList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<EventDTO> getEventList(EventDTO dto){
		System.out.println("EventController getEventList() " + new Date());
		return service.getEventList(dto);
	}
}
