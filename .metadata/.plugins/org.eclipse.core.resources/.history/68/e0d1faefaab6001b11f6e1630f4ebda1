package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.CardDAO;
import com.decolab.wanza.dto.CardDTO;

@Service
@Transactional
public class CardService {

	@Autowired
	CardDAO dao;
	
	public List<CardDTO> getCardList() {
		return dao.getCardList();
	}
	
	public int cardWrite(CardDTO dto) {
		return dao.cardWrite(dto);
	}
	
}
