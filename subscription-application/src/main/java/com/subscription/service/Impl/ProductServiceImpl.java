package com.mybooks.service.Impl;

import com.mybooks.dto.ProductDto;
import com.mybooks.service.DBGateway.ProductDBGateway;
import com.mybooks.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductDBGateway productDBGateway;

    public ProductServiceImpl(ProductDBGateway productDBGateway) {
        this.productDBGateway = productDBGateway;
    }

    @Override
    public List<ProductDto> createProduct(List<ProductDto> productDTO) {
        return productDBGateway.createProduct(productDTO);
    }

    @Override
    public ProductDto getProductById(String productId) {
        return null;
    }

    @Override
    public List<ProductDto> getAllProducts() {
        return List.of();
    }

    @Override
    public ProductDto updateProduct(String productId, ProductDto productDTO) {
        return null;
    }

    @Override
    public void deleteProduct(String productId) {

    }
}
