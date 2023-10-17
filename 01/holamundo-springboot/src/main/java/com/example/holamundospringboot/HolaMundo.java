package com.example.holamundospringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class HolaMundo {
  @ResponseBody
  @GetMapping
  public String showMessagePorDefecto(){
    return "HolaMundo en Spring por defecto";

  }
  @GetMapping("/holamundo")
  @ResponseBody
    public String showMessage(){
      return "HolaMundo en Spring";

    }






}
