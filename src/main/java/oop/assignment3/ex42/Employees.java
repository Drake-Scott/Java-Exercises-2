package oop.assignment3.ex42;

public class Employees {

    private String lname;
    private String fname;
    private float salary;


    public Employees(String lname, String fname, float salary) {
        this.lname = lname;
        this.fname = fname;
        this.salary = salary;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
