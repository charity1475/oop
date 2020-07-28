package Mypackage;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args){
        ArrayList<Book> books = populateLibrary();
        /* Stream uses internal iteration, for each use
        foreach using streams, collecting and save then
        work on collected books filter is a lazy method
        and the foreach is eiger method */
        books.stream().filter(book ->{
            return book.getAuthor().startsWith("J");
        }).forEach(System.out::println);
    }
    static ArrayList<Book> populateLibrary(){
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Jim Collins","The call of dead"));
        books.add(new Book("Victor Herman","Classified"));
        books.add(new Book("John Come","Downtime ages"));
        books.add(new Book("July Tales","The Landmark of truth"));
        books.add(new Book("Abdul Millard","I was kidnapped"));
        books.add(new Book("Jasmine Trinidad","The murder chose me "));
        return books;
    }
}
