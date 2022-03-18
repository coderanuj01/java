package coreJavaAssign;

public class BookClass {
    private String author;
    private String bookName;
    private String type;
    private int pages;

    public BookClass(String author,String bookName,String type, int pages){
        this.author = author;
        this.bookName = bookName;
        this.type = type;
        this.pages = pages;
    }

    public String getAuthor(){
        return author;
    }
    public String getBookName(){
        return bookName;
    }
    public String getType(){
        return type;
    }
    public int getPages(){
        return pages;
    }
}
