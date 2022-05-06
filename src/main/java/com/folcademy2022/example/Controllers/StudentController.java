package com.folcademy2022.example.Controllers;

import com.folcademy2022.example.Model.Entities.Student;
import com.folcademy2022.example.Service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(value = "")
    public ResponseEntity<List<Student>> listarStudents(){
        return ResponseEntity.ok(studentService.listarStudents());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<Student>> listarUno(@PathVariable(name = "id") Integer id){
        return ResponseEntity.ok(studentService.listarUno(id));
    }
}
