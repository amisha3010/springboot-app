package com.spring.appone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.appone.repository.ServiceabilityRepository;
import com.spring.appone.repository.entity.Serviceability;

@RestController
@CrossOrigin
public class ServiceabilityController {
	
	@Autowired
	private ServiceabilityRepository serviceabilityRepo;
	
	//check estimated days using pincode and pid
	@RequestMapping("/service/{pid}/{code}")
	public List<Serviceability> getID(@PathVariable("pid") int pid, @PathVariable("code") int code)
	{
		return serviceabilityRepo.findByPidAndPincodes(pid,code);

	}
	@RequestMapping("/service/{pid}")
	public Optional<Serviceability> getID(@PathVariable("pid") int pid)
	{
		return serviceabilityRepo.findById(pid);

	}


}
