package com.emp.controller;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emp.model.Pelicula;

@Controller
public class HomeController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String goHome() {
		return "home";
	}
	
//	@RequestMapping(value="/",method=RequestMethod.GET)
//	public String mostrarPrincipal(Model model) {
//		
//		System.out.println("principal");
//		List<String> peliculas = new LinkedList<>();
//		peliculas.add("Rapido y Furiso");
//		peliculas.add("El Aro 2");
//		peliculas.add("Iron Man");
//		
//		model.addAttribute("peliculas",peliculas);
//		
//		return "home";
//	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) {
		
		System.out.println("principal");
		List<Pelicula> peliculas = getLista();

		model.addAttribute("peliculas",peliculas);
		
		return "home";
	}
	
	private List<Pelicula> getLista(){
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> lista = null;
		try {
			
			lista = new LinkedList<>();
			
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setId(1);
			pelicula1.setTitulo("Power Ranger");
			pelicula1.setDuracion(120);
			pelicula1.setClasificacion("B");
			pelicula1.setGenero("Aventura");
			pelicula1.setFechaEstreno(formatter.parse("02-05-2017"));
			
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(2);
			pelicula2.setTitulo("La bella y la Bestia");
			pelicula2.setDuracion(132);
			pelicula2.setClasificacion("A");
			pelicula2.setGenero("Infantil");
			pelicula2.setFechaEstreno(formatter.parse("20-05-2017"));
			
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setId(1);
			pelicula3.setTitulo("Contratiempo");
			pelicula3.setDuracion(106);
			pelicula3.setClasificacion("B");
			pelicula3.setGenero("Thriller");
			pelicula3.setFechaEstreno(formatter.parse("28-05-2017"));
			
			//agregamos los objetos pelicula a la lista
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);
			
			return lista;
			
		}catch (Exception e) {
			System.out.println("Error" + e.getMessage());
			return null;
		}
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
