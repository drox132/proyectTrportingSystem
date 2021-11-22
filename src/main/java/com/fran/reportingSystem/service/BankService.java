package com.fran.reportingSystem.service;

import com.fran.reportingSystem.model.Bank;

import java.util.List;

public interface BankService {

    List<Bank>selectAllBank();
    Bank selectAllBanById(long id);
    Bank insertBank(String name);
    void deleteBankById(long id);
}
