package com.fran.reportingSystem.service;

import com.fran.reportingSystem.model.Worker;

import java.util.List;

public interface WorkerService {

    List<Worker>selectAllWorker();
    Worker selectAllWorkerById(long id);
    Worker insertWorker (Worker newWorker);
    Worker updateWorkerById(Worker uodateWorker);
    void deleteWorkerByID(long id);
}
