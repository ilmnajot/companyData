package com.company.companyData.controller;

import com.company.companyData.entity.Company;
import com.company.companyData.service.CompanyService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/company")
@AllArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<Company> saveCompany(@RequestBody Company company){
        return new ResponseEntity<Company>(companyService.saveCompany(company), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompanyById(@PathVariable Long id){
        return new ResponseEntity<Company>(companyService.getCompanyById(id), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Company> deleteCompany(@PathVariable Long id){
        companyService.deleteCompanyDataById(id);
        return new ResponseEntity<Company>(HttpStatus.NO_CONTENT);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Company>> getAllCompany(){
        return new ResponseEntity<List<Company>> (companyService.getAll(), HttpStatus.OK);
    }

}
