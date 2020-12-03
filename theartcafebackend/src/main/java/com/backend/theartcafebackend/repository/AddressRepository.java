package com.backend.theartcafebackend.repository;

import com.backend.theartcafebackend.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
    //Integer has to be changed
}
