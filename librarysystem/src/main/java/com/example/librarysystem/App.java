package com.example.librarysystem;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LibraryDAO dao = new LibraryDAO();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Book ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                System.out.print("Enter Book Title: ");
                String title = sc.nextLine();

                System.out.print("Enter Category: ");
                String category = sc.nextLine();

                System.out.print("Enter Price: ");
                double price = sc.nextDouble();

                System.out.print("Enter Available Copies: ");
                int availableCopies = sc.nextInt();

                Library l =
                        new Library(
                                id,
                                title,
                                category,
                                price,
                                availableCopies);

                dao.save(l);

                System.out.println(
                        "Book Added Successfully");

                break;



            case 2:

                List<Library> books =
                        dao.findAll();

                System.out.println(
                        "\nBooks List:");

                for (Library b : books) {

                    System.out.println(b);

                }

                break;



            case 3:

                System.out.print(
                        "Enter Book ID to Update: ");

                int uid = sc.nextInt();

                Library up =
                        dao.findById(uid);

                if (up != null) {

                    sc.nextLine();

                    System.out.print(
                            "Enter New Title: ");

                    String newTitle =
                            sc.nextLine();

                    System.out.print(
                            "Enter New Category: ");

                    String newCategory =
                            sc.nextLine();

                    System.out.print(
                            "Enter New Price: ");

                    double newPrice =
                            sc.nextDouble();

                    System.out.print(
                            "Enter New Available Copies: ");

                    int newCopies =
                            sc.nextInt();

                    up.setTitle(newTitle);

                    up.setCategory(newCategory);

                    up.setPrice((int)newPrice);

                    up.setJAvailableCopies(newCopies);

                    dao.update(up);

                    System.out.println(
                            "Book Updated Successfully");

                }

                else {

                    System.out.println(
                            "Book Not Found");

                }

                break;



            case 4:

                System.out.print(
                        "Enter Book ID to Delete: ");

                int did = sc.nextInt();

                dao.delete(did);

                System.out.println(
                        "Book Deleted Successfully");

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