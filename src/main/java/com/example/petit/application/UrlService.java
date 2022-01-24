package com.example.petit.application;

import com.example.petit.domain.Url;
import com.example.petit.infra.repositories.UrlRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    private UrlRepository urlRepository;

    @Autowired
    public void setUrlRepository(UrlRepository urlRepository){
        this.urlRepository = urlRepository;
    }

    public void create(String url){
        urlRepository.save(new Url(url, RandomStringUtils.randomAlphanumeric(6)));
    }
}
