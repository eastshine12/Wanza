package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.CardDAO;
import com.decolab.wanza.dto.CardDTO;
import com.decolab.wanza.dto.CardReviewDTO;

@Service
@Transactional
public class CardService {

	@Autowired
	CardDAO dao;
	
	public List<CardDTO> getCardList() {
		return dao.getCardList();
	}
	
	public List<CardDTO> getCardSortList(CardDTO dto) {
		return dao.getCardSortList(dto);
	}
	
	public List<CardDTO> getSearchCard(CardDTO dto) {
		return dao.getSearchCard(dto);
	}
	
	public CardDTO getCardDetail(CardDTO dto) {
		return dao.getCardDetail(dto);
	}

	public int cardWrite(CardDTO dto) {
		return dao.cardWrite(dto);
	}

	public int addCardReadCount(CardDTO dto) {
		return dao.addCardReadCount(dto);
	}
	
	public int getCardSeq(CardDTO dto) {
		return dao.getCardSeq(dto);
	}
	
	public int addCardTag(CardDTO dto) {
		return dao.addCardTag(dto);
	}
	
	public int cardDelete(CardDTO dto) {
		return dao.cardDelete(dto);
	}
	
	public int cardUpdate(CardDTO dto) {
		int a = dao.cardUpdate(dto);
		int b = dao.cardTagUpdate(dto);
		return a+b;
	}
	
	
	public int getLikeCount(CardDTO dto) {
		return dao.getLikeCount(dto);
	}
	
	public int boolLike(CardDTO dto) {
		return dao.boolLike(dto);
	}
	
	public int addCardLikeCount(CardDTO dto) {
		return dao.addCardLikeCount(dto);
	}
	
	public int deleteCardLikeCount(CardDTO dto) {
		return dao.deleteCardLikeCount(dto);
	}
	
	public List<CardReviewDTO> getCardReviewList(CardReviewDTO dto) {
		return dao.getCardReviewList(dto);
	}
	
	public int getCardReviewCount(CardReviewDTO dto) {
		return dao.getCardReviewCount(dto);
	}
	
	public int cardReviewWrite(CardReviewDTO dto) {
		return dao.cardReviewWrite(dto);
	}
	
	public int cardReviewDelete(CardReviewDTO dto) {
		return dao.cardReviewDelete(dto);
	}

}
