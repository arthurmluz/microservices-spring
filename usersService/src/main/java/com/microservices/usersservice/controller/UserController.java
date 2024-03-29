package com.microservices.usersservice.controller;

import com.microservices.usersservice.model.User;
import com.microservices.usersservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path="/create")
    public @ResponseBody String addNewUser(@RequestBody User user){
        userRepository.save(user);
        return "Saved!";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping
    public @ResponseBody Optional<User> getById(@RequestParam("id") int id){
        return userRepository.findById(id);
    }

    
    @GetMapping(path="/login")
    public @ResponseBody String Login(@RequestParam("name") String name, @RequestParam("senha") String senha){
        Optional<User> ur =  userRepository.findByName(name);
        if(!ur.isPresent())
            return "login fail";

        if(ur.get().getSenha().equals(senha)){
            ur.get().setLogado(true);
            userRepository.save(ur.get());
            return "Login sucess";
        } else {
            return "Login fail";
        }
    }
     

    @GetMapping(path="/logout")
    public @ResponseBody String Logout(@RequestParam("name") String name, @RequestParam("senha") String senha){
        Optional<User> ur =  userRepository.findByName(name);
        if(!ur.isPresent())
            return "logout fail";
        if(ur.get().getSenha().equals(senha)){
            ur.get().setLogado(false);
            userRepository.save(ur.get());

            return "Logout";
        }
        return "Logout fail";
    }
    
     

}
