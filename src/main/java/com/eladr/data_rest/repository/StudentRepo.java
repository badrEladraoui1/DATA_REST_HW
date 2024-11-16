package com.eladr.data_rest.repository;

import com.eladr.data_rest.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StudentRepo extends JpaRepository<Student , Integer> {

    List<Student> findStudentsByFirstName(@Param("name") String name);
}
