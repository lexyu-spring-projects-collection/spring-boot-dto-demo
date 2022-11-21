package com.lex.service;

import com.lex.dto.UserLocationDTO;
import com.lex.entity.Location;
import com.lex.repository.LocationRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : LEX_YU
 * @date : 20/11/2022 11:28 pm
 */
public interface LocationService {

    Location insertLocation(Location location);
    Location convertDtoToLocation(UserLocationDTO userLocationDTO);

}
