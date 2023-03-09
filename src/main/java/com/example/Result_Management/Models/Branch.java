package com.example.Result_Management.Models;

import com.example.Result_Management.Enums.BranchName;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="branches")
@Data
@NoArgsConstructor
public class Branch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private BranchName branchName;

    private String hodName;

    private int contactNo;

    @OneToMany(mappedBy = "branch", cascade = CascadeType.ALL)
    List<Student> studentList = new ArrayList<>();

    @OneToOne(mappedBy = "branch", cascade = CascadeType.ALL)
    private Grant grant;

}
