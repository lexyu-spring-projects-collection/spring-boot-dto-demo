package com.lex.repository;

import com.lex.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : LEX_YU
 * @date : 20/11/2022 8:54 pm
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
