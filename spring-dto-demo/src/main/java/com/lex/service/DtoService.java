package com.lex.service;

import java.util.List;

import com.lex.dto.LocationDTO;
import com.lex.dto.UserDTO;
import com.lex.entity.Location;
import com.lex.entity.User;

/**
 * @author Lex_Yu
 * @date 2022年12月23日
 */
public interface DtoService {
	
	List<UserDTO> getUserDTO();
	
	UserDTO convertUserToDTO(User user);
	
	List<LocationDTO> getLocationDTO();
	
	LocationDTO convertLocationToDTO(Location location);

}
