package com.example.Result_Management.Controller;

import com.example.Result_Management.Models.Branch;
import com.example.Result_Management.Service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    BranchService branchService;

    @PostMapping("/add-branch")
    public String addBranch(@RequestBody Branch branch) {
        System.out.println(branch.toString());
        branchService.addBranch(branch);

        return "Branch added successfully";
    }
}
