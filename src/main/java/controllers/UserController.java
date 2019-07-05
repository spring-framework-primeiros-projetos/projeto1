/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import ratam.io.Projeto1.entity.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Alvaro
 */
@Controller

public class UserController {
    private UserRepository userRepository;
    
    public UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    /**
     *
     * @param model
     * @return String users
     */
    @RequestMapping(value = "/user.html")
     public String getUsers (Model model){
         model.addAttribute("usersList",this.userRepository.findAll());
      return "user.html";
        
    }
    
    
}
