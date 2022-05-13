import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class BookApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Book> bookList = new ArrayList<>();
    bookList.add(new Book("All my friends are dead", 96, 2010));
    Book book1 = new Book();
    book1.setTitle("I knew ya'll were gonna hit us with some bs assignment after that slow java week");
    book1.setPages(666);
    book1.setYear(2022);
    Book book2 = new Book(666);
    book2.setTitle("Why does the pace of this curriculumn feel like an abusive relationship, love bombing with easy assignments and then BAM back to the bs");
    book2.setYear(2001);
    bookList.addAll(Arrays.asList(book1, book2));
    bookList.add(new Book("People I want to punch in the face", 110, 2017));
    bookList.add(new Book("The body keeps the score", 464, 2014));
    System.out.println("Lets see if this works or nah? Enter 'works or nah");
    String reply = scanner.nextLine();

    for (int i=0; i<bookList.size();i++){
        if(reply.equals("works")|| reply.equals("everything")){
            System.out.println(bookList.get(i).toString());
        }else if(reply.equals("name")){
            System.out.println(bookList.get(i).getTitle());
        }else{
            System.out.println("That is not an applicable reply");
        }
    }
}
  }
  

