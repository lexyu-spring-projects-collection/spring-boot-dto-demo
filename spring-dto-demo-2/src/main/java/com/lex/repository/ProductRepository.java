package com.lex.repository;

import com.lex.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : LEX_YU
 * @date : 21/11/2022 9:59 pm
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
