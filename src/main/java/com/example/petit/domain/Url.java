package com.example.petit.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("url")
public class Url {

    public Url(String originalURL, String shortURL, int timesShortened, int timesAccessed){
        this.originalURL = originalURL;
        this.shortURL = shortURL;
        this.timesShortened = timesShortened;
        this.timesAccessed = timesAccessed;
    }

    @Id
    public ObjectId id;

    @Field("originalURL")
    public String originalURL;

    @Field("shortURL")
    public String shortURL;

    @Field("timesShortened")
    public int timesShortened;

    @Field("timesAccessed")
    public int timesAccessed;

    public ObjectId getId() { return id; }

    public void setId(ObjectId id) { this.id = id; }

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
