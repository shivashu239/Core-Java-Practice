class Book {
    private String title;
    private boolean isIssue;

    public void setTitle ( String title) {
        this.title = title;
        System.out.println( "Title of book is = " + title);
    }
    public void setIssueBook( boolean isIssue) {
        if( isIssue == true) {
            System.out.println( " Already issued");
        }
        else {
            System.out.println( " Not Issued");
        }
    }
    public void setReturnBook( boolean Return) {
        if( Return == true) {
            System.out.print(" Already returned");
        }
        else {
            System.out.println(" Book not returned");
        }
    }
    public void setStatus( boolean status) {
        if ( status == true) {
            System.out.println( " Book is Issued");
        }
        else {
            System.out.println(" Book is available");
        }
    }
       
}

public class LibraryBook {
    public static void main(String[] args) {
        Book b1 = new Book();

        b1.setTitle("Java");
        b1.setIssueBook(true);
        b1.setReturnBook(false);
        b1.setStatus(false);
    }
}