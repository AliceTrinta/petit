package com.example.petit.infra.repositories;

import com.example.petit.domain.Url;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends MongoRepository<Url, String> {
    public Url findByShortURL(String shortURL);
}
