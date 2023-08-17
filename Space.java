public class Space {
  public static void main(String[] args) {
    String[] namesOfMonth = {
      "Январь",
      "Февраль",
      "Март",
      "Апрель",
      "Май",
      "Июнь",
      "Июль",
      "Август",
      "Сентябрь",
      "Октябрь",
      "Ноябрь",
      "Декабрь",
    };
    String result = "";
    for (int i = 0; i < namesOfMonth.length; i++) {
      result += namesOfMonth[i];
      if (i == namesOfMonth.length - 1) {
        result += ".";
      } else {
        result += ", ";
      } 
      System.out.println(result);
  }
  }
}

