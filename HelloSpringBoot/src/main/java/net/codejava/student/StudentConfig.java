package net.codejava.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student zach = new Student("Zach", LocalDate.of(2000, 1, 5),"zbaccaro@email.com");
            Student alex = new Student("Alex", LocalDate.of(2004, 1, 5),"alex@email.com");

            ArrayList<Student> s = new ArrayList<Student>();
            s.add(zach);
            s.add(alex);
            repository.saveAll(s);
        };

    }
}
