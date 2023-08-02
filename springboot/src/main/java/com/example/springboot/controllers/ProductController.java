package com.example.springboot.controllers;

import org.apache.catalina.connector.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.dtos.ProductRecordDto;
import com.example.springboot.models.ProductModel;
import com.example.springboot.repositories.ProductRepository;

import jakarta.validation.Valid;

@RestController
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;
    
    @PostMapping("/products") //video at 1:00:10
    public ResponseEntity<ProductModel> saveProduct(@RequestBody @Valid ProductRecordDto)
    var productModel = new ProductModel();
    BeanUtils.copyProperties(ProductRecordDto, productModel);
    return ResponseEntity.status(HttpStatusCode.CREATED).body(productRepository.save)
}
