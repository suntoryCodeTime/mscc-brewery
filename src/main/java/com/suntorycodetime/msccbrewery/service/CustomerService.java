package com.suntorycodetime.msccbrewery.service;

import com.suntorycodetime.msccbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
