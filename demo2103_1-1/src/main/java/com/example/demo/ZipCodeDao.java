package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ZipCodeDao {
	private static final String NAMESPACE = "com.example.demo.";
	Logger logger = LogManager.getLogger(ZipCodeDao.class);
	@Autowired(required=false)
	private SqlSession sqlSession = null;
	public List<Map<String,Object>> getZipCodeList(){
		logger.info("getZipcodeList 호출 성공");
		List<Map<String,Object>> zipList = null;
		
//		zipList = new ArrayList<>();
//		Map<String,Object> rmap = new HashMap<>();
//		rmap.put("mem_nmae", "이순신");
//		zipList.add(rmap);
//		rmap=null;
//		rmap=new HashMap<>();
//		rmap.put("good_nmae", "비누");
//		zipList.add(rmap);
//		zipList = null;
		
		zipList = sqlSession.selectList(NAMESPACE+"refreshData");
		
		return zipList;
	}
}
