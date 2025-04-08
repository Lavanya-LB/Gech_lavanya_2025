package com.Form.Validation.service;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Form.Validation.dto.StudentDTO;
import com.Form.Validation.model.StudentValidations;
import com.Form.Validation.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void saveStudent(StudentDTO studentDTO) {
        MultipartFile image = studentDTO.getImage();
        Date createdAt = new Date();
        String storeImageName = createdAt.getTime() + "_" + image.getOriginalFilename();
        System.out.println("Image Name: " + storeImageName);

        try {
            String uploadDir = "src/main/resources/static/images"; // Ensure this directory exists
            Path uploadPath = Paths.get(uploadDir);

            if (!Files.exists(uploadPath)) {
                Files.createDirectories(uploadPath);
            }

            try (InputStream inputStream = image.getInputStream()) {
                Files.copy(inputStream, uploadPath.resolve(storeImageName), StandardCopyOption.REPLACE_EXISTING);
            }

        } catch (Exception e) {
            System.out.println("Image Upload Error: " + e.getMessage());
        }

        // Save student to DB
        StudentValidations student = new StudentValidations();
        student.setName(studentDTO.getName());
        student.setAge(studentDTO.getAge());
        student.setEmail(studentDTO.getEmail());
        student.setPassword(studentDTO.getPassword());
        student.setImagepath(storeImageName); // ✅ Save filename only
        studentRepository.save(student);
    }

    // Other service methods like getAllStudents(), deleteStudent(), etc...
}
