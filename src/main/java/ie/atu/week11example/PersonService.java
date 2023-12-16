package ie.atu.week11example;

import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    // Placeholder method to save a person (add to Db in the next two weeks)
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    // Placeholder method to retrieve a person by employeeId
    public Person getPersonByEmployeeId(String employeeId) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return personRepository.findByEmployeeId(employeeId);
    }

    public Person getPersonByName(String name) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return personRepository.findByName(name);
    }

    public Person getPersonByEmail(String email) {
        // fetch data from a database in future lab
        // For simplicity, we return a dummy person here
        return personRepository.findByEmail(email);
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}
