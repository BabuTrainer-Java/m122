package demo122;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import beans.IProductService;
import beans.Product;
import beans.ProductService;

import  java.util.*;
@RestController
public class HelloController {


// @Autowired
IProductService iproductService=new ProductService();
	
	@GetMapping("/productall")
	public List<Product> m1()
	{
        System.out.println("welcom m1");
        System.out.println("welcom m1");
		return iproductService.findAll();
	}
	
	@GetMapping("product/{id}")
	public Product m2(@PathVariable("id") int id)
	{
		 System.out.println("welcom m2");
		return iproductService.getProduct(id);
	}
	
	
	
}
