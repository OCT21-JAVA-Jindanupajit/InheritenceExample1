package com.company;

public final class Book extends Product {

    private String author;
    private int pages;

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        return super.equals(obj)&&
                author.equals(book.getAuthor()) &&
                (pages == book.getPages()) ;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Author:             "+ author +"\n" +
                "Pages:              "+ pages + "\n";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
