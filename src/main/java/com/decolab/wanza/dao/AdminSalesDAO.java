package com.decolab.wanza.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.admin.AdminSalesDTO;

@Mapper
@Repository
public interface AdminSalesDAO {
	
	public List<AdminSalesDTO> graphList(AdminSalesDTO dto);
	public List<AdminSalesDTO> mapList(AdminSalesDTO dto);
	public List<AdminSalesDTO> pieChart(AdminSalesDTO dto);
	public List<AdminSalesDTO> salesCompare(AdminSalesDTO dto);

}
