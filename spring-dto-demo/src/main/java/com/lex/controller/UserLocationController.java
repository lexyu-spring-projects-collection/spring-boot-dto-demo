package com.lex.controller;

import com.lex.dto.UserLocationDTO;
import com.lex.service.LocationService;
import com.lex.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : LEX_YU
 * @date : 20/11/2022 9:45 pm
 */
@RestController
public class UserLocationController {

    private final UserService userService;
    private final LocationService locationService;

    @Autowired
    public UserLocationController(UserService userService, LocationService locationService) {
        this.userService = userService;
        this.locationService = locationService;
    }

    @GetMapping("/test")
    public String welcome(){
        return "Welcome";
    }

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocation(){
        return userService.getAllUsersLocation();
    }

    @PostMapping("addUser-Location")
    public UserLocationDTO addUserLocation(@RequestBody UserLocationDTO userLocationDTO){
        userService.insertUser(userService.convertDtoToUser(userLocationDTO));
//        locationService.insertLocation(locationService.convertDtoToLocation(userLocationDTO));
        return userLocationDTO;
    }
}
