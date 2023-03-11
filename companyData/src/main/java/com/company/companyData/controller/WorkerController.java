package com.company.companyData.controller;

import com.company.companyData.entity.Worker;
import com.company.companyData.service.WorkerService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/worker")
@AllArgsConstructor
public class WorkerController {
    private final WorkerService workerService;
    @PostMapping
    public ResponseEntity<Worker> saveWorker(@RequestBody Worker worker){
        return new ResponseEntity<Worker>(workerService.saveWorker(worker), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Worker> getWorker(@PathVariable Long id){
        return new ResponseEntity<Worker>(workerService.getWorker(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Worker> deleteWorker(@PathVariable Long id){
        workerService.deleteWorkerById(id);
        return new ResponseEntity<Worker>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Worker>> getAllWorkers(){
        return new ResponseEntity<List<Worker>>(workerService.getWorkers(), HttpStatus.OK);
    }



}
