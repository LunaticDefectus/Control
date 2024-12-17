package ma.defectus.student.dto;

import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class StudentDto {
    String name;
    String email;
    String dateNaissance;

}