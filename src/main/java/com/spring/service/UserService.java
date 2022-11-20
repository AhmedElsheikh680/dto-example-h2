package com.spring.service;

import com.spring.dto.UserLocationDTO;
import com.spring.model.User;
import com.spring.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public List<UserLocationDTO> getAllUsersLocations(){
        return userRepo.findAll()
                .stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());

    }
    private UserLocationDTO convertEntityToDTO(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;
    }


}
