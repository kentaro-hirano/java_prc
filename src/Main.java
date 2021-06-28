public class Main { 
  public static void main(String[] args) {
    String str = "a. b. c. d. e";
    // System.out.println(str.toString());
    String [] array = str.split("¥¥.¥¥s");
    System.out.println(array);
    for (String s : array) {
      System.out.println(s);
    }
  }
}