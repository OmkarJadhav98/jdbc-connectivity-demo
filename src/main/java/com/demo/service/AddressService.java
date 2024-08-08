
package com.demo.service;

import com.demo.model.Address;
import com.demo.repository.AddressRepository;

import java.util.List;

public class AddressService {

    private static final AddressRepository ADDRESS_REPO = new AddressRepository();

    public List<Address> retrieveAddresses() {
        return ADDRESS_REPO.retrieveAddresses();
    }
}
