package com.example.petit.infra.repositories;

import com.example.petit.domain.Url;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<Url, String> { }
