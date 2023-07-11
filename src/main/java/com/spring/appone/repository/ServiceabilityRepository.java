package com.spring.appone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.appone.repository.entity.Serviceability;

@Repository
public interface ServiceabilityRepository extends JpaRepository<Serviceability, Integer>{
    List<Serviceability> findByPidAndPincodes(int pid ,int code);

}
