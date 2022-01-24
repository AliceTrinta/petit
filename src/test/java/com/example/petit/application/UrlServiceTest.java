package com.example.petit.application;

import com.example.petit.domain.Url;
import com.example.petit.infra.repositories.UrlRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UrlServiceTest {

    @Autowired
    private UrlRepository urlRepository;

    @Autowired
    private UrlService urlService;

    @Test
    public void Given_SomeUrl_When_CallingCreateMethod_Then_DatabaseCollectionShouldNotBeEmpty() {
        //For now, don't forget to clean your database

        //Arrange
        var url = "google.com";

        //Act
        urlService.Create(url);
        var list = urlRepository.findAll();

        //Assert
        assertFalse(list.isEmpty());
    }

    @Test
    public void Given_AValidShortUrl_When_CallingGetMethod_Then_ReturnAsExpected() {

        //Arrange
        var url = new Url("123", "321");
        urlRepository.save(url);

        //Act
        var result = urlService.Get(url.shortURL);

        //Assert
        assertEquals(url.originalURL, result);
    }
}
