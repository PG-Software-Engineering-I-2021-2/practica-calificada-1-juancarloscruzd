package app;

import org.junit.Assert;
import org.junit.Test;

public class OfferTest {

    @Test
    public void checkOffer(){
        Offer offer = new Offer("Computer Science", "summer");
        Assert.assertEquals("Computer Science", offer.getTopic());
        Assert.assertEquals("summer", offer.getSeason());
    }
}
