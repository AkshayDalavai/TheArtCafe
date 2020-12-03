package com.backend.theartcafebackend.repository;

import com.backend.theartcafebackend.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<Account,Integer> {
}
