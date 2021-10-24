package app;

import org.junit.Assert;
import org.junit.Test;

public class OliverTest {

    @Test
    public void searchShouldReturnZeroBook(){
        Oliver oliver = Oliver.getInstance();
        oliver.registerOffer("Computer Science", "Summer");
        oliver.registerStudent("Juan");

        Assert.assertEquals(0, oliver.search("Shakespeare").size());
    }

    @Test
    public void searchShouldReturnOneBook(){
        Oliver oliver = Oliver.getInstance();
        oliver.registerBook("Algotihms II", 1974, "Cormen", 10 );
        oliver.registerOffer("Computer Science", "Summer");
        oliver.registerStudent("Juan");

        Assert.assertEquals(1, oliver.search("Cormen").size());
    }

    @Test
    public void searchShouldReturnThreeBooks(){
        Oliver oliver = Oliver.getInstance();
        oliver.registerBook("Algotihms III", 1974, "Cormen", 10 );
        oliver.registerOffer("Computer Science", "Summer");
        oliver.registerStudent("Juan");

        Assert.assertEquals(2, oliver.search("Cormen").size());
    }
}
