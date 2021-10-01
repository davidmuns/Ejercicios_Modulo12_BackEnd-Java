package com.example.demo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
public class Controlador {

	@GetMapping("/{nombre}")
	public String saludar(@PathVariable(name = "nombre") String nombre) {
		return "Hello, " + nombre + "!";
	}

}
