package com.company.companyData.controller;

import com.company.companyData.entity.Department;
import com.company.companyData.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/department")
@AllArgsConstructor
public class DepartmentController {

    private final DepartmentService departmentService;
    @PostMapping
    public ResponseEntity<Department> saveDepartment(@RequestBody Department department){
        return new ResponseEntity<Department>(departmentService.saveDepartment(department), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Department> getDepartment(@PathVariable Long id){
        return new ResponseEntity<Department> (departmentService.getDepartmentById(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Department> deleteDepartment(@PathVariable Long id){
        departmentService.deleteDepartmentById(id);
        return new ResponseEntity<Department>(HttpStatus.NO_CONTENT);
    }
    @GetMapping
    public ResponseEntity<List<Department>> getAllDepartment(){
        return new ResponseEntity<List<Department>> (departmentService.getDepartmentALl(), HttpStatus.OK);
    }

}
