package com.mybooks.service.DBGateway;

import com.mybooks.dto.ProductDto;
import com.mybooks.entity.ProductEntity;

import java.util.List;

public interface ProductDBGateway {
    List<ProductEntity> createProduct(List<ProductDto> productDtoList);
}
