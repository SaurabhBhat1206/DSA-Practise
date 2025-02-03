package practise;

public class LengthOfLastWord {
    public static void main(String[] args) {
         String s1 = "I am saurabh ";
         String s = s1.trim();
         int count = 0;
         int len = s.length()-1;
         for(int i = len; i>=0; i--){
             if(s.charAt(i)!=' '){
                 count++;
             } else {
                 break;
             }
         }

         System.out.print(count);
    }
}
