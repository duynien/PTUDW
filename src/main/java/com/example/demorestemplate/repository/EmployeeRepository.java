package com.example.demorestemplate.repository;

import com.example.demorestemplate.model.entity.Employee;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends BaseRepository<Employee> {
    Employee findByEmailAndPassword(String email,String password);
    @Modifying
    @Query(value = "update Employee e set e.status = :status where e.id = :id")
    void updateStatus(@Param("status") String status,@Param("id") int id);
    @Query(value = "select max (id) from employee",nativeQuery = true)
    int getMaxId();
    boolean existsByEmail(String email);
    @Query(value = "select * from employee where status = 'active'",nativeQuery = true)
    Employee getEmployeeByByStatus();
    @Modifying
    @Query(value = "update Employee set status = 'inactive' where status = 'active'",nativeQuery = true)
    void logout();
}
