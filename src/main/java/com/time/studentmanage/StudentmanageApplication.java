package com.time.studentmanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class StudentmanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentmanageApplication.class, args);
    }

    @Bean
    @Profile("local")
    public TestDataInit testDataInit(StudentRepository studentRepository, ParentRepository parentRepository, TeacherRepository teacherRepository) {
        return new TestDataInit(studentRepository, teacherRepository, parentRepository);
    }
}