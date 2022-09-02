package oop;

public class Book {
    public String name;
    public int pageNumber;
    public String autor;
    public String publisher;
    public double price;

    public Book() {
    }

    public Book(String name, int pageNumber, String autor, String publisher, double price) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.autor = autor;
        this.publisher = publisher;
        this.price = price;
    }

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Seker portakalı";
        book1.pageNumber = 80;
        book1.autor = "Jose Mauro";
        book1.price = 25;
        book1.publisher = "Can Yayınları";
        Book book2 = new Book("okul ",12,"osman","ali",25);



    }
}
