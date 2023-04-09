package com.InstituteManagementSystemHibernate.IMShibernate.Controller;

import com.InstituteManagementSystemHibernate.IMShibernate.Model.Student;
import com.InstituteManagementSystemHibernate.IMShibernate.Service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * The MainController class is a REST controller for managing student data in the Institute Management System.
 */
@RestController
@RequestMapping(path = "/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    /**
     * Retrieve a list of all students
     * @return a list of all students
     */
    @GetMapping
    public List<Student> getStudent(){
        return studentService.getAllStudent();
    }

    /**
     * Retrieve a specific student by ID
     * @param id the ID of the student to retrieve
     * @return the student with the specified ID
     */
    @GetMapping(path = "/{id}")
    public Optional<Student> getStudent(@PathVariable(name="id") int id){
        return studentService.getSpecificStudentInfo(id);
    }

    /**
     * Create a new student
     * @param currStudent the student to create
     * @return the newly created student
     */
    @PostMapping
    public Student createStudent(@Valid @RequestBody Student currStudent){
        studentService.createStudent(currStudent);
        return currStudent;
    }

    /**
     * Update an existing student
     * @param id the ID of the student to update
     * @param currStudent the updated student data
     * @return the updated student
     */
    @PutMapping(path = "/{id}")
    public Optional<Student> updateStudent(@PathVariable(name="id") int id, @RequestBody Student currStudent){
        return studentService.updateStudent(id, currStudent);

    }

    /**
     * Delete a student
     * @param id the ID of the student to delete
     * @return the deleted student
     */
    @DeleteMapping(path = "/{id}")
    public Optional<Student> deleteStudent(@PathVariable(name="id") int id) {
        return studentService.deleatStudent(id);
    }
}
