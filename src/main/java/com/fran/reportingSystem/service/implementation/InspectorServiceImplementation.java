package com.fran.reportingSystem.service.implementation;

import com.fran.reportingSystem.model.Inspector;
import com.fran.reportingSystem.repository.InspectorRepository;
import com.fran.reportingSystem.service.InspectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InspectorServiceImplementation implements InspectorService {

    private final InspectorRepository inspectorRepository;

    @Autowired
    public InspectorServiceImplementation(InspectorRepository inspectorRepository) {
        this.inspectorRepository = inspectorRepository;
    }

    @Override
    public List<Inspector> selectAllInspector() {
        List<Inspector> inspectors = inspectorRepository.selectAllInspector();
        return inspectors;
    }

    @Override
    public Inspector selectAllInspectorById(long id) {
        return inspectorRepository.selectAllInspectById(id);
    }

    @Override
    public Inspector insertInspector(Inspector newInspector) {
        return inspectorRepository.insertInspector(
                newInspector.getName(),newInspector.getStartDate(),
                newInspector.getPhone(),newInspector.getEmail());
    }

    @Override
    public Inspector updateInspectorById(Inspector updateInspector) {
        return inspectorRepository.updateInspectorById(
                updateInspector.getId(),updateInspector.getName(),
                updateInspector.getStartDate(),updateInspector.getPhone(),
                updateInspector.getEmail());
    }

    @Override
    public String deleteInspector(long id) {
         return inspectorRepository.deleteInspectorById(id);
    }
}
