package com.example.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"","/", "/index"})
     String listVets(){
         return "owners/index";
     }
}
