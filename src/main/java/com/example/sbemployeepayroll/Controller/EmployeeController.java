package com.example.sbemployeepayroll.Controller;

import com.example.sbemployeepayroll.Model.EmployeeData;
import com.example.sbemployeepayroll.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    List<EmployeeData> list = new ArrayList<>();

    //Save Data
        @PostMapping("/save")
        public EmployeeData save(@RequestBody EmployeeData employeeData) {
            return employeeService.saveData(employeeData);
        }

        @GetMapping("/find/{id}")
        public Optional<EmployeeData> findById(@PathVariable int id){
            return employeeService.findById(id);
        }

        // showing all employee details

        @GetMapping("/list")
    public List<EmployeeData> show(){
            return employeeService.display();
        }

        /*
        @PutMapping("/edit/{id}")
    public EmployeeData edit(@RequestBody EmployeeData employeeData, @PathVariable int id){
            return employeeService.update(employeeData , id);
        }
        */

    //delete by id

        @DeleteMapping("/delete/{id}")
          public String delete(@PathVariable int id){
            return employeeService.deleteById(id);
        }


}

