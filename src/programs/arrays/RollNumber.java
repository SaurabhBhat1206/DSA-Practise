package programs.arrays;

public class RollNumber {
    public static void main(String[] args) {
        int[] studentMarks = {50,70,100,31,32,67};
        for(int i=0;i<studentMarks.length;i++){
            if(studentMarks[i]<35){
                System.out.println(i);
            }
        }
    }
}
