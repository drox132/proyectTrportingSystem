package com.fran.reportingSystem.service;

import com.fran.reportingSystem.model.Consorcio;

import java.util.List;
import java.util.Optional;

public interface ConsorcioService {


    List<Consorcio>selectAllConsorcio();
    Consorcio selectAllConsorcioById(long id);
    Consorcio insertConsorcio(Consorcio newConsorcio);
    Consorcio updateConsorcioById(Consorcio updateConsorcio);
    String deleteConsorcioById(long id);



}
