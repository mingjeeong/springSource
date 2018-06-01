package com.clustering.project.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class MemberService {

	public Object getObject(Object dataMap) {
		Map<String,Object> resultObject = new HashMap<String,Object>();
		resultObject.put("MEMBER_ID", "293029301202");
		resultObject.put("NAME", "name 02");
		return resultObject;
	}
	
	public List<Object> getList(Object dataMap){
		List<Object> resultObject = new ArrayList<Object>();
		Map<String,Object> data01 = new HashMap<String,Object>();
		data01.put("MEMBER_ID", "103029301202");
		data01.put("NAME", "name 01");
		data01.put("CELLPHONE", "01074218900");
		data01.put("EMAIL", "o@naver.com");
		resultObject.add(data01);
		
		Map<String,Object> data02 = new HashMap<String,Object>();
		data02.put("MEMBER_ID", "103029301203");
		data02.put("NAME", "name 02");
		data02.put("CELLPHONE", "01074218900");
		data02.put("EMAIL", "o@naver.com");
		resultObject.add(data02);
		
		Map<String,Object> data03 = new HashMap<String,Object>();
		data03.put("MEMBER_ID", "103029301204");
		data03.put("NAME", "name 03");
		data03.put("CELLPHONE", "01074218900");
		data03.put("EMAIL", "o@naver.com");
		resultObject.add(data03);
		
		return resultObject;
		
	}
	
}
