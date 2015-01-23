package com.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.addressbook.model.Address;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

/**
 * User: daniel.baker
 * Date: 1/22/15
 * Time: 4:24 PM
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
