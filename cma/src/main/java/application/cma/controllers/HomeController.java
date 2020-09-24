package application.cma.controllers;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import application.cma.models.Client;
import application.cma.repositories.ClientRepository;

@Controller
public class HomeController {

	@Autowired
	ClientRepository clientRepo;
	
	@GetMapping(path="")
	public String getHome(Model model) {
	
		int month = LocalDate.now().getMonthValue();
		ArrayList<Client> clients = (ArrayList<Client>) clientRepo.findAll();		
		ArrayList<Client> anniversaries = new ArrayList<Client>();
		
		for (Client client : clients) {
			if (client.getDod().getMonthValue() == month) {
				anniversaries.add(client);
			}
		}
		model.addAttribute("anniversaries", anniversaries);
		return "home";
	}
}
