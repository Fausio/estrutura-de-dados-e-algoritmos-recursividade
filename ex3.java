public class ex3 {
    public static void main(String[] args) {

        int[] array1 = { 0,1,2,4,0,5 };

        System.out.println(IsSort(array1, 1));
    }

    public static boolean IsSort(int[] v, int pos) {
      
        // inicio
        if (pos == 1) {
            if (pos == v.length) {
                return false;
            }
        }

        //fim
        if (pos == v.length) {
            return true;
        }

        //meio
        if (v[pos - 1] <= v[pos]) {
            return IsSort(v, pos + 1);
        } else {
            return false;
        }
    }

}
