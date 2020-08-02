package com.suntorycodetime.msccbrewery.service;

import com.suntorycodetime.msccbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID()).
                beerName("Corona").
                beerStyle("Blonde").
                build();
    }
}
