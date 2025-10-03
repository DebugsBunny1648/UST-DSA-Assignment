package OOPS;

interface Printable {
    void printDetails();

    void getStatus(String message);
}

class Document implements Printable {
    private String title;
    private int pageCount;

    public Document(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public void printDetails() {
        System.out.println("--- Document Information ---");
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pageCount);
    }

    @Override
    public void getStatus(String message) {
        System.out.println("Status Report: " + message);
    }
}

public class P3 {
    public static void main(String[] args) {
        Document report = new Document("Quarterly Financials", 45);

        System.out.println("Interface Method Calls:");
        
        report.printDetails();
        report.getStatus("Ready for review.");
    }
}
