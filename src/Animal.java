public class Animal {
   
   public String name;
   public boolean dog;

   public Animal(String name, boolean dog){
       this.name = name;
       this.dog = dog;
   }

    public  Animal(String name) {
    this.name = name;
    }

    public Animal(Boolean dog){
    this.dog = dog;
    }

    public Animal(){

    }

   public String getName(){
       return name;
   }

   public boolean getDog(){
       return dog;
   }

   @Override
   public String toString(){
    return getName() + " is a dog = " + getDog();  }

}


