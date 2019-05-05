package com.uca.capas.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.entities.User;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView initMain(){
		ModelAndView mav = new ModelAndView();
		User usuario = new User();
		mav.addObject("message", "Bienvenidos a MVC");
		mav.addObject("user", usuario);
		mav.setViewName("index");
		return mav;
	}
	

	@RequestMapping("/formData")
	public ModelAndView form(@Valid @ModelAttribute User user, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.setViewName("index");
		}else {
			mav.addObject("message", "Persona Agregada con Éxito");
			mav.setViewName("form");
		}
		return mav;
	}
	
	
	/*
	@RequestMapping ("/formData")
	@ResponseBody
	public String form(@ModelAttribute User user) {
		return user.toString();
	}*/
	
}
