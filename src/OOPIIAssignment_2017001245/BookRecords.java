package OOPIIAssignment_2017001245;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

//Matthew Cole - 2017001245
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
        public static void ReadFromFile() throws IOException, ClassNotFoundException{

            try {
                FileInputStream file = new FileInputStream("Order.dat");
                ObjectInputStream objIn = new ObjectInputStream(file);

                Books = (ArrayList<Book>) objIn.readObject();

            }catch (IOException  | ClassNotFoundException ex){

                throw ex;
            }
        }
        public static void WriteToFile() throws IOException {

            try {


                FileOutputStream file = new FileOutputStream("Order.dat");

                ObjectOutputStream objOut = new ObjectOutputStream(file);

                objOut.writeObject(Books);

                file.close();
                objOut.close();


            }catch (IOException ex){
                throw ex;
            }

        }
    }

}
