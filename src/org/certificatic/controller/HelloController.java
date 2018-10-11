package org.certificatic.controller;

import java.util.List;

import org.certificatic.model.Alumno;
import org.certificatic.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@Autowired
	private AlumnoService alumnoService;

	@RequestMapping("/")
	public String hello(Model model) {
		System.out.println("Entro a helloController::::");

		Alumno alumno = new Alumno();
		model.addAttribute("alumno", alumno);

		return "alumnoRegistro";
	}

	@RequestMapping("/guardarAlumno")
	public String guardarAlumno(Model model, @ModelAttribute("alumno") Alumno alumno) {
		System.out.println(":::: Entro a guardar alumno");
		System.out.println("Alumno a guardar: " + alumno);
		alumnoService.save(alumno);
		return "alumnoRegistro";
	}

	@RequestMapping("/listarAlumnos")
	public String listarAlumnos() {
		System.out.println(":::: Entro a listar alumnos ::::");
		List<Alumno> alumnos = alumnoService.findAll();
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		
		return "listaAlumnos";
	}
	
}
