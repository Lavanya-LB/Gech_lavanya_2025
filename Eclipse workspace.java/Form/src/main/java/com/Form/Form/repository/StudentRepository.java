package com.Form.Form.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Form.Form.model.Student;  // Ensure correct import

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
