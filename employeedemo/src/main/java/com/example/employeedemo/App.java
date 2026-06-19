package com.example.employeedemo;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EmployeeDAO dao = new EmployeeDAO();

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT =====");

            System.out.println("1. Insert Employee");
            System.out.println("2. Display All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Employee ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Employee Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String dept = sc.nextLine();

                System.out.print("Enter Salary: ");
                double sal = sc.nextDouble();

                sc.nextLine();

                System.out.print("Enter Joining Date: ");
                String jdate = sc.nextLine();

                Employee e =
                        new Employee(id,name,dept,sal,jdate);

                dao.save(e);

                System.out.println(
                        "Employee Inserted Successfully");

                break;



            case 2:

                List<Employee> employees =
                        dao.findAll();

                System.out.println(
                        "\nEmployees List:");

                for (Employee emp : employees) {

                    System.out.println(emp);

                }

                break;



            case 3:

                System.out.print(
                        "Enter Employee ID to Update: ");

                int uid = sc.nextInt();

                Employee up =
                        dao.findById(uid);

                if (up != null) {

                    sc.nextLine();

                    System.out.print(
                            "Enter New Name: ");

                    String newName =
                            sc.nextLine();

                    System.out.print(
                            "Enter New Department: ");

                    String newDept =
                            sc.nextLine();

                    System.out.print(
                            "Enter New Salary: ");

                    double newSal =
                            sc.nextDouble();

                    sc.nextLine();

                    System.out.print(
                            "Enter New Joining Date: ");

                    String newJdate =sc.nextLine();

                    up.setName(newName);

                    up.setDept(newDept);

                    up.setSal((int) newSal);

                    up.setJdate(newJdate);

                    dao.update(up);

                    System.out.println(
                            "Employee Updated Successfully");        }

                else {

                    System.out.println(
                            "Employee Not Found");

                }

                break;



            case 4:

                System.out.print(
                        "Enter Employee ID to Delete: ");

                int did = sc.nextInt();

                dao.delete(did);

                System.out.println(
                        "Employee Deleted Successfully");

                break;



            case 5:

                System.out.println("Thank You!");

                sc.close();

                System.exit(0);



            default:

                System.out.println("Invalid Choice");

            }

        }

    }

}