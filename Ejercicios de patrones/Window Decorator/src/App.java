public class App {
     public static void main (String[] args) {
          ScrollingWindow sw1 = new ScrollingWindow();
          sw1 = new ScrollingWindowWithBorder(sw1);
          System.out.println(sw1.getDescription());


          ScrollingWindow sw2 = new ScrollingWindow();
          sw2 = new WindowWithBorder(sw2);
          System.out.println(sw2.getDescription());
     } 
}