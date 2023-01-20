import java.util.Scanner;

class SelectionSort
{
    void sort(int a[])
    { 
        int i,j,min,t;
        for (i=0;i<a.length-1;i++)
        {
            min=i;
            for (j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                    min=j;
            }
            t=a[min];
            a[min]=a[i];
            a[i]=t;
        }
    }
    void printArray(int a[])
    {
        for (int i=0; i<a.length; i++)
            System.out.print(a[i]+" ");
        System.out.println();
    }
}

class Test{
    
    public static void main(String args[])
    {
        SelectionSort obj = new SelectionSort();
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
