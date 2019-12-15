package pl.keruzam.springboot2019.dao;

import java.util.List;
import java.util.UUID;

import pl.keruzam.springboot2019.model.Person;

public interface PersonDao {

	int insertPerson(UUID id, Person person);

	default int insertPerson(final Person person) {
		UUID id = UUID.randomUUID();
		return this.insertPerson(id, person);
	}

	List<Person> getAllPersons();

}
