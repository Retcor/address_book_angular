package com.addressbook.service;

import com.addressbook.model.Address;
import com.addressbook.repository.AddressRepository;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

/**
 * User: daniel.baker
 * Date: 1/23/15
 * Time: 7:29 AM
 */
@Component("addressService")
@Transactional
public class AddressServiceImpl implements AddressService {
    @Resource
    AddressRepository addressRepository;

    @Override
    public void saveAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public List<Address> getAddresses() {
        return addressRepository.findAll();
    }
}
