package com.spring.appone.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.appone.repository.entity.Products;


public interface ProductRepository extends JpaRepository<Products,Integer>{

	public List<Products> findByCode(String code);
	public List<Products> findByName(String name);
	public List<Products> findByBrand(String brand);
	public List<Products> findByPriceLessThanEqual(double price);

	
}
