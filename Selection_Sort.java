import java.util.*;
class Main{
    public static void main(String[] args) {
        int arr[]=new int[6];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Before Sorting");
        for(int i=0;i<6;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int j=0;j<6;j++)
        {
            int min=j;
            for(int k=j+1;k<6;k++)
            {
                if(arr[k]<arr[min])
                {
                    min=k;
                }
            }
            int temp=arr[j];
            arr[j]=arr[min];
            arr[min]=temp;
        }
        System.out.print("\n");
        System.out.println("After Sorting");

        for(int i=0;i<6;i++)
        {
            System.out.print(arr[i]+" ");
        }
            
        
    }
}
