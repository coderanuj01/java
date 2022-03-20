package coreJavaAssign;

public class BookDemo {
    public static void main(String[] args) {
        BookClass maths = new BookClass("RD Sharma","Maths With RD Sharma",
                "Course book",776);
        BookClass harryPotter = new BookClass("AM smith","Harry Potter","Fiction",453);
        BookClass jungleBook = new BookClass("JK Rowling","JungleBook","Non-fictious",657);

        printBook(maths);
        printBook(harryPotter);
        printBook(jungleBook);

    }

    public static void printBook(BookClass book){
        System.out.println(book.getBookName());
        System.out.println("By " + book.getAuthor());
        System.out.println("It has " + book.getPages() + " pages and is " + book.getType());
        System.out.println();
    }
}
