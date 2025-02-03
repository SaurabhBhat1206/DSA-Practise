package programs;

public class Practise {
    public static void main(String[] args) {
      String s1 = "malyalam";
      int startIndex = 0;
      int lastIndex = s1.length()-1;
      char[] c1 = s1.toCharArray();
      while (startIndex<lastIndex){
          char temp = c1[startIndex];
          c1[startIndex] = c1[lastIndex];
          c1[lastIndex] = temp;
          startIndex++;
          lastIndex--;
      }
        System.out.println("Reversed String is : "+ new String(c1));
    }
}
