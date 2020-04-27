package com.xyb.cms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xyb.cms.dao.ArticleMapper;
import com.xyb.cms.domain.Article;
import com.xyb.cms.service.ArticleService;


@Service
public class ArticleServiceImpl implements ArticleService {

	@Resource
	ArticleMapper articleMapper;
	
	@Override
	public List<Article> selects() {
		// TODO Auto-generated method stub
		return articleMapper.selects();
	}

}
