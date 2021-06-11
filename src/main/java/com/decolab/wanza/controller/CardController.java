package com.decolab.wanza.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.decolab.wanza.dto.CardDTO;
import com.decolab.wanza.dto.CardReviewDTO;
import com.decolab.wanza.service.CardService;

import util.NewFileName;

@RestController
public class CardController {
	
	@Autowired
	CardService service;
	
	@Autowired
	ServletContext servletContext;
	
	
	@RequestMapping(value = "/getCardList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<CardDTO> getCardList() {
		System.out.println("CardController getCardList() " + new Date());
		return service.getCardList();
	}
	
	@RequestMapping(value = "/getCardSortList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<CardDTO> getCardSortList(CardDTO dto) {
		System.out.println("CardController getCardSortList() " + new Date());
		System.out.println(dto.toString());
		return service.getCardSortList(dto);
	}
	
	@RequestMapping(value = "/getCardDetail", method = {RequestMethod.GET,RequestMethod.POST})
	public CardDTO getCardDetail(CardDTO dto) {
		System.out.println("CardController getCardDetail() " + new Date());
		return service.getCardDetail(dto);
	}
	
	@RequestMapping(value = "/storyWrite", method = {RequestMethod.GET,RequestMethod.POST})
	public String storyWrite(@RequestParam("cardFile")MultipartFile cardFile, CardDTO dto, HttpServletRequest req) {
		
		System.out.println("CardController storyWrite() " + new Date());
		
		/* 경로	src/main/webapp/upload 폴더를 생성할 것 */
		String uploadPath = req.getServletContext().getRealPath("/upload");
		//String uploadPath = "d:\\tmp";
		
		String filename = cardFile.getOriginalFilename();
		
		String newFilename = NewFileName.getNewFileName(filename);
		String filepath = uploadPath + File.separator + newFilename;
		
		System.out.println("filepath :" + filepath);
		dto.setCardFileName(newFilename);

		System.out.println("dto 들어오나 : "+dto.toString());
		
		try {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			os.write(cardFile.getBytes());
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "file upload fail";
		}
		
		service.cardWrite(dto);
		int cardSeq = service.getCardSeq(dto);
		dto.setCardSeq(cardSeq);
		service.addCardTag(dto);
		
		return "suc"; 
	}
	
	
	@RequestMapping(value = "/cardDelete", method = {RequestMethod.GET,RequestMethod.POST})
	public String cardDelete(CardDTO dto) {		
		System.out.println("CardController cardDelete() " + new Date());
		return service.cardDelete(dto)>0?"suc":"err";
	}
	
	@RequestMapping(value = "/cardUpdate", method = {RequestMethod.GET,RequestMethod.POST})
	public String cardUpdate(CardDTO dto) {		
		System.out.println("CardController cardUpdate() " + new Date());
		System.out.println(dto.toString());
		return service.cardUpdate(dto)>0?"suc":"err";
	}
	
	
	
	@RequestMapping(value = "/addCardReadCount", method = {RequestMethod.GET,RequestMethod.POST})
	public String addCardReadCount(CardDTO dto) {		
		System.out.println("CardController addCardReadCount() " + new Date());
		return service.addCardReadCount(dto)>0?"suc":"err";
	}
	
	
	@RequestMapping(value = "/getCardLikeCount", method = {RequestMethod.GET,RequestMethod.POST})
	public int getCardLikeCount(CardDTO dto) {
		
		System.out.println("CardController getCardLikeCount() " + new Date());
		System.out.println(dto.toString());
		return service.getLikeCount(dto);
	}
	
	@RequestMapping(value = "/getBoolLike", method = {RequestMethod.GET,RequestMethod.POST})
	public String getBoolLike(CardDTO dto) {
		
		System.out.println("CardController getBoolLike() " + new Date());
		System.out.println(dto.toString());
		return service.boolLike(dto)>0?"exist":"";
	}
	
	@RequestMapping(value = "/addCardLikeCount", method = {RequestMethod.GET,RequestMethod.POST})
	public String addCardLikeCount(CardDTO dto) {
		
		System.out.println("CardController addCardLikeCount() " + new Date());
		System.out.println(dto.toString());
		return service.addCardLikeCount(dto)>0?"suc":"err";
	}
	
	@RequestMapping(value = "/deleteCardLikeCount", method = {RequestMethod.GET,RequestMethod.POST})
	public String deleteCardLikeCount(CardDTO dto) {
		
		System.out.println("CardController deleteCardLikeCount() " + new Date());
		System.out.println(dto.toString());
		return service.deleteCardLikeCount(dto)>0?"suc":"err";
	}
	
	@RequestMapping(value = "/getCardReviewList", method = {RequestMethod.GET,RequestMethod.POST})
	public List<CardReviewDTO> getCardReviewList(CardReviewDTO dto) {
		
		System.out.println("CardController getCardReviewList() " + new Date());
		System.out.println(dto.toString());
		return service.getCardReviewList(dto);
	}
	
	@RequestMapping(value = "/getCardReviewCount", method = {RequestMethod.GET,RequestMethod.POST})
	public int getCardReviewCount(CardReviewDTO dto) {
		
		System.out.println("CardController getCardReviewCount() " + new Date());
		System.out.println(dto.toString());
		return service.getCardReviewCount(dto);
	}
	

	@RequestMapping(value = "/cardReviewWrite", method = {RequestMethod.GET,RequestMethod.POST})
	public String cardReviewWrite(CardReviewDTO dto) {
		
		System.out.println("CardController cardReviewWrite() " + new Date());
		System.out.println(dto.toString());
		return service.cardReviewWrite(dto)>0?"suc":"err";
	}
	
	@RequestMapping(value = "/cardReviewDelete", method = {RequestMethod.GET,RequestMethod.POST})
	public String cardReviewDelete(CardReviewDTO dto) {
		
		System.out.println("CardController cardReviewDelete() " + new Date());
		System.out.println(dto.toString());
		return service.cardReviewDelete(dto)>0?"suc":"err";
	}
	
	@RequestMapping(value = "/otherPictures", method = {RequestMethod.GET,RequestMethod.POST})
	public List<CardDTO> otherPictures(CardDTO dto) {
		System.out.println(dto.getUserSeq());
		System.out.println("CardController otherPictures() " + new Date());
		return service.otherPictures(dto);
	}
	
	
	
	

}
