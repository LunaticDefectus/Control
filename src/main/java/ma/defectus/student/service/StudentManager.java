package ma.defectus.student.service;

import lombok.AllArgsConstructor;
import ma.defectus.student.dao.entities.Student;
import ma.defectus.student.dao.repositories.StudentRepository;
import ma.defectus.student.dto.StudentDto;
import ma.defectus.student.mapper.StudentMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class StudentManager implements StudentService {

    private StudentRepository studentRepository;
    private StudentMapper studentMapper;

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        Student student = studentMapper.fromStudentDtoToStudent(studentDto);
        student = studentRepository.save(student);
        studentDto = studentMapper.fromStudentToStudentDto(student);
        return studentDto;


    }

    @Override
    public List<StudentDto> getStudentByDateNaissance(String dateNaissance) {
        List<Student> students = studentRepository.findByDateNaissance(dateNaissance);
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Student student : students) {
            studentDtos.add(studentMapper.fromStudentToStudentDto(student));
        }
        return studentDtos;
    }



//
}