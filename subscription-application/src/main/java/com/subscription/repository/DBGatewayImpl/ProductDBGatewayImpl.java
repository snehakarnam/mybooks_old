package com.mybooks.repository.DBGatewayImpl;

import com.mybooks.dto.ProductDto;
import com.mybooks.entity.ProductEntity;
import com.mybooks.repository.ProductRepository;
import com.mybooks.service.DBGateway.ProductDBGateway;

import java.util.List;

public class ProductDBGatewayImpl implements ProductDBGateway {

    private final ProductRepository productRepository;

    public ProductDBGatewayImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductEntity> createProduct(List<ProductDto> productDtoList) {
        return List.of();
    }
}
