package com.lex.service;

import com.lex.dto.UserLocationDTO;
import com.lex.entity.Location;
import com.lex.entity.User;

import java.util.List;

/**
 * @author : LEX_YU
 * @date : 20/11/2022 9:24 pm
 */
public interface UserService {

    List<UserLocationDTO> getAllUsersLocation();

    User insertUser(User user);

    UserLocationDTO convertEntityToDto(User user);

    User convertDtoToUser(UserLocationDTO userLocationDTO);

}
