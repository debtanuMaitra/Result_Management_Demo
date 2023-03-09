package com.example.Result_Management.Models;

import com.example.Result_Management.Enums.BranchName;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="students")
@Data
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int rollNo;

    private int marks;

    @Enumerated(value = EnumType.STRING)
    private BranchName branchName;

    @ManyToOne
    @JoinColumn
    private Branch branch;

}
