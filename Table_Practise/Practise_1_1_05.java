package Table_Practise;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

/**
 * @BelongsProject: Algorithms
 * @BelongsPackage: Table_Practise
 * @Author: Severn
 * @CreateTime: 2018-12-26 18:44
 * @Description: ${典型的静态方法}
 */
public class Practise_1_1_05 {
    /*
     * 计算整数的绝对值
     */
    private static int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    /*
     * 判断该数是否为质数
     * 质数又称素数 在大于1的自然数中，除了1和它本身以外不再有其他因数
     */
    private static boolean isPrime(int N) {
        if (N < 2) return false;
        for (int i = 2; i * i <= N; i++)
            if (N % i == 0)
                return false;
        return true;
    }

    /*
     * 计算平方根(牛顿迭代法)
     * TODO sqrt
     */
    private static double sqrt(double c) {
        return c;
    }

    /*
     * 计算执教三角形的斜边
     *
     */
    private static double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    /*
     * 计算调和级数
     * TODO H
     *
     */
    private static double H(int N) {
        return N;
    }

    /*
     * 二分查找
     * 二分查找需保障数组是有序的
     */
    private static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1);
    }

    private static int rank(int key, int[] a, int lo, int hi) {
        // 如果Key存在于a[]中，它的索引不会小于lo且不会大于hi
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1);
        if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }


    public static void main(String[] args) {
        StdOut.println(abs(-3));
        int prime = 11;
        StdOut.println(String.format("%s 是否为质数 %s", prime, isPrime(prime)));
        int angleH = 3;
        int angleB = 4;
        StdOut.println(hypotenuse(angleB, angleH));
        int[] arr = {1, 2, 3, 6, 10, 15};
        StdOut.println(rank(3, arr));
    }
}
