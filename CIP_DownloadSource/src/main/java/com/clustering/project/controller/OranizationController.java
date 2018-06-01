package com.clustering.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.clustering.project.javabean.OrganizationBean;

@Controller
public class OranizationController {

	@RequestMapping(value="/organization/edit")
	public void edit() {
		
	}
	
	@RequestMapping(value="/organization/list")
	public void list() {
		
	}
	@RequestMapping(value="/organization/read", method = { RequestMethod.POST,RequestMethod.GET})
	public ModelAndView read(OrganizationBean paramMap, ModelAndView modelandView) {
		String viewName = "/organization/read";
		modelandView.setViewName(viewName);
		modelandView.addObject("paramMap", paramMap);
		return modelandView;
	}
}
