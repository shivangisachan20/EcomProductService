package com.scaler.ecomproductservice.service;

import com.scaler.ecomproductservice.dto.ProductListResponseDTO;
import com.scaler.ecomproductservice.dto.ProductResponseDTO;
import com.scaler.ecomproductservice.model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
@Service("fakeStoreProductService")
public class FakeStoreProductServiceImpl implements ProductService {

    private RestTemplateBuilder restTemplateBuilder;
    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder){

        this.restTemplateBuilder=restTemplateBuilder;
    }

    @Override
    public ProductListResponseDTO getAllProducts() {
        String getAllProductsURL="https://fakestoreapi.com/products";
        RestTemplate restTemplate=restTemplateBuilder.build();
        ResponseEntity<ProductListResponseDTO> productResponse = restTemplate.getForEntity(getAllProductsURL, ProductListResponseDTO.class );
        return (ProductListResponseDTO) productResponse.getBody();
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product deleteProduct(int id) {
        return null;
    }

    @Override
    public Product updateProduct(int id, Product updatedProduct) {
        return null;
    }
}
