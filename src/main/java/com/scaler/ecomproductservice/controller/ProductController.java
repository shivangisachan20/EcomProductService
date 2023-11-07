package com.scaler.ecomproductservice.controller;

import com.scaler.ecomproductservice.dto.ProductListResponseDTO;
import com.scaler.ecomproductservice.dto.ProductResponseDTO;
import com.scaler.ecomproductservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    @Qualifier("fakeStoreProductService")
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity getAllProducts(){

/*
        ProductResponseDTO p1=new ProductResponseDTO();
        p1.setId(1);
        p1.setTitle("Iphone-14");
        p1.setPrice(700000);
        p1.setImage("https://www.google.com/images/iphone");
        p1.setDescription("Costly");
        p1.setCategory("electronics");

        ProductResponseDTO p2=new ProductResponseDTO();
        p2.setId(2);
        p2.setTitle("Mackbook");
        p2.setPrice(700000);
        p2.setImage("https://www.google.com/images/mackbook");
        p2.setDescription("Costly");
        p2.setCategory("electronics");

    List<ProductResponseDTO> products= Arrays.asList(p1,p2);
    return ResponseEntity.ok(products);

 */
        ProductListResponseDTO response = productService.getAllProducts();
        return ResponseEntity.ok(response);

    }
}
