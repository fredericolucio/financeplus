package com.mycantec.financeplus.financeplus.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycantec.financeplus.financeplus.model.Releases;
import com.mycantec.financeplus.financeplus.repository.ReleasesRepository;



@RestController
@RequestMapping("/api/releases")
public class ReleasesController {
	
	@Autowired
	private ReleasesRepository releasesRepository;
	@PostMapping
	public @ResponseBody Releases newReleases(Releases releases) {
		releasesRepository.save(releases);
		return releases;
	}
//	public @ResponseBody Releases newReleases(@RequestParam String description, int category, Float value, int account, String status ) {
//		Releases releases = new Releases(description, category, value, account, status);
//		releasesRepository.save(releases);
//		return releases;
//	}

}
