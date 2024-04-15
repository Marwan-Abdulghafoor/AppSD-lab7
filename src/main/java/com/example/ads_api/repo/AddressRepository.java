package com.example.ads_api.repo;


import com.example.ads_api.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
    public Address findByZip(String zip);
}
