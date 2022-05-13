import java.util.Scanner;
import java.util.ArrayList;

public class TvShowsApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<TvShows> tvShowsInputArray = new ArrayList<>();

    while (true) {

      System.out.print("Name of the show: ");
      String title = scanner.nextLine();
      //else is not needed cause if dont need
      if(title.isEmpty()){
        break;
      }
      System.out.print("How many episodes: ");
      String episodes = scanner.nextLine();
      System.out.print("What is the genre:");
      String genre = scanner.nextLine();
      tvShowsInputArray.add(new TvShows(title, episodes, genre));
  }
    for(TvShows tvShowsObject : tvShowsInputArray){
      System.out.println(tvShowsObject);
    }
  }
}
