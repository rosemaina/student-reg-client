//package project2.demo;
//
//import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.http.HttpMethod;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//import java.util.List;
//
//@Component
//public class RestTesting implements CommandLineRunner {
//
//
//    @Override
//    public  void run(String... args) throws Exception {
//     RestTemplate restTemplate = new RestTemplate();
//
////     Specify return type
//     ResponseEntity<List<University>> response = restTemplate.exchange(
//             "http://10.51.10.111:8080/universities",
//             HttpMethod.GET,
//             null,
//             new ParameterizedTypeReference<List<University>>(){});
//
//     List<University> universities = response.getBody();
//
//     for(University university: universities) {
//         System.out.println(university.toString());
//     }
//
//        System.out.println("Find One University(GET)--------------------------------------------------------------");
//
//     University university = restTemplate.getForObject("http://10.51.10.111:8080/universities/2", University.class);
//        System.out.println(university.toString());
//
//
////        Create a new university
//        System.out.println("Creating A New University(POST)-----------------------------------------------");
//
//        University newUniversity = new University("Maseno", "Kisumu",189);
//        University createdUniversity = restTemplate.postForObject(
//                "http://10.51.10.111:8080/universities",
//                newUniversity, University.class);
//        System.out.println(createdUniversity.toString());
//
//
//        //    Create a course for the university
//        System.out.println("Creating A New Course(POST)---------------------------------------------------");
//
//        String createCourseUrl = "http://10.51.10.111:8080/universities/"+createdUniversity.getId()+"/courses";
//
//        Course newCourse = new Course("Web Development");
//        Course createdCourse = restTemplate.postForObject(createCourseUrl, newCourse, Course.class);
//        System.out.println(createdCourse.toString());
//    }
//}
