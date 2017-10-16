package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Declare all variables

        Scanner keyboard = new Scanner(System.in);

        int size = 25;
        int counter = 0;
        String title[]= new String[size];
        String author[]= new String[size];
        String description[] = new String[size];
        String quit="";

        //Prompt user to enter any number of book titles, authors
        //and descriptions
        //When user is done entering titles then print them

        while(!quit.equalsIgnoreCase("quit"))
        {
            System.out.println("Enter the title of the book:");
            title[counter] = keyboard.nextLine();
            quit= title[counter];
            System.out.println("Enter a book author");
            author[counter] = keyboard.nextLine();
            quit= author[counter];
            System.out.println("Enter a description");
            description[counter] = keyboard.nextLine();
            quit= description[counter];

            counter++;


        }

        for(int i = 0; i < counter-1; i++)
        {
            System.out.print(title[i]);
            System.out.print("");
            System.out.print(author[i]);
            System.out.print("");
            System.out.print(description[i]);


        }

    }
}
