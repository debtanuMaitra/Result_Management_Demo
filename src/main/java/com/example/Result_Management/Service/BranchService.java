package com.example.Result_Management.Service;

import com.example.Result_Management.Models.Branch;
import com.example.Result_Management.Repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService {

    @Autowired
    BranchRepository branchRepository;

    public void addBranch(Branch branch) {
        branchRepository.save(branch);
    }
}
