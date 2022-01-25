package com.example.petit.webApi.dataContracts.mapper;

import com.example.petit.domain.Url;
import com.example.petit.webApi.dataContracts.response.UrlResponse;
import org.mapstruct.Mapper;

@Mapper
public interface UrlMapper {
    public UrlResponse urlToUrlResponse(Url url);
}
