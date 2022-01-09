import library.SAX;
import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;

public class Tests {
    private SAX sax;

    @Test
    public void checkFile(){
        File inputFile = new File("D:/BSUIR/5_term/SiTAiRIS/Labs/untitled/src/main/javaCode/library/resourse.xml");
        assertTrue(inputFile.canRead() && inputFile.exists());
    }

    @Test
    public void initSax(){
        sax = new SAX();
    }

    @Test
    public void checkLibrary(){

        assertNotNull(SAX.books.size());
        for (int i = 0; i < SAX.books.size(); i++) {
            assertNotNull(SAX.books.get(i).getTitle());
            assertNotNull(SAX.books.get(i).getAuthor());
            assertNotNull(SAX.books.get(i).getDate());
            assertNotNull(SAX.books.get(i).getCode());
            assertNotNull(SAX.books.get(i).getCost());
        }
    }
}
