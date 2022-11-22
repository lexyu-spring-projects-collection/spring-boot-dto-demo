package com.lex.mapper;

import com.lex.dto.ProductDTO;
import com.lex.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : LEX_YU
 * @date : 21/11/2022 9:59 pm
 */
@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDTO toProductDTO(Product product);

    List<ProductDTO> toProductDTOs(List<Product> products);

    Product toProduct(ProductDTO productDTO);

    List<Product> toProducts(List<ProductDTO> productDTOs);

}
