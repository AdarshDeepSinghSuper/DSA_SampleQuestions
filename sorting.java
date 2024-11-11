public class sorting {
    public static void main(String[]args){
        int arr[] = {2,1,4,3,5,4,6,5,7,6};
        int l = arr.length;
        for(int i=0;i<l-1;i++){
            for(int j=1;j<l;j++){
                if(arr[i]>arr[j]){
                    //swap
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    }
                }
            }
            for(int i=0;i<l;i++){
                System.out.println(arr[i]);
            }
        }
    }

