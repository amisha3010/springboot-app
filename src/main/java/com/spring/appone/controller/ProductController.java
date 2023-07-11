package com.spring.appone.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.appone.repository.ProductRepository;
import com.spring.appone.repository.entity.Products;
import com.spring.appone.repository.entity.Users;

@RestController
@CrossOrigin
public class ProductController {
	
@Autowired
private ProductRepository productRepo;

//get all products
@GetMapping("/products")
public List<Products> getAllProducts(){
	return productRepo.findAll();	
}

//find by name
@RequestMapping("products/names/{name}")
public List<Products> getName(@PathVariable("name") String name)
{
	return productRepo.findByName(name);	
}
@PostMapping("/products/add")
public Products addUser(@RequestBody Products product)

{
	return productRepo.save(product);
}
//find by id
@RequestMapping("/products/id/{id}")
public Optional<Products> getID(@PathVariable("id") int id)
{
	return productRepo.findById(id);
}

//find by code
@RequestMapping("/products/code/{code}")
public List<Products> getCode(@PathVariable("code") String code)
{
	return productRepo.findByCode(code);

}

@RequestMapping("/products/brands/{brand}")
public List<Products> getBrand(@PathVariable("brand") String brand)
{
	return productRepo.findByBrand(brand);

}



@RequestMapping("/products/price/{price}")
public List<Products> getPrice(@PathVariable("price") double price)
{
	return productRepo.findByPriceLessThanEqual(price);

}

}
