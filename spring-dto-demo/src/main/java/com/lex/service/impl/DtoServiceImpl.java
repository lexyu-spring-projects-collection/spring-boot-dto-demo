package com.lex.service.impl;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lex.dto.LocationDTO;
import com.lex.dto.UserDTO;
import com.lex.dto.UserLocationDTO;
import com.lex.repository.LocationRepository;
import com.lex.repository.UserRepository;
import com.lex.service.DtoService;

/**
 * @author Lex_Yu
 * @date 2022年12月23日
 */
@Service
public class DtoServiceImpl implements DtoService{
	
	@Autowired
    private ModelMapper modelMapper;
	
    private final UserRepository userRepository;
    private final LocationRepository locationRepository;
    
    @Autowired
	public DtoServiceImpl(UserRepository userRepository, LocationRepository locationRepository) {
		this.userRepository = userRepository;
		this.locationRepository = locationRepository;
	}

	@Override
	public UserDTO getUserDTO() {
		return userRepository
				.findAll()
				.stream()
				.map(this::convertUserToDTO)
				.collect(Collectors.toList());
	}

	@Override
	public LocationDTO getLocationDTO() {
		return null;
	}

	@Override
	public UserDTO convertUserToDTO() {
			modelMapper.getConfiguration()
			.setMatchingStrategy(MatchingStrategies.LOOSE);
		return modelMapper.map(user, UserLocationDTO.class);
	}

	@Override
	public LocationDTO convertLocationToDTO() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
