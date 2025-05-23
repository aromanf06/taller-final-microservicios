package com.bank.bankservice.service;


import com.bank.bankservice.model.Bank;
import com.bank.bankservice.repository.IBankRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {
    private final IBankRepository bankRepository;

    public BankService(IBankRepository bankRepository){
        this.bankRepository=bankRepository;
    }

    public List<Bank> getAll(){
        return bankRepository.findAll();
    }
}
