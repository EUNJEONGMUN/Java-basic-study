package javaTest;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] bookArr1 = new Book[3];
        Book[] bookArr2 = new Book[3];

        bookArr1[0] = new Book("첫번째 책", "일번");
        bookArr1[1] = new Book("두번째 책", "이번");
        bookArr1[2] = new Book("세번째 책", "삼번");

        bookArr2[0] = new Book();
        bookArr2[1] = new Book();
        bookArr2[2] = new Book();

        for (int i=0; i<bookArr1.length; i++) {
            bookArr2[i].setBookName(bookArr1[i].getBookName());
            bookArr2[i].setAuthor(bookArr1[i].getAuthor());
        }

        bookArr1[0].setBookName("변경한 책");
        bookArr1[0].setAuthor("변경");

        for (Book book : bookArr1) {
            book.showBookInfo();
        }
        System.out.println("==========");
        for (Book book : bookArr2) {
            book.showBookInfo();
        }
    }
}

class Book {
    String bookName;
    String author;

    public void showBookInfo() {
        System.out.println(bookName+" - "+author);
    }

    public Book() {
    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
