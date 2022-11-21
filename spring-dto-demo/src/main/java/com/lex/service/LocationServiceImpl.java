package com.lex.service;

import com.lex.dto.UserLocationDTO;
import com.lex.entity.Location;
import com.lex.repository.LocationRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : LEX_YU
 * @date : 20/11/2022 11:27 pm
 */
@Service
public class LocationServiceImpl implements LocationService{

    private final LocationRepository locationRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location insertLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location convertDtoToLocation(UserLocationDTO userLocationDTO) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(userLocationDTO, Location.class);
    }
}
