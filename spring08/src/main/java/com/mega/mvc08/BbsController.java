package com.mega.mvc08;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsDAO dao;

	@Autowired
	ReplyDAO dao2;

	@RequestMapping("select2.do")
	public void select2(String id, Model model, HttpSession session, ReplyDTO replyDTO) {
		session.setAttribute("writer", "park");
		BbsDTO dto = dao.select2(id);
		replyDTO.setBbsNum(id);
		List<ReplyDTO> list2 = dao2.all(replyDTO);
		model.addAttribute("dto", dto);
		model.addAttribute("list2", list2);
	}

	@RequestMapping("select.do")
	public void select(Model model) {
		List<BbsDTO> list = dao.select();
		model.addAttribute("list", list);
	}

	@RequestMapping("insert.do")
	public void insert(BbsDTO bbsDTO) {
		dao.insert(bbsDTO);
	}

	@RequestMapping("delete.do")
	public void delete(BbsDTO bbsDTO) {
		dao.delete(bbsDTO);
	}

	@RequestMapping("delete2.do")
	public void delete2(String id) {
		dao.delete2(id);
	}

	@RequestMapping("update.do")
	public void update(BbsDTO bbsDTO) {
		dao.update(bbsDTO);
	}
}
