public class Book {
      public String title;
      public int pages;
      public int year;
  
      public Book(String title, int pages, int year){
          this.title = title;
          this.pages = pages;
          this.year = year;
      }
      public Book(){};
      public Book(String title){
          this.title=title;
      }
      public Book(int pages){
          this.pages=pages;
      }
      public void setTitle(String setTitle){
        setTitle= title;
            }
      public void setPages(int setPages){
          setPages=pages;
      }
      public void setYear(int setYear){
          setYear=year;
      }
  
      public String getTitle(){
          return title;
      }
      public String getPages(){
          return pages + " pages";
      }
      public int getYear(){
          return year;
      }
      public String toString(){
          return getTitle() + ", "+ getPages()+ ", " + getYear();
      }
  }

  

