package com.lex.controller;

import com.lex.dto.ProductDTO;
import com.lex.entity.Product;
import com.lex.mapper.ProductMapper;
import com.lex.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * @author : LEX_YU
 * @date : 21/11/2022 9:58 pm
 */
@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;
    private final ProductMapper productMapper;

    @Autowired
    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll(){
        List<ProductDTO> productList = productMapper.toProductDTOs(productService.findAll());
        return ResponseEntity.ok(productList);
    }
    @GetMapping("/{theId}")
    public ResponseEntity<ProductDTO> findById(@PathVariable Long theId){
        Optional<Product> product = productService.findById(theId);
        ProductDTO productDTO = null;
        if (product.isPresent()){
             productDTO = productMapper.toProductDTO(product.get());
        }
        return ResponseEntity.ok(productDTO);
    }

    @PostMapping("/{theId}")
    public ResponseEntity<ProductDTO> create(@RequestBody ProductDTO productDTO){
        log.info("Creating new productDTO {}", productDTO);
        Product product = productMapper.toProduct(productDTO);
        log.info("productMapper = " + productMapper);
        log.info("Transfer DTO to Entity {}",product);
        log.info("productService = " + productService);
        productService.save(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDTO);
    }

    @PutMapping("/{theId}")
    public ResponseEntity<ProductDTO> update(@PathVariable Long id, @RequestBody ProductDTO productDTO){
        log.info("id = {}, ProductDTO = {}", id, productDTO);
        Product product = productMapper.toProduct(productDTO);
        log.info("Transfer DTO to Entity {}", product);
        product.setId(id);
        log.info("Saving Product = {}", product);
        productService.save(product);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(productDTO);
    }

    @DeleteMapping("/{theId}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        log.info("id = {}", id);
        productService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }


}
