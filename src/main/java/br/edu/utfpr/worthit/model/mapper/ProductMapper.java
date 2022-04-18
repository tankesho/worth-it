package br.edu.utfpr.worthit.model.mapper;

import br.edu.utfpr.worthit.model.domain.Product;
import br.edu.utfpr.worthit.model.dto.ProductDTO;


public class ProductMapper{

    public ProductMapper getInstance(){
        return new ProductMapper();
    }

    public static Product toEntity(ProductDTO dto){
        Product entity = new Product(dto.getName(), dto.getCategory());
        return entity;
    }

    public static ProductDTO toDTO(Product entity){
        ProductDTO dto = new ProductDTO(entity.getName(), entity.getCategory());
        return dto;
    }
}