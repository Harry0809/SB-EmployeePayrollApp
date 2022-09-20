package com.example.sbemployeepayroll.Repository;

import com.example.sbemployeepayroll.Model.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeData, Integer> {

}
