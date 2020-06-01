package com.mega.mvc08;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommentDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public void all() {
		 List<CommentDTO> list = my.selectList();
	}
	
}
