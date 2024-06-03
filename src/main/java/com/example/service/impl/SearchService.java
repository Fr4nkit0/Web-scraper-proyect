package com.example.service.impl;

import com.example.persistence.entity.WebPage;
import com.example.persistence.repository.SearchRepository;
import com.example.service.ISearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService implements ISearchService {
    private final SearchRepository searchRepository ;

    @Autowired
    public SearchService(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @Override
    public List<WebPage> search(String textSearch) {
        return searchRepository.findByDescriptionContaining(textSearch);
    }
}
