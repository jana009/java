import java.util.Arrays;

public class assignment01{


    public static int[] addX(int n, int arr[], int x)
   {
       int i;
   
       // create a new array of size n+1
       int newarr[] = new int[n + 1];
       for (i = 0; i < n; i++)
           newarr[i] = arr[i];
   
       newarr[n] = x;
   
       return newarr;
   }
   public static void main(String[] args) {
    int[] nums=new int[]{16,22,25,26,63,22};
    Arrays.sort(nums);
    int[] numsCopy=nums;
    int sum = Arrays.stream(nums).sum();
    int num2[]=new int[]{};
    int sum2=0;
    for(int i=nums.length-1;i>-1;i--){
        if((sum2 + numsCopy[i]<=(sum-numsCopy[i]))){
            sum-=numsCopy[i];
            int lastVal=pop(numsCopy,i);
            numsCopy=poparr(numsCopy, i);
            sum2+=lastVal;
            num2=addX(num2.length, num2, lastVal);
        }
    }

    System.out.print("set1: ");
    printArray(nums);
    System.out.println();
    System.out.print("set1: ");
    printArray(numsCopy);
    System.out.println();
    System.out.print("set2: ");
    printArray(num2);
    System.out.println();
    System.out.println("diff: "+Math.abs(sum-sum2));
}

    public static int pop(int[]arr,int index){
        int[] arr_new = new int[arr.length-1];
        int j=index;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        return arr[j];
    
    }
    public static int[] poparr(int[]arr,int index){
        int[] arr_new = new int[arr.length-1];
        int j=index;
        for(int i=0, k=0;i<arr.length;i++){
            if(i!=j){
                arr_new[k]=arr[i];
                k++;
            }
        }
        return arr_new;
    
    }

    public static void printArray(int[] num){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
}

