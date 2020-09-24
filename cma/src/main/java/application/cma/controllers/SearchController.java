package application.cma.controllers;

import java.awt.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import application.cma.models.Client;
import application.cma.repositories.ClientRepository;

@Controller
public class SearchController {

	@Autowired
	ClientRepository clientRepo;
	
	@GetMapping(path="search")
	public String getSearch(Model model) {		
		model.addAttribute("clients", clientRepo.findAll());
		return "search";
	}
}
