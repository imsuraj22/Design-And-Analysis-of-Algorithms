public class mergeSort{
    static void merge(int beg, int end, int mid, int arr[]){
        int n1=mid-beg+1;
        int n2=end-mid;

        int leftArr[]=new int[n1];
        int rightArr[]=new int[n2];

        for(int i=0;i<n1;i++){
            leftArr[i]=arr[beg+i];
        }
        for(int j=0;j<n2;j++){
            rightArr[j]=arr[mid+1+j];
        }

        int i=0,j=0,k=beg;

        while(i<n1 && j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k]=leftArr[i];
                i++;
            }
            else{
                arr[k]=rightArr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=leftArr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightArr[j];
            j++;
            k++;
        }


    }
    static void mergeSort(int arr[],int beg, int end){
        if(beg<end){
            int mid=(beg+end)/2;
           // System.out.println("value of mid "+mid );
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid+1, end);
            merge(beg,end,mid,arr);

        }
    }
    public static void main(String[] args) {
        int arr[]=new int[]{12,31,25,8,32,17,40,42};
        System.out.println("Elements before sorting ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergeSort(arr, 0, arr.length-1);
        System.out.println("Elements after sorting");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}