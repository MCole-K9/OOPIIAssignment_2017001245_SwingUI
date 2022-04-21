package OOPIIAssignment_2017001245;

import java.util.ArrayList;
import java.util.List;

public class BookRecords {

    static class ListRecords{

        private static List<Book> Books  = new ArrayList<Book>();

        public static List<Book> GetRecords(){

            return Books;
        }
        public static void AddRecord(Book book){

            Books.add(book);
        }
    }

    static class FileRecords{

        private static List<Book> Books  = new ArrayList<Book>();

        public static List<Book> GetRecords(){

            return Books;
        }

        public static void AddRecord(Book book){

            Books.add(book);
        }
        public static void ReadFromFile(){

        }
        public static void WriteToFile(){

        }
    }

}
