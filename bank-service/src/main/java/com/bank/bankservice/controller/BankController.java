package com.bank.bankservice.controller;

import com.bank.bankservice.model.Bank;
import com.bank.bankservice.service.BankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/banks")
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService){
        this.bankService=bankService;
    }

    @GetMapping
    public List<Bank> getAll(){
        return bankService.getAll();
    }
}
