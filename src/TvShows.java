public class TvShows {
  
  public String name;
  public String episodes;
  public String genre;

  public TvShows(String name, String episodes, String genre) {
    this.name=name;
    this.episodes=episodes;
    this.genre=genre;
  }

  public TvShows(){}

  public TvShows(String name, String episodes){
      this.name=name;
      this.episodes= episodes;
  }


  public TvShows(String episodes){
      this.episodes=episodes;
  }

  public String getName(){
    return name;
  }

  public String getEpisodes(){
    return episodes;
  }

  public String getGenre(){
    return genre;
  }

  @Override
  public String toString(){
   return "The name of the show is " + getName() + " with " + getEpisodes() + " number of episodes. The genres is " + getGenre() + ".";
  }
}
