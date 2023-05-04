package com.github.xronys.projects.springboot_data_jpa.DAO;




import com.github.xronys.projects.springboot_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    public List<Employee> findAllByName(String name);

}
