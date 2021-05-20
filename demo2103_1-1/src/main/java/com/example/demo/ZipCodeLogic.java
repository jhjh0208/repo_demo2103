package com.example.demo;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
@Service
public class ZipCodeLogic {
	Logger logger = LogManager.getLogger(ZipCodeLogic.class);
	@Autowired(required=false)
	ZipCodeDao zipCodeDao = null;
	public List<Map<String,Object>> getZipCodeList(){
		List<Map<String,Object>> zipList = null;
		zipList = zipCodeDao.getZipCodeList();
		return zipList;
	}

}
