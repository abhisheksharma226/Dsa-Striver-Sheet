class sortedOrNot {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        
        return count <= 1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,2,8,2,4,2};
        sortedOrNot in = new sortedOrNot();
        if (in.check(arr) == false){
            System.out.println("Not Sorted");
        }else{
            System.out.println("Sorted");
        }
    }

}
