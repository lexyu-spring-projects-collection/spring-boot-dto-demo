package com.lex.mapper;

import com.lex.dto.ProductDTO;
import com.lex.entity.Product;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : LEX_YU
 * @date : 23/11/2022 12:02 am
 */
@Mapper
public class ProductMapperImpl implements ProductMapper{

    private final ProductMapper productMapper;

    @Autowired
    public ProductMapperImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public ProductDTO toProductDTO(Product product) {
        return productMapper.toProductDTO(product);
    }

    @Override
    public List<ProductDTO> toProductDTOs(List<Product> products) {
        return productMapper.toProductDTOs(products);
    }

    @Override
    public Product toProduct(ProductDTO productDTO) {
        return productMapper.toProduct(productDTO);
    }

    @Override
    public List<Product> toProducts(List<ProductDTO> productDTOs) {
        return productMapper.toProducts(productDTOs);
    }
}
