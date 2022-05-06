package com.folcademy2022.example.Service;

import com.folcademy2022.example.Model.Entities.Student;
import com.folcademy2022.example.Model.Repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("StudentService")
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> listarStudents(){
        return studentRepository.findAll();
    }

    public List<Student> listarUno(Integer id){
        List<Student> lista = new ArrayList<>();
        Student student = studentRepository.findById(id).get();
        lista.add(student);
        return lista;
    }

}
