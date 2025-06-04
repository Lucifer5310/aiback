package com.example.aiback.service;

import java.util.Arrays;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.aiback.model.User;
import com.example.aiback.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SeedService {

    private final UserRepository userRepository;

    public void seedUsersIfEmpty() {
        if (userRepository.count() == 0) {
            RestTemplate restTemplate = new RestTemplate();
            User[] users = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", User[].class);
            if (users != null) {
                userRepository.saveAll(Arrays.asList(users));
            }
        }
    }
}
