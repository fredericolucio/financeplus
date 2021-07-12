package com.mycantec.financeplus.financeplus.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycantec.financeplus.financeplus.model.Client;





@RestController
@RequestMapping("/clients")
public class ClientController {

	@GetMapping("/anything")
	public Client getClient() {
		return new Client(10, "Frederico", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Client getClientById1(@PathVariable int id) {
		return new Client(id, "Geralda", "456.456.789-20");
	}
	
	@GetMapping
	public Client getClientById2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Client(id, "Geralda", "456.456.789-20");
	}
}
