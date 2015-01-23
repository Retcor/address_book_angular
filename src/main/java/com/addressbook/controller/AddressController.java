package com.addressbook.controller;

import com.addressbook.model.Address;
import com.addressbook.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: daniel.baker
 * Date: 1/19/15
 * Time: 2:02 PM
 */
@RestController
public class AddressController {
    @Resource
    AddressService addressService;

    @RequestMapping("/main")
    public List<Address> index() {
        List<Address> people = addressService.getAddresses();
        return people;
    }

    @RequestMapping(value="/save", method = RequestMethod.POST)
    public void save(@RequestBody final Address address) {
        addressService.saveAddress(address);
    }
}
