import java.util.*;
class BubbleSort
{
    void sort(int a[])
    {
        boolean flag=true;
        int i,j,t;
        while(flag!=false)
        {
            flag=false;
            for(i=0,j=1;j<a.length;i++,j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;

                    flag=true;
                }
             }
        }
    }
    void printArray(int a[])
    {
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }
}

class Test{
    
    public static void main(String args[])
    {
        BubbleSort obj = new BubbleSort();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size=scan.nextInt();
        int i,a[]= new int[size];
        System.out.print("Enter the "+size+" Element :");
        for(i=0;i<a.length;i++)
           a[i]=scan.nextInt();
        
        obj.sort(a);
        System.out.println("The Sorted array is : ");
        obj.printArray(a);
    }
}