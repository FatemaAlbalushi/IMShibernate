package com.InstituteManagementSystemHibernate.IMShibernate.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="pre_course")
public class Course {
    @Id
    @GeneratedValue
    public int Courseid;
    @Column
    public String CourseName;


    @OneToOne(optional = true, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "teacher_id", referencedColumnName = "TeacherId")
    @JsonIgnore
    public Teacher CourseMentor;


    @JsonProperty("teacher_id")
    public Integer getMentorId(){
        return CourseMentor != null ? CourseMentor.TeacherId:null;
    }


//    public int getId() {
//        return Courseid;
//    }
//
//    public void setId(int id) {
//        this.Courseid = id;
//    }
//
//    public String getName() {
//        return CourseName;
//    }
//
//    public void setName(String name) {
//        this.CourseName = name;
//    }

//    public List<Student> getStudents() {
//        return students;
//    }
//
//    public void setStudents(List<Student> students) {
//        this.students = students;
//    }
//
//    public void addStudent(Student student) {
//        students.add(student);
//    }
//
//    public List<Teacher> getTeachers() {
//        return teachers;
//    }
//
//    public void setTeachers(List<Teacher> teachers) {
//        this.teachers = teachers;
//    }

//    public String getDescription() {
//        return CourseDescription;
//    }
//
//    public void setDescription(String description) {
//        this.CourseDescription = description;
//    }
}
