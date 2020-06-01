package com.mega.mvc08;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ReplyDAO {

		@Autowired
		SqlSessionTemplate my;
		
		public List<ReplyDTO> all(ReplyDTO dto) {
			List<ReplyDTO> list = my.selectList("reply.all",dto);
			return list;
		}
		
		public void add(ReplyDTO dto) {
			my.insert("reply.add", dto);
		}
}
