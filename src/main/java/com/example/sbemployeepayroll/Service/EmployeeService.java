package com.example.sbemployeepayroll.Service;

import com.example.sbemployeepayroll.Model.EmployeeData;
import com.example.sbemployeepayroll.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public EmployeeData saveData(EmployeeData employeeData) {
        return employeeRepo.save(employeeData);

    }

    public List<EmployeeData> display() {
        return employeeRepo.findAll();
    }

    /*
    public EmployeeData update(EmployeeData employeeData, int id) {
        EmployeeData employeeData1 = employeeRepo.findBy(id).get();
        if (employeeRepo.findBy(id).ispresent()) {
            employeeData1.setFirstName(employeeData.getFirstName());
            employeeData1.setLastName(employeeData.getLastName());
            employeeData1.setDepartment(employeeData.getDepartment());
            employeeData1.setMessage(employeeData.getMessage());
            employeeData1.setGender(employeeData.getGender());
            employeeData1.setSalary(employeeData.getSalary());
            return employeeRepo.save(employeeData);
        } else {
            return new EmployeeData("user id not found");
        }

     */


    public String deleteById(int id) {
        Optional<EmployeeData> employeeID = employeeRepo.findById(id);
        if(employeeID.isPresent()) {
            employeeRepo.deleteById(id);
            return "Employee data deleted";
        }
        else {
            return " id is not found";
        }
    }

    public Optional<EmployeeData> findById(int id) {
        return employeeRepo.findById(id);
    }
}
