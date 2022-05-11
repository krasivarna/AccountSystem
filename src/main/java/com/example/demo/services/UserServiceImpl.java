package com.example.demo.services;

import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
@Autowired
    private UserRepository userRepository;
    @Override
    public void registerUser(User user) {
        User found=this.userRepository.findByUsername(user.getUsername());

        if (found==null) {
            this.userRepository.save(user);
        }
    }

}
