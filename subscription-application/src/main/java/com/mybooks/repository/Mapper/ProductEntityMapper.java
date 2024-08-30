package com.mybooks.repository.Mapper;

import com.mybooks.dto.ProductDto;
import com.mybooks.entity.ProductEntity;

public interface ProductEntityMapper {

    ProductEntityMapper MAPPER = new ProductEntityMapper() {


        @Override
        public ProductDto fromProductEntity(ProductEntity productEntity) {
            return null;
        }

        @Override
        public ProductEntity toProductEntity(ProductDto productDto) {
            return null;
        }
    };

    ProductDto fromProductEntity(ProductEntity productEntity);
    ProductEntity toProductEntity(ProductDto productDto);
}
