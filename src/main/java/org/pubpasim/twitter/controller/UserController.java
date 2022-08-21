package org.pubpasim.twitter.controller;

import org.pubpasim.twitter.model.User;
import org.pubpasim.twitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/user")
public class UserController {

    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    Optional<User> findById(@PathVariable Integer id) {
        return userRepository.findById(id);
    }

//    @GetMapping("/{id}")
//    User findById(@PathVariable Integer id) {
//        return userRepository.findById(id).orElse(null);
//    }

    @PostMapping
    User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/{id}")
    void delete(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }

    @PutMapping
    User update(@RequestBody User user) {
        if (findById(user.getId()).isPresent()) {
            return save(user);
        } else {
            return null;
        }
    }
}
