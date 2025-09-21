public class RealEbook implements EBook {
    private String bookTitle;
    private String bookSize;

    public RealEbook(String bookTitle, String bookSize) {
        this.bookTitle = bookTitle;
        this.bookSize = bookSize;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying ebook: " + bookTitle);
    }

    @Override
    public String getTitle() {
        return bookTitle;
    }

    @Override
    public String getSize() {
        return "Size of ebook " + bookTitle + " is " + bookSize;
    }

    private void loadFromDisk() {
        System.out.println("Loading ebook from disk: " + bookTitle);
        // Simulate a time-consuming operation
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
