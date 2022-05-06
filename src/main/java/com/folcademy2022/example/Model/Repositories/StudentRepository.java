package com.folcademy2022.example.Model.Repositories;

import com.folcademy2022.example.Model.Entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository("studentRepository")
public interface StudentRepository extends JpaRepository <Student, Integer> {
}
