package com.example.backend.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.sql.ast.tree.update.Assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate cohortStartDate;
    private String username;
    private String password;
//    private List<Assignment> assignments = new ArrayList<>();


}
