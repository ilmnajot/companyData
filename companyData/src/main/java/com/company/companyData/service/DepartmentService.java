package com.company.companyData.service;

import com.company.companyData.entity.Department;
import com.company.companyData.repository.DepartmentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DepartmentService {
    private final DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

    public void deleteDepartmentById(Long id) {
        departmentRepository.deleteById(id);
    }

    public List<Department> getDepartmentALl() {
            return departmentRepository.findAll();
    }
}
