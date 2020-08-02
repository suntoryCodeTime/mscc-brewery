package com.suntorycodetime.msccbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * Project Lombok Annotations to Remove Boilerplate Code
 * Need to enable annotation processing in intellij so
 * that project lombock can hook into the java compiler and
 * generate the code at compile time dictated by the annotations
 * */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;
}
