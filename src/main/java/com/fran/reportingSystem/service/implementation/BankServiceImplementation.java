package com.fran.reportingSystem.service.implementation;

import com.fran.reportingSystem.model.Bank;
import com.fran.reportingSystem.repository.BankRepository;
import com.fran.reportingSystem.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankServiceImplementation implements BankService {

    private final BankRepository bankRepository;

    @Autowired
    public BankServiceImplementation(BankRepository bankRepository) {
        this.bankRepository = bankRepository;
    }

    @Override
    public List<Bank> selectAllBank() {
        return bankRepository.selectAllBank();
    }

    @Override
    public Bank selectAllBanById(long id) {
        return bankRepository.selectAllBankById(id);
    }

    @Override
    public Bank insertBank(String name) {
        return bankRepository.insertBank(name);
    }

    @Override
    public void deleteBankById(long id) {
         bankRepository.deleteBankById(id);
    }
}
