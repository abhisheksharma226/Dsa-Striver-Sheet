class largest {
    public int largestElement(int[] arr) {
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,19,5,6};
        largest in = new largest();
        System.out.println(in.largestElement(arr));
    }
}