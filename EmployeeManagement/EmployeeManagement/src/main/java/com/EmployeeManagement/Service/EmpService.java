package com.EmployeeManagement.Service;

import com.EmployeeManagement.DTO.EmpResponseDTO;
import com.EmployeeManagement.Model.Employee;
import org.springframework.http.ResponseEntity;

public interface EmpService {

    ResponseEntity<EmpResponseDTO> findAllEmp();

    ResponseEntity<EmpResponseDTO> findById(long id);

    ResponseEntity<EmpResponseDTO> findBySalary();

    ResponseEntity<EmpResponseDTO> createNewEmployee(Employee emp);
}
