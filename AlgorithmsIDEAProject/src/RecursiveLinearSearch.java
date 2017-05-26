import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by lyleKP on 2017/5/26.
 */
public class RecursiveLinearSearch {

    public  static  int recursiveLinearSearch(int[] list,int n, int i, int key){
        if(i > n) {
            return  -1;
        }
        if (i <= n){
            if (list[i] ==key) {
                return i;
            }
            if (list[i] !=key)  {
                return recursiveLinearSearch(list,n,i+1,key);
            }
        }
        return  -1;
    }

    public  static  void  main (String[] args){
        String filePath = "/Users/lyleKP/Documents/同步目录/项目/Algorithms/AlgorithmsIDEAProject/out/production/untitled2/tinyT.txt";
        int[] whitelist = In.readInts(filePath);
//        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            StdOut.println(RecursiveLinearSearch.recursiveLinearSearch(whitelist,whitelist.length-1,0,key));
        }

    }
}
