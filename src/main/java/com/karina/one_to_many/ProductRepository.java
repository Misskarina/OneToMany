package com.karina.one_to_many;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{

	List<Product> findByPid(int pid);

	List<Product> findByPname(String pname);

	

}
