package com.fran.reportingSystem.controller;

import com.fran.reportingSystem.model.Worker;
import com.fran.reportingSystem.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/worker")
public class WorkerController {

    private final WorkerService workerService;

    @Autowired
    public WorkerController(WorkerService workerService) {
        this.workerService = workerService;
    }

    @GetMapping("/selectallworker")
    List<Worker>selectAllWorker(){
        return workerService.selectAllWorker();
    }

    @GetMapping("/selectallworkerby/{id}")
    Worker selectAllWorkerById(@PathVariable long id){
        return workerService.selectAllWorkerById(id);
    }

    @PostMapping("/insertworker")
    public Worker insertWorker(@RequestBody Worker newWorker) {
        return workerService.insertWorker(newWorker);
    }

    @PutMapping("/updateworkerbyid")
    public Worker updateWorkerById(@RequestBody Worker updateWorker) {
        return workerService.updateWorkerById(updateWorker);
    }

    @DeleteMapping("/deleteworkerby/{id}")
    public String deleteWorkerByID(@PathVariable long id) {
        return workerService.deleteWorkerByID(id);

    }
}
