import java.util.ArrayList;
import java.util.PriorityQueue;

class Data implements Comparable<Data>{
    int val;
    int aPos;
    int vPos;
    Data(int val, int aPos, int vPos){
        this.val=val;
        this.aPos=aPos;
        this.vPos=vPos;
    }

    public int compareTo(Data d1){
        return this.val-d1.val;
    }
}


public class MergeKSortedArrays {

     public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        PriorityQueue<Data> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(new Data(arr[i][0], i, 0));
        }

        ArrayList<Integer> ans=new ArrayList<>();
        while(!pq.isEmpty()){
            Data d1=pq.poll();
            int data=d1.val;
            int ap=d1.aPos;
            int vp=d1.vPos;

            ans.add(data);
            if(vp+1<arr[ap].length){
                pq.add(new Data(arr[ap][vp+1], ap, vp+1));
            }
        }
        return ans;
        
    }
   
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        ArrayList<Integer> ans=mergeKArrays(arr, 3);
        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
