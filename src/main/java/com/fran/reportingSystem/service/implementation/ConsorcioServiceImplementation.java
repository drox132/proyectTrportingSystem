package com.fran.reportingSystem.service.implementation;

import com.fran.reportingSystem.model.Consorcio;
import com.fran.reportingSystem.repository.ConsorcioRepository;
import com.fran.reportingSystem.service.ConsorcioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsorcioServiceImplementation implements ConsorcioService {

    private final ConsorcioRepository consorcioRepository;

    @Autowired
    public ConsorcioServiceImplementation(ConsorcioRepository consorcioRepository) {
        this.consorcioRepository = consorcioRepository;
    }

    @Override
    public List<Consorcio> selectAllConsorcio() {
        return consorcioRepository.selectAllConsorcio();
    }

    @Override
    public Consorcio selectAllConsorcioById(long id) {
        Consorcio consorcio= consorcioRepository.selectAllConsorcioById(id).orElseThrow(IllegalStateException::new);
        return consorcio;
    }

    @Override
    public Consorcio insertConsorcio(Consorcio newConsorcio) {
        return consorcioRepository.insertConsorcio(
                newConsorcio.getName(), newConsorcio.getCuit(),
                newConsorcio.getCbu(),newConsorcio.getEmail(),
                newConsorcio.getIdInspector(),newConsorcio.getIdBank());
    }

    @Override
    public Consorcio updateConsorcioById(Consorcio updateConsorcio) {
        return consorcioRepository.updateConsorcioById(
                updateConsorcio.getId(),updateConsorcio.getName(),
                updateConsorcio.getCuit(),updateConsorcio.getCbu(),
                updateConsorcio.getEmail(),updateConsorcio.getIdInspector(),
                updateConsorcio.getIdBank());
    }

    @Override
    public String deleteConsorcioById(long id) {
         return consorcioRepository.deleteConsorcioById(id);
    }


}
