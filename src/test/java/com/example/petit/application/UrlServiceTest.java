package com.example.petit.application;

import com.example.petit.infra.repositories.UrlRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
        urlService.create(url);
        var list = urlRepository.findAll();

        //Assert
        assertFalse(list.isEmpty());
    }
}
