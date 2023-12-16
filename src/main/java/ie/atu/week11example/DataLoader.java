package ie.atu.week11example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final PersonRepository personRepository;

    @Autowired
    public DataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Person testData = new Person(1L, "Paul", 43, "paul@atu.ie", "Mr", "1235", "Lecturer", "Electronics");
        Person testData2 = new Person(2L, "James", 21, "james@atu.ie", "Mr", "234", "Student", "Electronics");
        Person testData3 = new Person(3L, "Patrick", 20, "patrick@atu.ie", "Mr", "567", "TA", "Electronics");
        personRepository.save(testData);
        personRepository.save(testData2);
        personRepository.save(testData3);
    }
}