import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // isme göre sıralamak için:
        // TreeSet<Book> books = new TreeSet<>(new OrderNameComparator());

        // sayfa sayısına göre sıralamak için:
        TreeSet<Book> books = new TreeSet<>(new OrderPageComparator());

        books.add(new Book("Tutunamayanlar", 671, "Oğuz Atay", 1970));
        books.add(new Book("Mai ve Siyah", 328, "H.Ziya Uşaklıgil", 1897));
        books.add(new Book("Murtaza", 438, "Orhan Kemal", 1952));
        books.add(new Book("Serenad", 481, "Zülfü Livaneli", 2011));
        books.add(new Book("Mai ve Siyah", 328, "H.Ziya Uşaklıgil", 1897));
        books.add(new Book("Tehlikeli Oyunlar", 479, "Oğuz Atay", 1973));


        for (Book bk : books) {
            System.out.println(bk.getPage());
        }


    }
}
