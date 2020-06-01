package com.mega.mvc08;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	
	public BbsDTO select2(String id) {
		BbsDTO dto = my.selectOne("bbs.select2", id);
		return dto;
	}
	public List<BbsDTO> select() {
		List<BbsDTO> list = my.selectList("bbs.select");
		return list;
	}
	public void insert(BbsDTO dto) {
		my.insert("bbs.insert", dto);
	}
	public void delete(BbsDTO dto) {
		my.delete("bbs.delete",dto);
	}
	public void delete2(String id) {
		my.delete("bbs.delete2",id);
	}
	public void update(BbsDTO dto) {
		my.update("bbs.update",dto);
		
	}
	
}
