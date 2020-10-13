public class Ex2 {
    
    public static void main(String[] args) 
    {
     
     int[] array1 = {2,1,0,3,4,5}; 
      
     
     System.out.println(menor(array1,1,array1[0]));
    } 

   public static int menor(int[] v,int pos,int valor)
   { 
            if(pos == v.length){
                return valor;
            }

            if (v[pos] < valor) {
                valor = v[pos];
            }           

            return menor(v,pos + 1,valor);

   }

}
