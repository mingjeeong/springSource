package com.clustering.project.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/commonCode")
public class CommonCodeController {

	
/*	 @RequestMapping(value="/edit",method= {RequestMethod.GET,
	 RequestMethod.POST}) public void edit() {
	 }

	@RequestMapping(value = "/list", method = { RequestMethod.GET, RequestMethod.POST })
	public void list() {
	}*/

	@RequestMapping(value = "/{action}")
	public ModelAndView edit(@RequestParam Map<String, Object> paramMap, @PathVariable String action,
			ModelAndView modelandView) {
		String viewName = "/commonCode/";
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Object> resultList = new ArrayList<Object>();
		if ("read".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultMap = paramMap;
		}
		else if ("edit".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultMap = paramMap;
		}else if ("list".equalsIgnoreCase(action)) {
			viewName = viewName + action;
			resultMap = paramMap;
			
			Map<String,Object> data01 = new HashMap<String,Object>();
			data01.put("NAME", "name01");
			data01.put("COMMON_CODE_ID", "01074218901");
			data01.put("DESCRIPTION", "anything DESCRIPTION 01");
			resultList.add(data01);
			
			Map<String,Object> data02 = new HashMap<String,Object>();
			data02.put("NAME", "name02");
			data02.put("COMMON_CODE_ID", "01074218902");
			data02.put("DESCRIPTION", "anything DESCRIPTION 02");
			resultList.add(data02);
			
			Map<String,Object> data03 = new HashMap<String,Object>();
			data03.put("NAME", "name03");
			data03.put("COMMON_CODE_ID", "01074218903");
			data03.put("DESCRIPTION", "anything DESCRIPTION 03");
			resultList.add(data03);
			
			modelandView.addObject("resultList", resultList);
			
		}else {
			viewName = viewName + "list";
			resultMap = paramMap;
		}
		modelandView.setViewName(viewName);
		modelandView.addObject("resultMap", resultMap);
		
		
		return modelandView;
	}

}
