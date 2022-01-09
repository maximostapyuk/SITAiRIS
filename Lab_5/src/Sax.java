import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Sax {
    private static LinkedList<Book> books=new LinkedList<>();

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("src/xmlResourse.xml"), handler);

        Library library=Library.getInstance(books);
        library.printBooks();

        Book book1=new Book("Маленький принц", "Антуан Де Сент Экзюпери", 1895,"425-17-94",(float)40.11);
        books.add(book1);
        Library library1 = Library.getInstance(books);
        System.out.println("Бибилотека 1: ");
        library.printBooks();
        System.out.println("Бибилотека 2: ");
        library1.printBooks();

        books.add(book1);
        Library library2 = Library.getInstance(books);
        System.out.println("Бибилотека 3: ");
        library2.printBooks();

        /*Book book=new Book("Кавказская пленница", "Александр Сергеевич Пушкин", 1835,"647-20-03",(float)36.31);
        BookFactory bookFactory=new BookFactory(book);
        library.addBook(bookFactory.copy());
        library.printBooks();*/


    }

    private static class XMLHandler extends DefaultHandler {
        @Override
        public void startDocument() throws SAXException {
            System.out.println("Начало парсинга документа");
        }

        @Override
        public void endDocument() throws SAXException {
            System.out.println("Конец парсинга документа");
        }

        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("Book")) {
                books.add(new Book(attributes.getValue("Title"), attributes.getValue("Author"),
                        Integer.valueOf(attributes.getValue("Date")),attributes.getValue("Code"),
                        Float.valueOf(attributes.getValue("Cost"))));
            }
        }
    }
}
