package org.launchcode.techjobsauth.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegisterFormDTO extends LoginFormDTO {

    @NotNull(message = "Password is required.")
    @NotBlank(message = "Password is required.")
    @Size(min = 6, max = 30, message = "Invalid username. Must be between 3 and 20 characters.")
    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
