package org.thinkingminds.gps.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thinkingminds.gps.domain.Data;
import org.thinkingminds.gps.repository.DataRepository;

@Controller
@RequestMapping(path="/gps")
public class BaseController {
	
	@Autowired
	private DataRepository dataRepository;
	
	@GetMapping(path="/add")
	public @ResponseBody String addNewUser (@RequestParam String username, @RequestParam String password, @RequestParam(defaultValue="0.0", required=false) double latitude, @RequestParam(defaultValue="0.0", required=false) double longitude, @RequestParam(defaultValue="0.0", required=false) float speed) {
		Data data = new Data();
		data.setUsername(username);
		data.setPassword(password);
		data.setLatitude(latitude);
		data.setLongitude(longitude);
		data.setSpeed(speed);
		dataRepository.save(data);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Data> getAllUsers() {
		return dataRepository.findAll();
	}
}
