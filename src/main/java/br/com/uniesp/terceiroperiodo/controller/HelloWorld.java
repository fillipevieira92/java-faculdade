package br.com.uniesp.terceiroperiodo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class HelloWorld {

  @GetMapping("/")
  public String getHello(){
    return "Hello World!";
  }

}
