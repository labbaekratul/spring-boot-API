package com.example.demo.services;

import com.example.demo.dto.UserDto;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepositories;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserRepositories userRepositories;
    private final ModelMapper modelMapper;

    public UserServiceImp(UserRepositories userRepositories, ModelMapper modelMapper) {
        this.userRepositories = userRepositories;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = modelMapper.map(userDto, User.class);
        return modelMapper.map(userRepositories.save(user), UserDto.class);
    }

    @Override
    public UserDto updateUser(UserDto user, Integer userId) {
        return null;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(Integer userId) {

    }
}
