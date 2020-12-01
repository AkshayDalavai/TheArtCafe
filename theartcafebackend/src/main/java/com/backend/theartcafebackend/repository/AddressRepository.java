package com.backend.theartcafebackend.repository;

import com.backend.theartcafebackend.entity.Address;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends ReactiveMongoRepository<Address, Integer> {
}
