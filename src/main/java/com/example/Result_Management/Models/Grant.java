package com.example.Result_Management.Models;

import com.example.Result_Management.Enums.BranchName;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="grant")
@Data
@NoArgsConstructor
public class Grant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int grant;

    @OneToOne
    @JoinColumn
    private Branch branch;
}
