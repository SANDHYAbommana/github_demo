public class SumEvens{

     public static void main (String []args)
     {
         int[] ar = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(sumEvenNums(ar) );
     }
     static int sumEvenNums(int[] ar) 
     {
         int sum=0;
         for(int num: ar) {
             if(num%2==0)
             sum += num;
         }
         return sum;
     }
}