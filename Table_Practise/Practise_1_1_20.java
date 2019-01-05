package Table_Practise;

import edu.princeton.cs.algs4.*;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @BelongsProject: Algorithms
 * @BelongsPackage: Table_Practise
 * @Author: Severn
 * @CreateTime: 2019-01-04 12:07
 * @Description: ${画图}
 */
public class Practise_1_1_20 {
    /*
     * 函数值
     *
     */
    private static void FxFunction(int N) {
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N * N);
        StdDraw.setPenRadius(.01);
        for (int i = 1; i <= N; i++) {
            StdDraw.point(i, i);
            StdDraw.point(i, i * i);
            StdDraw.point(i, i * Math.log(i));
        }
    }

    /*
     * 随机数组
     *
     */
    private static void RandomArray(int N) {
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random();
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    /*
     * 已排序的随机数组
     *
     */
    private static void RandomOrderlyArray(int N) {
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random();
            Arrays.sort(a);
        }
        for (int i = 0; i < N; i++) {
            double x = 1.0 * i / N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    /*
     * 二分查找
     * 数组必须是有序的
     */
    private static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        //FxFunction(100);
        //RandomArray(50);
        //RandomOrderlyArray(50);
    }
}
