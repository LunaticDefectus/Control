package ma.defectus.student.web;

import lombok.AllArgsConstructor;
import ma.defectus.student.dto.StudentDto;
import ma.defectus.student.service.StudentService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentGraphQLController {

    private StudentService studentService;

    @MutationMapping
    public StudentDto saveStudent(@Argument StudentDto student){
        return studentService.saveStudent(student);
    }

    @QueryMapping
    public List<StudentDto> getStudentByDateNaissance(@Argument String dateNaissance){
        return studentService.getStudentByDateNaissance(dateNaissance);
    }


}