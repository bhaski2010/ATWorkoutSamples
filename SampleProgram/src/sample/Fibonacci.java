package sample;

public class Fibonacci {
    public void genfibnoNumber(int n){
        long a = 0;
        long b = 1;
        System.out.println("Fibonacci number upto " +n + " numbner of times\n" );
       int i;
        for ( i=0; i<n; i++) {
            System.out.println(a + " ");
        long nextnum = a + b;
        a = b;
        b = nextnum;
        }
    }
    public static void main (String []a) {
        Fibonacci f = new Fibonacci();
        f.genfibnoNumber(9);
    }
}
