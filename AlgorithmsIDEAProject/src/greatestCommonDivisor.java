public class greatestCommonDivisor {

    public static int gcd(int p, int q)
    {
        if (q == 0 ) return p ;
        int r = p%q;
        return gcd(q,r) ;

    }
    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        int gcd = gcd(3,15);
        System.out.println(gcd);
    }

}

