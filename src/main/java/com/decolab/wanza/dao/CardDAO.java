package com.decolab.wanza.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.CardDTO;
import com.decolab.wanza.dto.CardReviewDTO;

@Mapper
@Repository
public interface CardDAO {

	public List<CardDTO> getCardList();
	public List<CardDTO> getCardSortList(CardDTO dto);
	public List<CardDTO> getSearchCard(CardDTO dto);
	
	public CardDTO getCardDetail(CardDTO dto);
	
	public int cardWrite(CardDTO dto);
	
	public int addCardReadCount(CardDTO dto);
	
	public int getCardSeq(CardDTO dto);
	
	public int addCardTag(CardDTO dto);
	
	public int cardDelete(CardDTO dto);
	
	public int cardUpdate(CardDTO dto);
	public int cardTagUpdate(CardDTO dto);
	
	public int getLikeCount(CardDTO dto);
	public int boolLike(CardDTO dto);
	public int addCardLikeCount(CardDTO dto);
	public int deleteCardLikeCount(CardDTO dto);
	
	public List<CardReviewDTO> getCardReviewList(CardReviewDTO dto);
	
	public int getCardReviewCount(CardReviewDTO dto);
	
	public int cardReviewWrite(CardReviewDTO dto);
	
	public int cardReviewDelete(CardReviewDTO dto);
	
}
