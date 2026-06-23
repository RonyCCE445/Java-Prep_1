public class arrayop {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        int largest = arr[0];
        int smallest = arr[0];

        for (int i=0; i<arr.length; i++){
            sum += arr[i];

            if(arr[i] > largest ){
                largest = arr[i];
            }

            if (arr[i]< smallest){
                smallest = arr[i];            }

        }

        double average = (double) sum/arr.length;

        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + average);
        System.out.println("The largest element in the array is: " + largest);
        System.out.println("The smallest element in the array is: " + smallest);
        
    }
}