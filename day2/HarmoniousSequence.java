package day2;

import java.util.HashMap;
import java.util.Map;

public class HarmoniousSequence {
	public static int length(int a[]) {
		Map<Integer, Integer> countmap=new HashMap<>();
		int maxlength=0;
		
		for(int count:a) {
			countmap.put(count, countmap.getOrDefault(count, 0)+1);
			
		}
		for(int num:countmap.keySet()) {
			if(countmap.containsKey(num+1)) {
				int curlength=countmap.get(num)+countmap.get(num+1);
				maxlength=Math.max(maxlength, curlength);
			}
		}
		return maxlength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

	        int maxLength = length(nums);

	        System.out.println("Length of the longest harmonious subsequence: " + maxLength);

	}

}
