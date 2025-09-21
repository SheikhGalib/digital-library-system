public class RealEbook implements EBookBook {
    private String filename;

    public RealEbook(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying ebook: " + filename);
    }

    private void loadFromDisk() {
        System.out.println("Loading ebook from disk: " + filename);
        // Simulate a time-consuming operation
        try {
            Thread.sleep(2000); // Simulate delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
