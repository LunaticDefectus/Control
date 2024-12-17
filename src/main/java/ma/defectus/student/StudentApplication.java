package ma.defectus.student;

import ma.defectus.student.dao.entities.Student;
import ma.defectus.student.dao.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

	@Bean
	CommandLineRunner start(StudentRepository studentRepository) {
		return args -> {

			List<Student> students = List.of(
					Student.builder().name("mehdi").dateNaissance("2001-01-01").email("mehdi@gamil.com").build(),
					Student.builder().name("hamid").dateNaissance("2002-02-02").email("mehdi@gamil.com").build(),
					Student.builder().name("said").dateNaissance("2002-02-02").email("mehdi@gamil.com").build(),
					Student.builder().name("fanid").dateNaissance("2002-02-02").email("mehdi@gmail.com").build()

			);

			studentRepository.saveAll(students);
		};

	}
}