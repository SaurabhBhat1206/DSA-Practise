package ArrayPractise;

public class LoopCheck {
    public static void main(String[] args) {
      String str = "saurabh bhat";
       String vowels = "aeiouAEIOU";
       String output = "";
       for(char ch : str.toCharArray()){
           if(vowels.indexOf(ch)==-1){
               output = output + ch;
           }
       }
        System.out.println(output);
    }
}
