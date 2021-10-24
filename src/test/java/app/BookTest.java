package app;

import org.junit.Assert;
import org.junit.Test;

public class BookTest {

    @Test
    public void checkBook() {
        Book book = new Book("Algotihms II", 1974, "Cormen", 10 );
        Assert.assertEquals( "1974", book.getYear().toString());
        Assert.assertEquals( "10", book.getStock().toString());
    }
}
