package com.lex.mapper;

import com.lex.dto.ProductDTO;
import com.lex.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import java.util.List;

/**
 * @author : LEX_YU
 * @date : 21/11/2022 9:59 pm
 */
@Mapper(componentModel = "spring")
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "price", target = "price")
    
//    ProductDTO toProductDTO(Product product);

    List<ProductDTO> toProductDTOs(List<Product> products);

//    Product toProduct(ProductDTO productDTO);

//    List<Product> toProducts(List<ProductDTO> productDTOs);

}
