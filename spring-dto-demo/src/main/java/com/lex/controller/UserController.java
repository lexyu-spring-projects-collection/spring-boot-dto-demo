package com.lex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lex.dto.LocationDTO;
import com.lex.dto.UserDTO;
import com.lex.service.DtoService;

/**
 * @author Lex_Yu
 * @date 2022年12月23日
 */
@RestController
@RequestMapping("/UserDto")
public class UserController {
	
	private final DtoService dtoService;

	@Autowired
	public UserController(DtoService dtoService) {
		this.dtoService = dtoService;
	}

	@GetMapping("/test")
    public String welcome(){
        return "Welcome";
    }
	
	@GetMapping("/getAllUsers")
	public List<UserDTO> getAllUsersDto(){
		
		 return dtoService.getUserDTO();
	}
	
	
}
