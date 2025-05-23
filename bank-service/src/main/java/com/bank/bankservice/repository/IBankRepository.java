package com.bank.bankservice.repository;

import com.bank.bankservice.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBankRepository extends JpaRepository<Bank,Long> {
}
