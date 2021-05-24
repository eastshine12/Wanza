package com.decolab.wanza.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.SearchDTO;
import com.decolab.wanza.service.SearchService;

@RestController
public class SearchController {
	
	@Autowired
	SearchService service;
	
	@RequestMapping(value = "/getSearchWord",method = {RequestMethod.GET,RequestMethod.POST})
	public List<SearchDTO> getSearchWord(){
		System.out.println("SearchController getSearchList() " + new Date());
		
		return service.getSearchWord();
	}
	
	@RequestMapping(value = "/searchWrite",method = {RequestMethod.GET,RequestMethod.POST})
	public String searchWrite(SearchDTO dto) {
		System.out.println("SearchController searchWrite() " + new Date());	
		System.out.println(dto.getSearchWord());
		
		return service.searchWrite(dto)>0?"suc":"err";
	
	}
		
	

}
