package com.example.petit.webApi;

import com.example.petit.application.UrlService;
import com.example.petit.domain.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UrlController {

    private UrlService urlService;

    @Autowired
    public void setUrlService(UrlService urlService){
        this.urlService = urlService;
    }

    @PostMapping(path = "/short")
    public ResponseEntity<Url> CreateShortUrl(@RequestParam String url){
        var param = urlService.create(url);
        var shortPiece = param.shortURL;
        param.shortURL = "localhost:8080/" + shortPiece;
        return ResponseEntity.ok(param);
    }

}
