package com.decolab.wanza.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.decolab.wanza.dto.AddressDTO;
import com.decolab.wanza.dto.UserDTO;
import com.decolab.wanza.service.UserEditService;

import util.NewFileName;

@RestController
public class UserEditController {
	@Autowired
	UserEditService service;
	
	@RequestMapping(value = "/getUserAllInfo", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO getUserAllInfo(UserDTO dto) {
		System.out.println("UserController getUserAllInfo() " + new Date() );
		return service.getUserAllInfo(dto);
		
	}
	
	@RequestMapping(value = "/getUserAllInfoCopy", method = {RequestMethod.GET,RequestMethod.POST})
	public UserDTO getUserAllInfoCopy(UserDTO dto) {
		System.out.println("UserController getUserAllInfo() " + new Date() );
		return service.getUserAllInfoCopy(dto);
		
	}
	

	@RequestMapping(value = "/overlapNickname", method = {RequestMethod.GET,RequestMethod.POST})
	public String overlapNickname(UserDTO dto) {
		System.out.println("UserController overlapNickname() " + new Date() );
		return service.overlapNickname(dto)>0?"suc":"err";
	}
	
	
	@RequestMapping(value = "/userEdit", method = {RequestMethod.GET,RequestMethod.POST})
	public String userEdit(@RequestParam("profile")MultipartFile profile, UserDTO dto, HttpServletRequest req) {
		System.out.println(dto.toString());
		
		System.out.println("UserController userEdit() " + new Date());
		
		/* 경로	src/main/webapp/upload 폴더를 생성할 것 */
		String uploadPath = req.getServletContext().getRealPath("/upload");
		//String uploadPath = "d:\\tmp";
		
		String filename = profile.getOriginalFilename();
		
		String newFilename = NewFileName.getNewFileName(filename);
		String filepath = uploadPath + File.separator + newFilename;
		
		System.out.println("filepath :" + filepath);
		dto.setProfileName(newFilename);
		/*
		if(dto.getAddress().length()>1) {
			//System.out.println("여기1");
			String address = dto.getAddress();
			//System.out.println("여기2");
			String splitadd[] = address.split(",");
			//System.out.println("여기3");
			dto.setAddress(splitadd[0]+"///"+splitadd[1]);
			//System.out.println("여기4");
		}else {
			dto.setAddress("");
		}
		*/
		System.out.println("dto 들어오나 : "+dto.toString());
			
		
		try {
			BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(new File(filepath)));
			os.write(profile.getBytes());
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "file upload fail";
		}

		service.userEdit(dto);

			
		return "suc"; 
	} 
	
	@RequestMapping(value = "/deleteAdd", method = {RequestMethod.GET,RequestMethod.POST})
	public String deleteAdd(int addressSeq) {
		
		System.out.println("UserEditController deleteAdd() " + new Date());
		
		return service.deleteAdd(addressSeq)>0?"suc":"err";
		
	
	}
	@RequestMapping(value = "/getAddress", method = {RequestMethod.GET,RequestMethod.POST})
	public AddressDTO getAddress(AddressDTO dto) {
		System.out.println("UserEditController getAddress() " + new Date());
		return service.getAddress(dto);
	}
	
	@RequestMapping(value = "/updateDeli", method = {RequestMethod.GET,RequestMethod.POST})
	public String updateDeli(AddressDTO dto) {
		System.out.println("UserEditController updateDeli() " + new Date());
		
		return service.updateDeli(dto)>0?"suc":"err";
		
	}
	
	@RequestMapping(value = "/noProfile", method = {RequestMethod.GET,RequestMethod.POST})
	public String noProfile(UserDTO dto) {
		System.out.println("UserEditController noProfile() " + new Date());
		return service.noProfilename(dto)>0?"suc":"err";
	}
	
	
	

}
