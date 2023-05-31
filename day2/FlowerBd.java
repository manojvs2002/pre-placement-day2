package day2;

public class FlowerBd {
	
	static boolean count(int []flowerbed,int x) {
		int length=flowerbed.length;
		int i=0;
		int count=0;
		while (i < length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i++;
        }
		return count>=x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] nums = {1,0,1};

		 int x=1;
	        boolean done=count(nums,x);

	        System.out.println("after completienf" +x+"   "  + done);

	}


}
