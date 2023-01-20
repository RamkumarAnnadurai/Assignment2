import java.util.Scanner;

class DuplicateArray {
    
   void findDuplicate(int a[])
   {
    int i,j,k,dup[]=new int[(a.length)/2];
    for(i=k=0;i<(a.length-1);i++)
    {
        for(j=i+1;j<a.length;j++)
        {
            if(a[i]==a[j])
            {
                int ind=0;
                for( ;ind<k && (dup[ind]!=a[i]);ind++);
                if(ind==k)
                   dup[k++]=a[i];
            }
        }
    }
    if(k==0)
    {
        System.out.println("Duplicates are not present in this Array");
    }
    else 
    {
        System.out.print("Duplicates are present in this Array\nDuplicate Elements are :"); 
        for(int ind=0;ind<k;ind++)
        {
           System.out.print(dup[ind]+" "); 
        }
    }
       
    }
}
class Test{
    
    public static void main(String args[])
    {
        DuplicateArray obj = new DuplicateArray();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int size=scan.nextInt();
        int i,a[]= new int[size];
        System.out.print("Enter the "+size+" Element : ");
        for(i=0;i<a.length;i++)
           a[i]=scan.nextInt();
        
        obj.findDuplicate(a);
    }
}

// Output :
// =========
// Enter the size of Array : 10
// Enter the 10 Element : 1 2 3 4 4 6 7 7 9 0
// Duplicates are present in Array
// Duplicate Elements are :4 7
