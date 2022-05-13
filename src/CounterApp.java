public class CounterApp {
  public static void main(String[] args) {
    Counter counter1 = new Counter(1);
    Counter counter2 = new Counter(100);
    System.out.println("Counter1 start: " + counter1.value + "\nCounter2 start: " + counter2.value);
    counter1.increase(12);
    counter2.decrease(3);
    System.out.println("Counter1 increase: " + counter1.value + "\nCounter2 decrease: " + counter2.value);

    counter1.decrease(3);
    counter2.increase(5);
    System.out.println("Counter1 decrease: " + counter1.value + "\nCounter2 increase: " + counter2.value);
  }
  
}
