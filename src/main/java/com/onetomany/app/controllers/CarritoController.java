package com.onetomany.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.app.dto.CarritoDTO;
import com.onetomany.app.dto.MensajeDTO;
import com.onetomany.app.services.CarritoService;


@RestController
public class CarritoController {

	@Autowired
	CarritoService carritoService;
	
	@PostMapping("/carrito")
	
	
	public ResponseEntity<Object> registrar(@RequestBody CarritoDTO carritoDTO){
		carritoService.save(carritoDTO);
		return new ResponseEntity<Object>(new MensajeDTO("Empleado(a) registrado(a)"),HttpStatus.OK);
	}
}
