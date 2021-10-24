package app;

import java.util.ArrayList;
import java.util.List;

public class Oliver {
    private static Oliver instance;
    private List<Book> books = new ArrayList<>();
    private List<Offer> offers = new ArrayList<>();
    private List<Student> students = new ArrayList<>();

    public static Oliver getInstance() {
        if (instance == null) {
            instance = new Oliver();
        }

        return instance;
    }

    public void registerStudent(String name) {
        students.add(new Student(name));
    }

    public void registerBook(String name, Integer year, String author, Integer stock) {
        books.add(new Book(name, year, author, stock));
    }

    public void registerOffer(String topic, String season) {
        offers.add(new Offer(topic, season));
    }

    public List<Book> search(String searchTerm) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getName().equals(searchTerm) || book.getAuthor().equals(searchTerm)) {
                result.add(book);
            }
        }
        return  result;
    }
}
