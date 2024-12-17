package ma.defectus.student.service;

import ma.defectus.student.dto.StudentDto;

import java.util.List;

public interface StudentService {
    public StudentDto saveStudent(StudentDto studentDto);

    List<StudentDto> getStudentByDateNaissance(String dateNaissance);



}