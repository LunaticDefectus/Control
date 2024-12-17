package ma.defectus.student.mapper;

import ma.defectus.student.dao.entities.Student;
import ma.defectus.student.dto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private final ModelMapper mapper = new ModelMapper();
    public Student fromStudentDtoToStudent(StudentDto studentDto){
        return mapper.map(studentDto, Student.class);
    }

    public StudentDto fromStudentToStudentDto(Student student){
        return mapper.map(student, StudentDto.class);
    }

}