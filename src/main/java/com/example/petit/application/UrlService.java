package com.example.petit.application;

import com.example.petit.domain.Url;
import com.example.petit.infra.repositories.UrlRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService{

    private UrlRepository urlRepository;

    @Autowired
    public void setUrlRepository(UrlRepository urlRepository){
        this.urlRepository = urlRepository;
    }

    public Url Create(String url){
        Url existentUrl = urlRepository.findByOriginalURL(url);
        if(existentUrl == null){
            Url urlObject = new Url(url, RandomStringUtils.randomAlphanumeric(6), 0, 0);
            urlRepository.save(urlObject);
            return urlObject;
        }
        existentUrl.timesShortened = existentUrl.timesShortened + 1;
        urlRepository.save(existentUrl);
        return existentUrl;
    }

    public String Get(String shortUrl){
        Url url = urlRepository.findByShortURL(shortUrl);
        url.timesAccessed = url.timesAccessed + 1;
        urlRepository.save(url);
        return url.originalURL;
    }
}
