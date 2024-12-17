package ma.defectus.student.dao.repositories;

import ma.defectus.student.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    public List<Student> findByDateNaissance(String dateNaissance);

}