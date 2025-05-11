package com.softpro.DefenceAspirantPortal.Authentication.dto;

import com.softpro.DefenceAspirantPortal.Authentication.dto.enums.Role;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;
    @NotBlank(message = "Required field in Employee: name")
    @Size(min=3, max = 20, message = "Number of character in name should be in the range: [3,10]")
    private String name;

    @NotBlank(message = "Email of the employee cannot be blank")
    @Pattern(
            regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$",
            message = "Invalid email format"
    )
    private String email;
    @NotBlank
    @Size(min = 6)
    private String password;

}
