package com.company.companyData.service;

import com.company.companyData.entity.Address;
import com.company.companyData.repository.AddressRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AddressService {
    private final AddressRepository addressRepository;
    public Address saveAddress(Address address) {
            return addressRepository.save(address);
    }

    public Address getAddressById(Long id) {
        return addressRepository.findById(id).get();
    }

    public void deleteAddressById(Long id) {
        addressRepository.deleteById(id);

    }

    public List<Address> getAllAddress()
    {
                    return addressRepository.findAll();
    }
}
