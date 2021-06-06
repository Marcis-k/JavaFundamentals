package carObject;

public class Book {
    public String title;        // public field
    public String author;
    private int numberOfPages;  // private field

    private void setTitle(String title){
        this.title= title;
    }
    private void setAuthor(String author){
        this.author=author;
    }

    private String getTitle(){
        return title;
    }
    private String getAuthor(){
        return author;
    }

    public void setNumberOfPages(int numberOfPages) {   // public method
        if (isNumberOfPagesIsCorrect(numberOfPages)) {
            this.numberOfPages = numberOfPages;
        } else {
            System.out.println("The provided number of pages is incorrect: "+  numberOfPages);
        }
    }

    private boolean isNumberOfPagesIsCorrect(int numberOfPages) {   // private method
        return numberOfPages > 0;
    }
}
