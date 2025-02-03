package practise;

public class CollectionCheck {

    interface A1{
         String say(String s);
    }
    class B1 implements A1{

        @Override
        public String say(String s) {
            System.out.println("String is "+s);
            return s;
        }
    }
    public static void main(String[] args) {
        A1 a1 = (var)-> var="hujk";

    }
}
