package Practice;


 class Writer {
    public static void write() {
        System.out.println("Writing");
    }
}
class Author extends Writer {
    public static void write() {
        System.out.println("Writing book");
    }
}
public class Programmer extends Writer {

    public static  void write() {
        System.out.println("Writing code");
    }

    public static void main(String[] args) {
        Writer w = new Programmer();
        w.write();

//        Writer secondWriter = new Author();
//        secondWriter.write();
//
//        Writer thirdWriter = null;
//        thirdWriter.write();
//
//        Author firstAuthor = new Author();
//        firstAuthor.write();
    }
}