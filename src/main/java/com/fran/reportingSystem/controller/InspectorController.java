package com.fran.reportingSystem.controller;

import com.fran.reportingSystem.model.Inspector;
import com.fran.reportingSystem.service.InspectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inspector")
public class InspectorController {

    private final InspectorService inspectorService;

    @Autowired
    public InspectorController(InspectorService inspectorService) {
        this.inspectorService = inspectorService;

    }

    @GetMapping("/selectallinspector")
    public List<Inspector>selectAllInspector(){
        List<Inspector> inspectors = inspectorService.selectAllInspector();
        return inspectors;
    }

    @GetMapping("/selectallinspectorby/{id}")
    public Inspector selectAllInspectorById (@PathVariable long id){
        return inspectorService.selectAllInspectorById(id);
    }

    @PostMapping("/insertinspector")
    public Inspector insertInspector(@RequestBody Inspector newInspector){
        return inspectorService.insertInspector(newInspector);
    }

    @PutMapping("/updateinspectorbyid")
    public Inspector updateInspectorById(@RequestBody Inspector updateInspector){
        return inspectorService.updateInspectorById(updateInspector);
    }

    @DeleteMapping ("/deleteinspectorby/{id}")
    public String delectInspectorById(@PathVariable long id){
        return inspectorService.deleteInspector(id);

    }


}
