package pl.keruzam.springboot2019.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.keruzam.springboot2019.dao.PersonDao;
import pl.keruzam.springboot2019.model.Person;

@Service
public class PersonService {

	private final PersonDao personDao;

	@Autowired
	public PersonService(@Qualifier("fakeDao") final PersonDao personDao) {
		this.personDao = personDao;
	}

	public int addPerson(final Person person) {
		return personDao.insertPerson(person);
	}

	public List<Person> getAllPersons() {
		return personDao.getAllPersons();
	}

}
