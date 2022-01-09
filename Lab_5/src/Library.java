import java.util.LinkedList;

public class Library {
    private static Library instance=null;
    private LinkedList<Book> booksInLib;

    private Library(LinkedList<Book> books) {
        this.booksInLib = books;
    }

    /*public void addBook(Book book){
        booksInLib.add(book);
    }*/

    public void printBooks(){
        for (Book s: booksInLib){
            s.showBookInfo();
        }
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    }
    public static Library getInstance(LinkedList<Book> booksInLib){
        if(instance==null){
            instance=new Library(booksInLib);
        }
        return instance;
    }
}
