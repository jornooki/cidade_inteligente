package com.faculdade.cidadeinteligente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.faculdade.cidadeinteligente.model.Rotas;
import com.faculdade.cidadeinteligente.repository.RotasRepository;

@RestController
public class BikeController {

	@Autowired
	private RotasRepository rotasRepository;

	@RequestMapping(value = "/buscar-rotas", method = RequestMethod.GET)
	public List<Rotas> listar() {
		return rotasRepository.findAll();
	}
}
