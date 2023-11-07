package com.scaler.ecomproductservice.service;

import com.scaler.ecomproductservice.dto.ProductListResponseDTO;
import com.scaler.ecomproductservice.model.Product;

import java.util.List;

public interface ProductService {
ProductListResponseDTO getAllProducts();
Product getProductById(int id);
Product createProduct(Product product);
Product deleteProduct(int id);
Product updateProduct(int id,Product updatedProduct);

}
