package com.fran.reportingSystem.controller;

import com.fran.reportingSystem.model.Bank;
import com.fran.reportingSystem.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/bank")
public class BankController {
    private final BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @GetMapping("/selectallbank")
    List<Bank> selectAllBank (){
        return bankService.selectAllBank();
    }

    @GetMapping("/selectallbankby/{id}")
    Bank selectAllBankById(@PathVariable long id){
        return bankService.selectAllBanById(id);
    }

    @PostMapping("/insertbank/{name}")
    public Bank insertBank(@PathVariable String name) {
        return bankService.insertBank(name);
    }

    @DeleteMapping("/deletebank/{id}")
    public String deleteBankById(@PathVariable long id) {
         bankService.deleteBankById(id);
        return "The bank has been deleted";

    }
}
