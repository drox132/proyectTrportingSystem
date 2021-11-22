package com.fran.reportingSystem.controller;

import com.fran.reportingSystem.model.Consorcio;
import com.fran.reportingSystem.service.ConsorcioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consorcio")
public class ConsorcioController {

    private final ConsorcioService consorcioService;

    @Autowired
    public ConsorcioController(ConsorcioService consorcioService) {
        this.consorcioService = consorcioService;
    }

    @GetMapping("/selectallconsorcio")
    List<Consorcio> selectAllConsorcio(){
        return consorcioService.selectAllConsorcio();
    }

    @GetMapping("/selectallconsorcioby/{id}")
    Consorcio selectAllConsorcioById(@PathVariable long id){
        return consorcioService.selectAllConsorcioById(id);
    }

    @PostMapping("/insertconsorcio")
    public Consorcio insertConsorcio(@RequestBody Consorcio newConsorcio) {
        return consorcioService.insertConsorcio(newConsorcio);
    }
    @PutMapping("/updateconsorciobyid")
    public Consorcio updateConsorcioById(@RequestBody Consorcio updateConsorcio) {
        return consorcioService.updateConsorcioById(updateConsorcio);
    }
    @DeleteMapping("/deleteconsorcioby/{id}")
    public String deleteConsorcioById(@PathVariable long id) {
        consorcioService.deleteConsorcioById(id);
        return "The consortium has been deleted";
    }

}
