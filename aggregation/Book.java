public class Book {

    String name;
    int pages;

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    String displayInfo() {
        return name + " (" + pages + " pages)";
    }
}
