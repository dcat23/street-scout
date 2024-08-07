package xyz.streetscout.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Schema(
    name = "LoginRequest",
    description = "Schema to hold User login credentials")
public record LoginRequest(
        @Schema(description = "email")
        @Email
        String email,

        @Schema(description = "password")
        @NotBlank(message = "Password must not be empty")
        String password
) { }
