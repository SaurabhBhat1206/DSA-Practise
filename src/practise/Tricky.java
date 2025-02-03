package practise;

public class Tricky {
    public static void main(String[] args) {
        try{
            return ;
        } finally{
            System.out.println("Final block executed");
        }
    }
}
