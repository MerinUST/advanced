package com.example.awsrds.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.awsrds.Resourse.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
	

}
