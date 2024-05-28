package com.techlabs.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.hibernate.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
