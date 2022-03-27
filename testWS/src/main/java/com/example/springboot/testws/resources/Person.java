package com.example.springboot.testws.resources;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 *
 * @author PAULASABOGAL
 */
@XmlRootElement(name = "persona")
@XmlType(propOrder = {"id", "fullName", "age"})
public class Person {

    private int id;
    private String fullName;
    private int age;
    private int salary;
    public Person() {
    }

    @XmlElement
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @XmlElement
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
