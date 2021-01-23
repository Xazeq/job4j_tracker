package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book masterAndMargarita = new Book("Master and Margarita", 350);
        Book cleanCode = new Book("Clean code", 400);
        Book theGreatGatsby = new Book("The Great Gatsby", 450);
        Book fightClub = new Book("Fight club", 380);
        Book[] books = new Book[4];
        books[0] = masterAndMargarita;
        books[1] = cleanCode;
        books[2] = theGreatGatsby;
        books[3] = fightClub;
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Book \"" + book.getName() + "\" has " + book.getNumberPages() + " pages.");
        }
        Book tempBook = books[0];
        books[0] = books[3];
        books[3] = tempBook;
        System.out.println("Поменяны местами книги");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println("Book \"" + book.getName() + "\" has " + book.getNumberPages() + " pages.");
        }
        System.out.println("Вывод книги с именем \"Clean code\"");
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            if (book.getName().equals("Clean code")) {
                System.out.println("Book \"" + book.getName() + "\" has " + book.getNumberPages() + " pages.");
            }
        }
    }
}
