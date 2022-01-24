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
    public void shouldBeNotEmpty() {
        //For now, don't forget to clean your database
        urlService.create("google.com");
        var list = urlRepository.findAll();
        assertFalse(list.isEmpty());
    }

}
