public class Array_4 {
  public static void main(String[] args) {
    int[] days = new int[12];
    for (int i = 0; i < days.length; i++) {
      days[i] = i * 100;
    }
    for (int i : days) {
      
      System.out.println(i);    
    }
    
      
  }
}
