package programs;

public class RemoveDuplicateSortedArray {
    public static void main(String[] args) {
        int[] ar = {1, 1, 2,22, 22, 33, 33, 34};
        System.out.print(removeDuplicate(ar));

    }

    private static int removeDuplicate(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (i < ar.length - 1 && ar[i] == ar[i + 1]) {
                continue;
            } else {
                ar[count] = ar[i];
                count++;
            }
        }
        return count;
    }
}
