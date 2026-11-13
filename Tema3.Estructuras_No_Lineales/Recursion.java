public class Recursion {
    public void recursionBAD(int n, int i){
        //static int i = 0;

        System.out.println("recursion IN:");

        if (i > n) return;
        System.out.println(i);
        i++;
        recursionBAD(n, i);
        System.out.println("recursion OUT:");

    }

    public static void main(String args []){
        Recursion r = new Recursion();
        r.recursionBAD(4, 0);
        r.recursionBAD(4, 0);

        System.out.println("--------------------------------------------");

        r.recursionBAD(4, 0);
        r.recursionBAD(4, 0);

        System.out.println("--------------------------------------------");

    }

}
