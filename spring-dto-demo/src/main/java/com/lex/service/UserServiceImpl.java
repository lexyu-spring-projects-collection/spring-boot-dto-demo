package com.lex.service;

import com.lex.dto.UserLocationDTO;
import com.lex.entity.Location;
import com.lex.entity.User;
import com.lex.repository.LocationRepository;
import com.lex.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.modelmapper.spi.MatchingStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author : LEX_YU
 * @date : 20/11/2022 9:24 pm
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserLocationDTO> getAllUsersLocation() {
        return userRepository.findAll()
                .stream()
                .map(this::convertEntityToDto) // user -> convertEntityToDto(user)
                .collect(Collectors.toList());
    }

    @Override
    public User insertUser(User user) {
        return userRepository.save(user);
    }

//    @Override
//    public UserLocationDTO convertEntityToDto(User user) {
//        UserLocationDTO userLocationDTO = new UserLocationDTO();
//        userLocationDTO.setUserId(user.getId());
//        userLocationDTO.setEmail(user.getEmail());
//        userLocationDTO.setPlace(user.getLocation().getPlace());
//        userLocationDTO.setLongitude(user.getLocation().getLongitude());
//        userLocationDTO.setLatitude(user.getLocation().getLatitude());
//        return userLocationDTO;
//    }

    @Override
    public UserLocationDTO convertEntityToDto(User user) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(user, UserLocationDTO.class);
    }

    @Override
    public User convertDtoToUser(UserLocationDTO userLocationDTO) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        return modelMapper.map(userLocationDTO, User.class);
    }


}
