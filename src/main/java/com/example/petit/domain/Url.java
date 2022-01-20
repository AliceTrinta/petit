package com.example.petit.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("url")
public class Url {

    public Url(String originalURL, String shortURL){
        this.originalURL = originalURL;
        this.shortURL = shortURL;
    }

    @Field("originalURL")
    public String originalURL;

    @Field("shortURL")
    public String shortURL;

    public String getOriginalURL() {
        return originalURL;
    }

    public void setOriginalURL(String originalURL) {
        this.originalURL = originalURL;
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }
}
