package tech.group.employee.manager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.group.employee.manager.Services.employeeService;
import tech.group.employee.manager.model.employee;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin(origins = "http://localhost:45841") // Replace with your frontend URL

@RestController
@RequestMapping(path="/api")
public class employeeController {
    @Autowired
    employeeService emplService;
    @PostMapping(path="/addEmploye")
    public employee addEmployee(@RequestBody employee Employee){
      return  emplService.addEmployee(Employee);

    }

    @GetMapping(path="/GetAllEmployees")
    public List<employee> GetAllEmployees(){
        return  emplService.GetAllEmployees();
    }

    @PutMapping(path="/updateEmploye/{id}")
    public employee updateEmploye(@RequestBody employee Employee,@PathVariable Long id){
        return  emplService.updateEmploye(Employee,id);

    }

    @DeleteMapping(path="/deleteEmploye/{id}")
    public String deleteEmploye(@PathVariable Long id){
        return  emplService.deleteEmploye(id);

    }
}
