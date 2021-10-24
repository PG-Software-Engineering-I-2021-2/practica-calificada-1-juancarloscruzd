package app;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void shouldNotifyBookStock(){
        Student student = new Student("Juan");
        Book book = new Book("Algorithms", 1970, "Cormen", 10);
        Assert.assertEquals(
                "The student will be notified when Algorithms will be available to the email juan@gmail.com and the phone 991384885",
                student.subscribeStock(book, "juan@gmail.com", "991384885"));
    }

    @Test
    public void shouldNotifyOffers(){
        Student student = new Student("Juan");
        Offer offer = new Offer("Computer Science", "Summer");
        Assert.assertEquals(
                "Student will be notified when new books about Computer Science arrive",
                student.subscribeOffer(offer));
    }

    @Test
    public void userRegister() {
        Student student = new Student("pepe");
        Assert.assertEquals("pepe", student.getName());
    }
}
