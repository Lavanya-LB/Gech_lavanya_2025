package com.Form.Validation.dto;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class StudentDTO {

    @NotBlank(message = "Student name is required")
    private String name;

    @Min(value = 10, message = "Age must be at least 10")
    private int age;

    @NotBlank(message = "Student email is required")
    private String email;

    @NotBlank(message = "Student password is required")
    private String password;

    private MultipartFile image;

    // 🔹 Default Constructor
    public StudentDTO() {}

    // 🔹 Getters and Setters
    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
