package cat.prateducacio.app03.ciutats.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.prateducacio.app03.ciutats.model.domain.Ciutat;
import cat.prateducacio.app03.ciutats.model.service.ICiutatService;

@RestController
//http://localhost:8080/ciutat
@RequestMapping("/ciutat")
public class CiutatController {

	@Autowired
	ICiutatService ciutatService;

	// http://localhost:8080/ciutat/add
	@PostMapping("/add")
	public Ciutat addCiutat(@RequestBody Ciutat ciutat) {
		return ciutatService.add(ciutat);
	}

	// http://localhost:8080/ciutat/update
	@PutMapping("/update")
	public Ciutat updateCiutat(@RequestBody Ciutat ciutat) {
		return ciutatService.update(ciutat);
	}

	// http://localhost:8080/ciutat/delete/id
	@DeleteMapping("/delete/{id}")
	public String deleteCiutat(@PathVariable int id) {
		String result = "";
		try {
			ciutatService.delete(id);
			result = "Operació realitzada";
		} catch (Exception e) {
			result = e.getMessage();
		}

		return result;
	}

	// http://localhost:8080/ciutat/getOne/23
	@GetMapping("/getOne/{id}")
	public Ciutat getCiutat(@PathVariable int id) {
		return ciutatService.findById(id);
	}

	// http://localhost:8080/ciutat/getAll
	@GetMapping("/getAll")
	public List<Ciutat> getAll() {
		return ciutatService.getAll();
	}

}
