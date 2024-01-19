import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int length = nums.length;
        int[] numsCopy = nums.clone(); //to avoid modifying the original array

        Arrays.sort(numsCopy); //sorted in ascending order

        int[] result = new int[k];
        List<Integer> list = new ArrayList<>();

        for(int i = length-k; i < length; i++) { //copy the clone of nums array to the list
            list.add(numsCopy[i]);
        }

        int index = 0; //counter for the index of resulting array

        for(int j = 0; j < length; j++) { //Iterating through each element in nums,
            for(int i = 0; i < list.size(); i++) { // and each element in list
                if(nums[j] == list.get(i)) { //checking if nums and list has the same element
                    result[index] = list.get(i); // when found, add the element from list to resulting array
                    list.remove(i); //remove the element from the list to avoid repetitions
                    index++; //increment the index of resulting array
                    break; //we have found the element, no need to continue the search
                }
            }
            if(index==k) // check if we have found the required number of max elements
                break; // then break out of the bigger loop
        }
        return result;
    }
}
