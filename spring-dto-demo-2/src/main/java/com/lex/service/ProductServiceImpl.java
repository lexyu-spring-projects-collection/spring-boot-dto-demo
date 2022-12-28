package com.lex.service;

import com.lex.dto.ProductDTO;
import com.lex.entity.Product;
import com.lex.mapper.ProductMapper;
import com.lex.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author : LEX_YU
 * @date : 21/11/2022 9:59 pm
 */
@Service
public class ProductServiceImpl implements ProductService{

    private final ProductRepository repository;
    private final ProductMapper mapper;
    
    @Autowired
    public ProductServiceImpl(ProductRepository repository, ProductMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}

	@Override
    public List<ProductDTO> findAll() {
        return mapper.toProductDTOs(repository.findAll());
    }

//    @Override
//    public Optional<Product> findById(Long id) {
//        return repository.findById(id);
//    }
//
//    @Override
//    public Product save(Product product) {
//        return repository.save(product);
//    }
//
//    @Override
//    public void deleteById(Long id) {
//
//    }
}
