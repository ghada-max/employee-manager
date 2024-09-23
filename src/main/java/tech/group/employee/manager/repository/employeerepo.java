package tech.group.employee.manager.repository;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tech.group.employee.manager.model.employee;

@Repository
public interface employeerepo extends JpaRepository<employee,Long> {

   }
