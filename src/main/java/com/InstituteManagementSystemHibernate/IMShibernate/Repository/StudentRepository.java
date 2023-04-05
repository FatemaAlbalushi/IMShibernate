package com.InstituteManagementSystemHibernate.IMShibernate.Repository;


import com.InstituteManagementSystemHibernate.IMShibernate.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student,Integer> {

}