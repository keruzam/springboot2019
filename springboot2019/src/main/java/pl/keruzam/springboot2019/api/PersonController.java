package pl.keruzam.springboot2019.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.keruzam.springboot2019.model.Person;
import pl.keruzam.springboot2019.service.PersonService;

@RequestMapping("api/person")
@RestController
public class PersonController {

	private final PersonService personService;

	@Autowired
	public PersonController(final PersonService personService) {
		this.personService = personService;
	}

	@PostMapping
	public void addPerson(@RequestBody final Person person) {
		personService.addPerson(person);
	}

	@GetMapping
	public List<Person> getAllPersons() {
		return personService.getAllPersons();
	}

}
