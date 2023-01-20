import java.util.Scanner;

class Test1 {
    static boolean isSubset(int arr1[], int arr2[])
    {
        int i,j;
        for (i=0;i<arr2.length;i++)
        {
            for (j=0;j<arr1.length;j++)
                if (arr2[i]==arr1[j])
                    break;
        if (j==arr1.length)
                return false;
        }
        return true;
    }
}
class Test {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size of first array : ");
       int arr1Size=sc.nextInt();
       System.out.print("Enter the size of second array : ");
       int arr2Size=sc.nextInt();

       int arr1[]=new int[arr1Size];
       int arr2[]=new int[arr2Size];

       System.out.print("Enter the "+arr1Size+" element in first array : ");
       for(int i=0;i<arr1Size;i++)
          arr1[i]=sc.nextInt();
       System.out.print("Enter the "+arr2Size+" element in second array : ");
       for(int i=0;i<arr2Size;i++)
          arr2[i]=sc.nextInt();
        
 
        if (Test1.isSubset(arr1, arr2))
            System.out.print("arr2[] is subset of arr1[] ");
        else
            System.out.print("arr2[] is not a subset of arr1[]");
    }
}