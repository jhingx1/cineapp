package com.emp.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String goHome() {
		return "home";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		
		System.out.println("principal");
		List<String> peliculas = new LinkedList<>();
		peliculas.add("Rapido y Furiso");
		peliculas.add("El Aro 2");
		peliculas.add("Iron Man");
		
		model.addAttribute(peliculas);//"peliculas",
		
		return "home";
	}
	
	@RequestMapping(value="/detail")
	public String mostrarDetalle(Model model) {
		
		String tituloPelicula = "Iron Man";
		int duracion = 130;
		double precio = 14.5;
		
		model.addAttribute("tituloPelicula", tituloPelicula);
		model.addAttribute("duracion", duracion);
		model.addAttribute("precio", precio);
		
		return "detalle";
	}

}
