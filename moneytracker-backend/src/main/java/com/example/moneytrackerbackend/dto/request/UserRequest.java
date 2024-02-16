package com.example.moneytrackerbackend.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UserRequest {
    private Long userId;
    @NotBlank(message = "Username must not null")
    private String username;
    private MultipartFile avatar;
    @NotBlank
    @Email
    private String email;
    @NotBlank(message = "Phone number must not null")
    private String phoneNumber;
}
