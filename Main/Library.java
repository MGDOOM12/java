package Main;

import java.lang.classfile.instruction.ThrowInstruction;

public class Library {

    String name;
    int year; 
    Book[] books;


    Library(String name, int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("Current Available Books: ");
        for(Book book: books){
            System.out.println(book.displayInfo());
        }
    }
}
