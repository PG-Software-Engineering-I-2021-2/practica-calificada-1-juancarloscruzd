package app;

import java.util.logging.Logger;

public class Student {
    private static Logger logger = Logger.getLogger(Student.class.getName());

    private final String name;

    public Student(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String subscribeStock(Book book, String email, String phone) {
        return String.format("The student will be notified when %s will be available to the email %s and the phone %s", book.getName(), email, phone);
    }

    public String subscribeOffer(Offer offer) {
        return String.format("Student will be notified when new books about %s arrive", offer.getTopic());
    }
}
