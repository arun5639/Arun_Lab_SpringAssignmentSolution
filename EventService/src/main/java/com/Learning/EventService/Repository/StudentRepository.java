package com.Learning.EventService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Learning.EventService.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
}
