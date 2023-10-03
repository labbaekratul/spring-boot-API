package com.example.demo.services;
import com.example.demo.dto.UserDto;

public interface UserService {

   UserDto createUser(UserDto user);
   UserDto createUser(UserDto user, Integer userId);
   UserDto getUserById(Integer userId);
}
