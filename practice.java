public class practice {
    public static void main(String[] args) {
        int []arr = {0,0,1,1,1,2,2,3,3,4};
        int n = arr.length;
        int index = 0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[index])
            {
                // move to next position and copy the element
                index++;
                arr[index] = arr[i];
            }
        }
        // printing the array 
        for(int i=0;i<=index;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
