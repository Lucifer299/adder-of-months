public class Array_5 {
  public static void main(String[] args) {
    int[] days = new int[12];
    int[] altDays = new int[days.length];
    days[0] = 31;
    days[1] = 28;
    days[2] = 31;
    days[3] = 30;
    days[4] = 31;
    days[5] = 30;
    days[6] = 31;
    days[7] = 31;
    days[8] = 30;
    days[9] = 31;
    days[10] = 30;
    days[11] = 31;
    for (int i = 0; i < days.length; i++) {
    System.out.println(days[i]);    
    }
    for (int i = 0, j = days.length - 1; i < days.length; i++, j--) {
        altDays[j] = days[i];
      }
    for (int i : altDays) {
      System.out.println(i);
    } 
  }
}