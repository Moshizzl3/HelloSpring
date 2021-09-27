package com.example.hellospring.controller;


import com.example.hellospring.service.FridayToday;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {


  @GetMapping("/hello")
  public String helloSpring(){
    return "Hello SpringWorld!";
  }

  @GetMapping("/hi")
  public String helloDude(@RequestParam String name){
    return "Hello " + name + " u da " + "💣";
  }

  @GetMapping("/friday")
  public String friday(){
    FridayToday fridayToday = new FridayToday();

    return "Is it friday: " + fridayToday.isItFriday();

  }
}
