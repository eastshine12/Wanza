package com.decolab.wanza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.decolab.wanza.dao.AdminSalesDAO;
import com.decolab.wanza.dto.admin.AdminSalesDTO;



@Service
@Transactional
public class AdminSalesService{
	
	@Autowired
	AdminSalesDAO dao;
	
	public List<AdminSalesDTO> graphList(AdminSalesDTO dto){
		return dao.graphList(dto);
	}
	public List<AdminSalesDTO> mapList(AdminSalesDTO dto){
		return dao.mapList(dto);
	}
	
	public List<AdminSalesDTO> pieChart(AdminSalesDTO dto){
		return dao.pieChart(dto);
	}

	public List<AdminSalesDTO> salesCompare(AdminSalesDTO dto){
		return dao.salesCompare(dto);
	}
	public List<AdminSalesDTO> salesPrice(AdminSalesDTO dto){
		return dao.salesPrice(dto);
	}
}
