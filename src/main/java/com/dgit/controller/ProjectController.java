package com.dgit.controller;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.dgit.domain.ProjectVO;
import com.dgit.service.ProjectService;



@Controller
@RequestMapping("/project/*")
public class ProjectController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProjectController.class);
	
	@Autowired
	ProjectService service;
	
	@RequestMapping(value = "listPage", method = RequestMethod.GET)
	public String listPage(Model model) throws Exception {
		logger.info("=============List Page=============");
		
		
		
		model.addAttribute("list", service.selectAll() );
		
		return "project/listPage";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerGET() throws Exception{
		return "project/register";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerPOST(ProjectVO vo) throws Exception{
		logger.info("=============Register Post=============");
		
		service.insert(vo);
		logger.info(vo.toString());
		return "redirect:listPage";
	}
	
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public String read(int no, Model model) throws Exception{
		ProjectVO vo = service.selectByNo(no);
		
		model.addAttribute("project", vo);
		return "project/read";
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String delete(int no) throws Exception{
		service.delete(no);
		
		return "redirect:listPage";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String modifyGET(int no,Model model) throws Exception{
		ProjectVO vo = service.selectByNo(no);
		
		model.addAttribute("project", vo);
		return "project/modify";
	}
	
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modifyPOST(ProjectVO vo,RedirectAttributes rttr) 	throws Exception{
		
		System.out.println("=======MOD POST========");
		System.out.println("vo:"+vo.toString());
		service.update(vo);
		
		rttr.addAttribute("no", vo.getProjectno());
		System.out.println("no:"+vo.getProjectno());
		return "redirect:read";
		
	}
	
}
