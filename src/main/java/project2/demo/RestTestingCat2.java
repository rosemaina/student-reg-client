package project2.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestTestingCat2 implements CommandLineRunner {

    @Override
    public  void run(String... args) throws Exception {
        RestTemplate restTemplate = new RestTemplate();

//     Get all units available
     ResponseEntity<List<Unit>> response = restTemplate.exchange(
             "http://10.51.10.111:1000/units",
             HttpMethod.GET,
             null,
             new ParameterizedTypeReference<List<Unit>>(){});

     List<Unit> units = response.getBody();

     for(Unit unit: units) {
         System.out.println(units.toString());
     }

        //  Register a new student
        System.out.println("Registering a new student(POST)-----------------------------------------------");

        Student newStudent = new Student("Rose Maina", 94952);
        Student registeredStudent = restTemplate.postForObject(
                "http://10.51.10.111:1000/registrations",
                newStudent,
                Student.class);

        System.out.println(registeredStudent.toString());


        //    Enroll into an available unit
        System.out.println("Enroll into an available unit(POST)-----------------------------------------------");

        String createEnrollmentUrl = "http://10.51.10.111:1000/2/enroll/"+registeredStudent.getId()+"/";

        newStudent.getEnrollmentKey();
        newStudent.setValidated(true);
        Student createdEnrollment = restTemplate.postForObject(createEnrollmentUrl, newStudent, Student.class);
        System.out.println(createdEnrollment.toString());


    }
}
