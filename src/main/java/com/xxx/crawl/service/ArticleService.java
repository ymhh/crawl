package com.xxx.crawl.service;

import java.util.List;

import com.xxx.crawl.dto.ArticleInfoDTO;

public interface ArticleService {
	void saveArticles(List<ArticleInfoDTO> articles) ;
}
