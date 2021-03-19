package com.amigoscode.methodprograms;

public class Employee {

    private String name;
    private int empId;
    private String jobDesc;

    public Employee(String name, int empId, String jobDesc) {
        this.name = name;
        this.empId = empId;
        this.jobDesc = jobDesc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                ", jobDesc='" + jobDesc + '\'' +
                '}';
    }
}
