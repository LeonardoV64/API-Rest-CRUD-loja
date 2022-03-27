package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;


@RestController
@AllArgsConstructor

public class LojaController {
	
	lojaRepository repository;
	
	@GetMapping("/loja")
	public List<loja> getAllLoja(){
		return repository.findAll();
	}
	@GetMapping("/loja/{id}")
	public loja getLojaById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/loja")
	public loja saveLoja(@RequestBody loja loja) {
		return repository.save(loja);
	}
	
	@DeleteMapping("/loja/{id}")
	public void deleteLoja(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
