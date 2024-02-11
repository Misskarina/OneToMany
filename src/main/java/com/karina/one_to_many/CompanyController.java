package com.karina.one_to_many;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@Autowired
	CompanyRepository crepo;
	@Autowired
	ProductRepository prepo;
	
	@RequestMapping("/save")
	public String save()
	{
		Company c=new Company();
		c.setCname("Sudha");
		
		Product p=new Product();
		p.setPname("Milk");
		p.setPqty(40);
		p.setPrice(1200);
		
		Product p1=new Product();
		p1.setPname("Curd");
		p1.setPqty(20);
		p1.setPrice(200);
		
		Product p2=new Product();
		p2.setPname("Rabdi");
		p2.setPqty(50);
		p2.setPrice(3200);
		
		
		Product p3=new Product();
		p3.setPname("Lassi");
		p3.setPqty(14);
		p3.setPrice(1400);
		
		List<Product> data=new ArrayList<Product>();
		data.add(p);data.add(p1);data.add(p2);data.add(p3);
		
		c.setProduct(data);
		p.setComapny(c);
		p1.setComapny(c);
		p2.setComapny(c);
		p3.setComapny(c);
		
		crepo.save(c);
		return"data saved";
		
	}
	
	@RequestMapping("/all")
	public List<Product> all()
	{
		return prepo.findAll();
	}
	
	@RequestMapping("/hi/{id}")
	public Company byid(@PathVariable int id)
	{
		return crepo.findById(id);
	}
	
	@RequestMapping("/new/{pid}")
	public List<Product> newby(@PathVariable int pid)
	{
		return prepo.findByPid(pid);
	}
	
	@RequestMapping("/some/{pname}")
	public List<Product> someby(@PathVariable String pname)
	{
		return prepo.findByPname(pname);
	}
}
