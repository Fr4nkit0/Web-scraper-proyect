package com.example.service;

import com.example.persistence.entity.WebPage;

import java.util.List;

public interface ISearchService {
    public List<WebPage> search (String textSearch) ;
}
