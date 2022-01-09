public class BookFactory implements Copyable {
    private Book book;

    public BookFactory(Book book) {
        this.book = book;
    }

    @Override
    public Book copy(){
        return book;
    }
}
