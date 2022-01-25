package com.example.petit.webApi.dataContracts.response;

public class UrlResponse {

    public UrlResponse(String originalURL, String shortURL, int timesShortened, int timesAccessed){
        this.originalURL = originalURL;
        this.shortURL = shortURL;
        this.timesShortened = timesShortened;
        this.timesAccessed = timesAccessed;
    }

    public String originalURL;

    public String shortURL;

    public int timesShortened;

    public int timesAccessed;

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

    public int getTimesShortened() { return timesShortened; }

    public void setTimesShortened(int timesShortened) { this.timesShortened = timesShortened; }

    public int getTimesAccessed() { return timesAccessed; }

    public void setTimesAccessed(int timesAccessed) { this.timesAccessed = timesAccessed; }
}
