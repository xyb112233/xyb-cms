package com.xyb.cms.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xyb.cms.domain.Article;
import com.xyb.cms.service.ArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class ArticleMapperTest {
	
	@Resource
	private ArticleService atricleService;
	
	@Test
	public void testSelects() {
		List<Article> selects = atricleService.selects();
		System.err.println(selects);
	}

}
