package application.cma.controllers;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import application.cma.models.Client;
import application.cma.repositories.ClientRepository;

@Controller
public class ClientController {
	
	@Autowired
	ClientRepository clientRepo;
	
	@GetMapping(value="clientEdit")
	public String getClientEdit() {
		return "clientEdit";
	}
	
	@PostMapping(path="clientEdit")
	public String requestClientEdit(Model model, String firstName, String lastName, 
			@RequestParam("dob") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dob,
			@RequestParam("dod") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dod) {
				
		Client client = new Client(firstName, lastName, dob ,dod);
		clientRepo.save(client);
		model.addAttribute("clients", clientRepo.findAll());
		return "search";
	}
}
