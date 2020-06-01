package com.mega.mvc08;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommentController {
	
	@Autowired
	CommentDAO dao;
	
	@RequestMapping("comment.do")
	public void all(Model model) {
		List<CommentDTO> list = dao.all();
		model.addAttribute("list", list);
	}
}
