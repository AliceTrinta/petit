package com.example.petit.webApi;

import com.example.petit.application.UrlService;
import com.example.petit.domain.Url;
import com.example.petit.webApi.dataContracts.mapper.UrlMapper;
import com.example.petit.webApi.dataContracts.response.UrlResponse;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class UrlController {

    private UrlService urlService;

    @Autowired
    public void setUrlService(UrlService urlService){
        this.urlService = urlService;
    }

    private UrlMapper mapper = Mappers.getMapper(UrlMapper.class);

    @PostMapping(path = "/short")
    public ResponseEntity<UrlResponse> CreateShortUrl(@RequestParam String url){
        Url param = urlService.Create(url);
        String shortPiece = param.shortURL;
        param.shortURL = "localhost:8080/" + shortPiece;
        UrlResponse result = mapper.urlToUrlResponse(param);
        return ResponseEntity.ok(result);
    }

    @GetMapping(path = "/{shortUrl}")
    public ResponseEntity GetOriginalUrl(@PathVariable String shortUrl){
        String originalUrl = urlService.Get(shortUrl);
        return ResponseEntity.status(HttpStatus.FOUND)
                .location(URI.create(originalUrl))
                .build();
    }

}
