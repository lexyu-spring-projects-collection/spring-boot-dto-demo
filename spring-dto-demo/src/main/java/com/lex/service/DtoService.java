package com.lex.service;

import com.lex.dto.LocationDTO;
import com.lex.dto.UserDTO;

/**
 * @author Lex_Yu
 * @date 2022年12月23日
 */
public interface DtoService {
	
	UserDTO getUserDTO();
	
	UserDTO convertUserToDTO();
	
	LocationDTO getLocationDTO();
	
	LocationDTO convertLocationToDTO();

}
