package com.mycantec.financeplus.financeplus.controller;



import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycantec.financeplus.financeplus.model.Releases;
import com.mycantec.financeplus.financeplus.repository.ReleasesRepository;



@RestController
@RequestMapping("/api/releases")
public class ReleasesController {
	
	@Autowired
	private ReleasesRepository releasesRepository;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Releases saveReleases(@Valid Releases releases) {
		releasesRepository.save(releases);
		return releases;
	}
	@GetMapping
	public Iterable<Releases> getReleases( ) {
		return releasesRepository.findAll();
	}
	@GetMapping(path="/{id}")
	public Optional<Releases> getReleasesById(@PathVariable int id) {
		return releasesRepository.findById(id);
	}
	@DeleteMapping(path = "/{id}")
	public void excludeReleases(@PathVariable int id) {
		releasesRepository.deleteById(id);
	}

}	
//	@PutMapping
//	public Releases chageReleases(Releases release) {
//		releasesRepository.save(release);
//		return release;
//	}



//@PostMapping(method= {RequestMethod.POST, RequestMethod.PUT})
//public @ResponseBody Releases saveReleases(@RequestParam @Valid String description, int category, Float value, int account, String status ) {
//	Releases releases = new Releases(description, category, value, account, status);
//	releasesRepository.save(releases);
//	return releases;
//}

//public @ResponseBody Releases newReleases(Releases releases) {
//releasesRepository.save(releases);
//return releases;
//}