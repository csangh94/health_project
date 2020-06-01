package com.mega.mvc08;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReplyController {
	@Autowired
	ReplyDAO dao;

		
	@RequestMapping("all.do")
	public void all(ReplyDTO replyDTO,Model model) {
		 List<ReplyDTO> list2 = dao.all(replyDTO);
		 model.addAttribute("list2",list2);
	}
	@RequestMapping("add.do")
	public void add(ReplyDTO replyDTO) {
		System.out.println(replyDTO);
		dao.add(replyDTO);
	}
}
