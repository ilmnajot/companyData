package com.company.companyData.service;

import com.company.companyData.entity.Company;
import com.company.companyData.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CompanyService {
    private final CompanyRepository companyRepository;
    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company getCompanyById(Long id) {
            return companyRepository.findById(id).get();
    }

    public void deleteCompanyDataById(Long id) {
        companyRepository.deleteById(id);

    }

    public List<Company> getAll() {
            return companyRepository.findAll();
    }
}
