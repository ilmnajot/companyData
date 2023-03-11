package com.company.companyData.controller;

import com.company.companyData.entity.Address;
import com.company.companyData.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/address")
@AllArgsConstructor
public class AddressController {

    private final AddressService addressService;

    @PostMapping
    public ResponseEntity<Address> saveAddress(@RequestBody Address address){
        return new ResponseEntity<Address>(addressService.saveAddress(address), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Address> getAddress(@PathVariable Long id){
        return new ResponseEntity<Address>(addressService.getAddressById(id),HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Address> deleteAddress(@PathVariable Long id){
        addressService.deleteAddressById(id);
        return new ResponseEntity<Address> (HttpStatus.NO_CONTENT);
    }
    @GetMapping
    public ResponseEntity<List<Address>> getAddresses(){
        return new ResponseEntity<List<Address>> (addressService.getAllAddress(), HttpStatus.OK);
    }

}
