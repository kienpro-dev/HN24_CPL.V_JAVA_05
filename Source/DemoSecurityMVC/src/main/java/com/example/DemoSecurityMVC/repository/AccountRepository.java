package com.example.DemoSecurityMVC.repository;

import com.example.DemoSecurityMVC.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query("SELECT a FROM Account a WHERE a.username = ?1")
    Account findByUsername(String username);
}
