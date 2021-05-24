package com.decolab.wanza.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.decolab.wanza.dto.SearchDTO;

@Mapper
@Repository
public interface SearchDAO {
	
	public List<SearchDTO> getSearchWord();
	
	public int searchWrite(SearchDTO dto);

}
