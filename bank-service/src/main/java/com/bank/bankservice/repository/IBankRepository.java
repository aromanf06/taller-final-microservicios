package com.bank.bankservice.repository;

import com.bank.bankservice.model.Bank;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBankRepository extends ReactiveCrudRepository<Bank,Long> {
}
