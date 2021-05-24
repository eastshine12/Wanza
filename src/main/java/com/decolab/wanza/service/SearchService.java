package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.SearchDAO;
import com.decolab.wanza.dto.SearchDTO;

@Service
@Transactional
public class SearchService {
	
	@Autowired
	SearchDAO dao;
	
	public List<SearchDTO> getSearchWord(){
		return dao.getSearchWord();
	}
	
	public int searchWrite(SearchDTO dto) {
		return dao.searchWrite(dto);
	}

}
