package com.lex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lex.dto.LocationDTO;
import com.lex.service.DtoService;

/**
 * @author Lex_Yu
 * @date 2022年12月23日
 */
@RestController
@RequestMapping("/LocationDto")
public class LocationController {
	
	private final DtoService dtoService;
	
	@Autowired
	public LocationController(DtoService dtoService) {
		this.dtoService = dtoService;
	}

	@GetMapping("/test")
    public String welcome(){
        return "Welcome";
    }
	
	@GetMapping("/getAllLocations")
	public List<LocationDTO> getAllLocationDTOs(){
		
		 return dtoService.getLocationDTO();
	}

}
