package atu.ie.week_8_springboot_validation;

import org.springframework.stereotype.Service;

@Service
public class PersonService {
    public void savePerson(Person person){
        System.out.println("Person saved: " + person);
    }
    public Person getPersonByEmployeeId(String employeeId){
        //fetch data from a database in future lab
        //For simplicity we return a dummy person
        return new Person();
    }
}
