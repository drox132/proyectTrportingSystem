package com.fran.reportingSystem.service.implementation;

import com.fran.reportingSystem.model.Worker;
import com.fran.reportingSystem.repository.WorkerRepository;
import com.fran.reportingSystem.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerServiceImplementation implements WorkerService {

    private final WorkerRepository workerRepository;

    @Autowired
    public WorkerServiceImplementation(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Override
    public List<Worker> selectAllWorker() {
        return workerRepository.selectAllWorker();
    }

    @Override
    public Worker selectAllWorkerById(long id) {
        return workerRepository.selectAllWorkerById(id);
    }

    @Override
    public Worker insertWorker(Worker newWorker) {
        return workerRepository.insertWorker(
                newWorker.getName(),newWorker.getCuil(),
                newWorker.getCbu(),newWorker.getPhone(),
                newWorker.getStartDate(),newWorker.getIdConsorcio());
    }

    @Override
    public Worker updateWorkerById(Worker updateWorker) {
        return workerRepository.updateWorkerById(
                updateWorker.getId(),updateWorker.getName(),updateWorker.getCuil(),
                updateWorker.getCbu(),updateWorker.getPhone(),
                updateWorker.getStartDate(),updateWorker.getIdConsorcio());
    }

    @Override
    public void deleteWorkerByID(long id) {
         workerRepository.deleteWorkerById(id);
    }
}
