import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * Created by lyleKP on 2017/5/25.
 */
public class SearchSpecificNumber {

    public static  int indexOfNumber(int[] list,int key) {
        int index = -1;
        int length = list.length;
        int i  = 0;
        while (i < length){
            if(list[i]  == key){
                index = i;
            }
            i ++;
        }

        return  index;
    }

    public  static  int indexOfNumber_betterVersion(int[] list , int key) {
        int i = 0;
        while (i < list.length){
            if (list[i] == key) return i;
            i ++;
        }
        return -1;
    }

    public  static  int indexOfNumber_sentinelVersion(int[] list,int n,int key) {
        int last = list[n];
        list[n] = key;
        int i = 0 ;
        while (list[i] != key) {
            i ++;//循环中只需要执行一个操作，所.以效率更高
        }
        list[n] = last;
        if (i < n || list[n] == key){
            return i;
        }
        return  -1;
    }

    //递归实现的查找算法
    public  static  int indexOfNumber_recursiveVersion (int[] list,int n, int i, int key) {


          return  -1;
    }
    
    public static void main(String[] args)
    {

        String filePath = "/Users/lyleKP/Documents/个人项目/untitled2/src/largeW.txt";
        int[] whitelist = In.readInts(filePath);
//        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            StdOut.println(SearchSpecificNumber.indexOfNumber_sentinelVersion(whitelist,whitelist.length-1,key));
        }
    }
}
