package library;

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
    public static LinkedList<Book> books=new LinkedList<>();

    public static void readInfo() throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        XMLHandler handler = new XMLHandler();
        parser.parse(new File("src/xmlResourse.xml"), handler);
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
}
