/**
 * Recursiviade
 */

public class Recursiviade {


  
    static  String IsSame(int [] VOne,int [] Vtwo)
{ 
    if (VOne.length != Vtwo.length) {
      return  "Deferente";
    } 

     return  IsSame(VOne, Vtwo) ; 
     //return  "Not dif";
}



   public static void main(String[] args) 
   {
    
    int[] array1 = {0,1,2,3,4,5};
    int[] array2 = new int[6];
    String result =IsSame(array1,array2);
    
    System.out.println("Aula de EDA "+ result);
    } 
}