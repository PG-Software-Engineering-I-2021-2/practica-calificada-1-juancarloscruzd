package app;

public class Book {
    private final String name;
    private final Integer year;
    private final String author;
    private final Integer stock;

    public Book(String name, Integer year, String author, Integer stock) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.stock = stock;
    }

    public Integer getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Integer getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }
}
