package com.addressbook.service;

import com.addressbook.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * User: daniel.baker
 * Date: 1/23/15
 * Time: 7:19 AM
 */
@Service
public interface AddressService {
    void saveAddress(Address address);
    List<Address> getAddresses();
}
