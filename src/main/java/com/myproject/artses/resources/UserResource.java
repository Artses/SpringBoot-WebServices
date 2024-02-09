package com.myproject.artses.resources;

import com.myproject.artses.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/User")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Arthur","Arthur@gmail","9999999","123321");
        return ResponseEntity.ok().body(u);
    }
}
