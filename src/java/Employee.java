package com.kgc.entity;

/**
 * @author: Administrator
 * @Date: 2019/8/29 13:52
 * 员工类
 */
public class Employee {
    //成员变量
    private String empNo; //员工编号
    private String empName; //员工姓名
    private double salary; //薪水

    //无参构造函数
    public Employee() {
    }

    //有参构造函数
    public Employee(String empNo, String empName, double salary) {
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empNo='" + empNo + '\'' +
                ", empName='" + empName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
