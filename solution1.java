class solution1 {
    public static void rotate(int a[], int k) {
      int n = a.length;
      k = k % n;
  
      reverse(a, 0, n-1);
      reverse(a, 0, k-1);
      reverse(a, k, n-1);
    }
    public static void reverse(int a[], int i, int j) {
      while(i <= j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        i++;
        j--;
      }
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,43,2,2,32,1};
        rotate(arr, 4);
        for(int val:arr)
        {
            System.out.print(val+" ");
        }
    }
  }