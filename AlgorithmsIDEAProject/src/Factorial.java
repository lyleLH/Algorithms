import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lyleKP on 2017/5/26.
 */
//求正整数n的阶乘，递归算法
public class Factorial {

    public  static  int factorial(int n ) {
        if(n == 0) return 1;
        return n * factorial(n-1);
    }

    public  static  void  main(String[] args) {

        while (!StdIn.isEmpty()){
            int key = StdIn.readInt();
            StdOut.println(factorial(key));
        }


    }
}
