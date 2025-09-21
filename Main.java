public class Main {
    // simulating multiple students accessing ebooks with lazy loading
    public static void main(String[] args) {
        EBook ebook1 = new RealEbook("Head First Java", "5MB");
        EBook ebook2 = new RealEbook("Design Patterns", "3MB");
        EBook ebook3 = new RealEbook("C++ the complete reference", "4MB");
        EBook ebook4 = new RealEbook("100 days of Machine learning", "6MB");

        // Display simulation
        ebook1.display();
        ebook2.display();
        ebook3.display();
        ebook4.display();
    }
}

