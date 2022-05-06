package com.folcademy2022.example.Model.Entities;



import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", columnDefinition = "INT(10) UNSIGNED")
    public Integer id;
    @Column(name = "firstName", columnDefinition = "VARCHAR")
    public String firstName;
    @Column(name = "lastName", columnDefinition = "VARCHAR")
    public String lastName;
    @Column(name = "email", columnDefinition = "VARCHAR")
    public String email;
}
