package com.InstituteManagementSystemHibernate.IMShibernate.Repository;

import com.InstituteManagementSystemHibernate.IMShibernate.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CourseRepository extends JpaRepository<Course,Integer> {

}