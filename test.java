public class test {
    // insertion sort 

    public static void ISort(int [] arr ) 
{
 int n = arr.length;
 for(int i=1;i<n;i++)
{
	int current = arr[i];
	int j = i-1;
	while(j>=0 && arr[j]>current)
{
	arr[j+1] = arr[j];
	j--;
}
	arr[j+1] = current;
}  }
    public static void main(String[] args) {
        int arr[] = {5, 3, 5, 7, 4, 7, 9, 4, 7};
        ISort(arr);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
