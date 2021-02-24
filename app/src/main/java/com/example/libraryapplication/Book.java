package com.example.libraryapplication;

public class Book {
    /*This clas will show the list of all books*/
    private int id,pages;
    private String name,author,imageURL,shortDesc,longDesc,linkToBook,linkName;
    private boolean isExpanded;

    /*Constructors, getters and setters*/

    public Book(int id, int pages, String name, String author, String imageURL, String shortDesc, String longDesc, String linkToBook, String linkName, boolean isExpanded) {
        this.id = id;
        this.pages = pages;
        this.name = name;
        this.author = author;
        this.imageURL = imageURL;
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.linkToBook = linkToBook;
        this.linkName = linkName;
        this.isExpanded = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", pages=" + pages +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", shortDesc='" + shortDesc + '\'' +
                ", longDesc='" + longDesc + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public String getLinkToBook() {
        return linkToBook;
    }

    public void setLinkToBook(String linkToBook) {
        this.linkToBook = linkToBook;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public boolean isExpanded() {
        return isExpanded;
    }

    public void setExpanded(boolean expanded) {
        isExpanded = expanded;
    }
}
