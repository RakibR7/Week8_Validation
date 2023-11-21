package atu.ie.week_8_springboot_validation;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between 2 & 50 char")
    private String name;
    @Min(16)
    private int age;
    @Email
    private String email;
    @NotBlank
    private String title;

    @NotBlank
    private String employeeId;

    @NotBlank
    private String position;

    @NotBlank
    private String department;
}

