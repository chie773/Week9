import java.util.HashMap;

public class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer,Integer> newTable = new HashMap<>();//Declaration statement for a hashmap

        for (int i=0; i < nums.length; i++) { //This loop adds all the numbers in the int array into a hashMap
            newTable.put(i, nums[i]); //This happens in constant time? I think?
        }

        int count = 0; //Initializes the counter for longestConsecutiveSeq
        int max = 1; //Initializes holder for longest sequence

        for (int j = 0; j < nums.length; j++) {
            /* Basically, I need to see nums[j] - 1 exists. If so, then I need to move to the next question
               If it doesn't, I need to start counting and looking for the next digit in nums[j] + 1 subsequence
             */

            if (newTable.containsValue(nums[j] - 1)) { // if the number - 1 doesn't exist. i.e. if nums[j] = 100, does 99 exist?
                //Since it doesn't exist --->
            }
            else{
                count = 1; //Initializes the counter
                int curr = newTable.get(j); //Gets assigned with nums[j]
                while (newTable.containsValue(curr+1)) { //Iterates through the HashMap searching for consecutive integers
                    count++;
                    curr++;
                }
                if (count > max) { //This replaces the current highest count of consecutive numbers with the new one
                    max = count;
                }
            }


        }

        return max; //Returns the max consecutive integer count
    }
}
