package com.demo.demo;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Controller {

    private final UserRepostiory userRepostiory;

    @GetMapping("/test")
    ResponseEntity<List<Dto>> index(){
        List<User> list = userRepostiory.findAll();
        List<Dto> list1 = new ArrayList<>();
        list.forEach(x-> list1.add(Dto.builder()
                .id(String.valueOf(x.getId()))
                .name(x.getUsename())
                .age(String.valueOf(x.getAge()))
                .address(x.getAddress())
                .build()));

        return ResponseEntity.ok(list1);
    }
}
