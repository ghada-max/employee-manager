package tech.group.employee.manager.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.group.employee.manager.model.employee;
import tech.group.employee.manager.repository.employeerepo;

import java.util.List;
import java.util.Optional;

@Service
public class employeeService {
    @Autowired
    employeerepo employeeRepo;

    public employee addEmployee(employee Employee){
        employee Empl=new employee();
        Empl.setEmail(Employee.getEmail());
        Empl.setName(Employee.getName());
        Empl.setJobTitle(Employee.getJobTitle());
        Empl.setPhone(Employee.getPhone());
        Empl.setImageUrl(Employee.getImageUrl());
        Empl.setEmployeeCode(Employee.getEmployeeCode());
       return employeeRepo.save(Empl);

    }

   public List<employee> GetAllEmployees(){
       return employeeRepo.findAll();
   }

    public employee updateEmploye(employee Employee, Long id) {
     //   employee Empl=new employee();
        employee Empl = employeeRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        Empl.setEmail(Employee.getEmail());
        Empl.setName(Employee.getName());
        Empl.setJobTitle(Employee.getJobTitle());
        Empl.setPhone(Employee.getPhone());
        Empl.setImageUrl(Employee.getImageUrl());
        Empl.setEmployeeCode(Employee.getEmployeeCode());
        return employeeRepo.save(Empl);

    }

    public String deleteEmploye(Long id) {
        employeeRepo.deleteById(id);
        return "Employee deleted successfully";
    }
}
