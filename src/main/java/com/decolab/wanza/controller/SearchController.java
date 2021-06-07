package com.decolab.wanza.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.decolab.wanza.dto.CardDTO;
import com.decolab.wanza.dto.ProductDTO;
import com.decolab.wanza.dto.QuestionDTO;
import com.decolab.wanza.dto.SearchDTO;
import com.decolab.wanza.service.CardService;
import com.decolab.wanza.service.ProductService;
import com.decolab.wanza.service.QuestionService;
import com.decolab.wanza.service.SearchService;

@RestController
public class SearchController {
	
	@Autowired
	SearchService service;
	@Autowired
	ProductService pService;
	@Autowired
	CardService cService;
	@Autowired
	QuestionService qService;
	
	// 7일간 상위 10개 검색어
	@RequestMapping(value = "/getSearchWord",method = {RequestMethod.GET,RequestMethod.POST})
	public List<SearchDTO> getSearchWord(){
		System.out.println("SearchController getSearchWord() " + new Date());
		
		return service.getSearchWord();
	}
	// 검색어 등록
	@RequestMapping(value = "/searchWrite",method = {RequestMethod.GET,RequestMethod.POST})
	public String searchWrite(SearchDTO dto) {
		System.out.println("SearchController searchWrite() " + new Date());	
		System.out.println(dto.getSearchWord());
		
		return service.searchWrite(dto)>0?"suc":"err";
	
	}		
	//전체검색
	@RequestMapping(value = "/getTotalSearch", method = {RequestMethod.GET,RequestMethod.POST})
	public Map<String, Object> getTotalSearch(SearchDTO dto) {
		System.out.println("SearchController getTotalSearch() " + new Date());
		System.out.println(dto.toString());
		String word = dto.getSearchWord();
				
		ProductDTO pDto = new ProductDTO();
		pDto.setProductName(word);
		
		CardDTO cDto = new CardDTO();
		cDto.setCardTitle(word);
		
		QuestionDTO qDto = new QuestionDTO();
		qDto.setQuestionTitle(word);
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("store", pService.getSearchProduct(pDto));
		map.put("story", cService.getSearchCard(cDto));
		map.put("question", qService.getSearchQuestion(qDto));
		
		return map;
	}

}
