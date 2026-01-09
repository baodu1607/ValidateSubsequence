import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
        if(isValidSubsequence(array, sequence)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }*/
        var array = Arrays.asList(1, 1, 1, 1, 1);
        var sequence = Arrays.asList(1, 1, 1);
        if(isValidSubsequence(array, sequence)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
    /*Given two non-empty array of integers, write a function that determines
    * whether the second array is a subsequence of the first one.
    * A subsequence array is a set of numbers that aren't necessary adjacent in the array
    * but that are in the same order as they appear in the array. For instance,
    * the numbers [1, 3, 4] form a subsequence of the array [1, 2, 3, 4], and so do the
    * numbers [2, 4]. Note that a single number in an array and the array itself are
    * both valid subsequences of the array.*/

    // O(m*n) time,
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence){
        if(!array.contains(sequence.getFirst())) return false;
        if(array.contains(sequence.getFirst()) && sequence.size() == 1) return true;
        int s = 0;
        // Tìm ra index của phần tử array = sequence[0]
        for(int i = 0; i < array.size(); i++){
            if(array.get(i).equals(sequence.getFirst())){
                s = i;
                break;
            }
        }
        int j = 1;
        int temp = s;
        while (j < sequence.size()){
            for(int k = s+1; k < array.size(); k++){
                if(array.get(k).equals(sequence.get(j))){
                    s = k;
                    break;
                }
            }
            if(s - temp == 0){
                return false;
            }else{
                j++;
                temp = s;
            }
        }
        return true;
    }
}
