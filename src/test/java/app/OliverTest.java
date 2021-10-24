package app;

import org.junit.Assert;
import org.junit.Test;

public class OliverTest {

    @Test
    public void searchShouldReturnOneBook(){
        Oliver oliver = Oliver.getInstance();
        oliver.registerBook("Algotihms", 1974, "Cormen", 10 );
        oliver.registerOffer("Computer Science", "Summer");
        oliver.registerStudent("Juan");

        Assert.assertEquals(1, oliver.search("Cormen").size());
    }

    @Test
    public void searchShouldReturnThreeBooks(){
        Oliver oliver = Oliver.getInstance();
        oliver.registerBook("Algotihms II", 1974, "Cormen", 10 );
        oliver.registerBook("Algotihms III", 1974, "Cormen", 10 );
        oliver.registerOffer("Computer Science", "Summer");
        oliver.registerStudent("Juan");

        Assert.assertEquals(3, oliver.search("Cormen").size());
    }
}
