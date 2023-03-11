package com.company.companyData.service;

import com.company.companyData.entity.Worker;
import com.company.companyData.repository.WorkerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class WorkerService {
    private final WorkerRepository workerRepository;
    public Worker saveWorker(Worker worker) {
        return workerRepository.save(worker);
    }

    public Worker getWorker(Long id) {
            return workerRepository.findById(id).get();
    }

    public void deleteWorkerById(Long id) {
        workerRepository.deleteById(id);

    }

    public List<Worker> getWorkers() {
        return workerRepository.findAll();
    }
}
