package com.lex.service;

import com.lex.dto.ProductDTO;
import com.lex.entity.Product;

import java.util.List;
import java.util.Optional;

/**
 * @author : LEX_YU
 * @date : 21/11/2022 9:59 pm
 */
public interface ProductService {
	List<ProductDTO> findAll();

//    Optional<Product> findById(Long id);
//
//    Product save(Product product);
//
//    void deleteById(Long id);

}
