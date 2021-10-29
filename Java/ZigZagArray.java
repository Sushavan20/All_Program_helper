//Description: Sort an array in a zigzag fashion such that a<b>c<d>e
//Username: ishashukla183
//Date created: 27-10-2021

import java.util.*;

class Rearrange
{
 int[] zigzag(int arr[]) //function to create a zigzag array
 {
     boolean flag=true; //true indicates relation < is expected, else >
                        //flag is set to true since first relation is <
     int temp=0;
     for(int i=0; i<arr.length-1;i++)
     {
         if(flag) //< expected
         {
            if(arr[i]>arr[i+1]) //if A>B>C, it will swap values of B & C so A>B<C 
            {
              temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1] = temp;
            }
         }
         else   //if A<B<C, it will swap values of B & C so A<B>C
         {  if (arr[i] < arr[i+1])
            { temp = arr[i];
              arr[i] = arr[i+1];
              arr[i+1] = temp;
             }
         }
      flag = !flag; //invert value of flag
     }
    return arr; //return zigzag array
 }
}

class Main //Main class
{
  public static void main (String[] args) //Main method
{ Scanner sc= new Scanner(System.in);
  System.out.println("Enter number of elements in array"); //get size of array
  int n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter elements of array");
  for(int i=0;i<n;i++)
  {
     arr[i]=sc.nextInt();
  }
  System.out.println("Array before rearranging:");
  System.out.println(Arrays.toString(arr));
  Rearrange obj= new Rearrange();
  int res[]=new int[n]; //new array to store result
  res=obj.zigzag(arr);
  System.out.println("Rearranged array:");
  System.out.println(Arrays.toString(res)); 
}
}
