package com.example.jokesapp.controllers;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    ChuckNorrisQuotes chuck = new ChuckNorrisQuotes();

    @RequestMapping({"/", "", "joke"})
    String showJoke(Model model) {

        model.addAttribute("joke", chuck.getRandomQuote());

        return "index";
    }

}
