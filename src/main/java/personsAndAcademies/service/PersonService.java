
package personsAndAcademies.service;


import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import personsAndAcademies.model.Person;
import personsAndAcademies.repository.PersonRepository;

@Named("personService")
@Transactional
@RequestScoped
public class PersonService {
	
	
	@Inject
	private PersonRepository personRepository;
	
	public void createPerson(Person person){
		personRepository.createPerson(person);
	}
	public List<Person> readPerson(){
		return personRepository.readPerson();
	}
	public Person readPerson(String user){
		return personRepository.readPerson(user);
	}
	public void updatePerson(Person person){
		personRepository.updatePerson(person);
	}
	public void removePerson(Person person){
		personRepository.removePerson(person);
	}
	
	public void updateUser(Person person){
		personRepository.updateUser(person);
	}
	public void removePersonId(long ID){
		personRepository.removePersonId(ID);
	}
}
