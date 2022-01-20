package com.example.petit.domain;

public class URL {

    public URL(String originalURL, String shortURL){
        this.originalURL = originalURL;
        this.shortURL = shortURL;
    }

    public String originalURL;

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
