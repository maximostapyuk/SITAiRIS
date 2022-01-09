package library;

import library.Book;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class SAX {
    public static LinkedList<Book> books = new LinkedList<>();
    private LinkedList<Book> library;

    public void readInfo() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("resourse.xml"), handler);
        this.setLibrary(books);
    }

    private static class XMLHandler extends DefaultHandler {
        @Override
        public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
            if (qName.equals("Book")) {
                books.add(new Book(attributes.getValue("Title"), attributes.getValue("Author"),
                        Integer.valueOf(attributes.getValue("Date")),attributes.getValue("Code"),
                        Float.valueOf(attributes.getValue("Cost"))));
            }
        }
    }

    public void setLibrary(LinkedList<Book> library) {
        this.library = library;
    }

    public LinkedList<Book> getLibrary() {
        return library;
    }
}
