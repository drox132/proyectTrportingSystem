package com.fran.reportingSystem.service;

import com.fran.reportingSystem.model.Inspector;

import java.util.List;

public interface InspectorService {

    List<Inspector>selectAllInspector();
    Inspector selectAllInspectorById(long id);
    Inspector insertInspector(Inspector newInspector);
    Inspector updateInspectorById(Inspector updateInspector);
    void deleteInspector (long id);


}
