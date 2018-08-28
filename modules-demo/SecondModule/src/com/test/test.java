package com.test;

import com.emp.Employee;
//open module settings , select source module,
//select dependencies menu
//click on plus symbol add target module dependency
public class test {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.print(e.getName());
    }
}
