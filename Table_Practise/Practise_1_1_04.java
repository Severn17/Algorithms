package Table_Practise;

import edu.princeton.cs.algs4.*;

/**
 * @BelongsProject: Algorithms
 * @BelongsPackage: Table_Practise
 * @Author: Severn
 * @CreateTime: 2018-12-26 17:28
 * @Description: ${典型的数组处理代码}
 */
public class Practise_1_1_04 {
    /*
     * 找出元素中最大的元素
     */
    private static double FindMaxElement(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
     * 计算数组元素的平均值
     * 数组的下标也是从 0 开始
     * 数组中最后一个元素总是 a[a.length - 1]
     */
    private static double FindAverageElement(double[] arr) {
        int N = arr.length;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        return sum / N;
    }

    /*
     * 复制数组
     * 1.1.5.4 起别名
     * 数组之间赋予变量，两个变量只想同一个数组
     * 复制数组的话，声明创建初始化一个新的数组,如CopyArray的方式
     */
    private static double[] CopyArray(double[] arr) {
        int N = arr.length;
        double[] b = new double[N];
        for (int i = 0; i < N; i++) {
            b[i] = arr[i];
        }
        return b;
    }

    /*
     * 颠倒数组
     * 使用临时的变量中介交换两个值
     */
    private static double[] PerversionArray(double[] arr) {
        int N = arr.length;
        for (int i = 0; i < N / 2; i++) {
            double temp = arr[i];
            arr[i] = arr[N - 1 - i];
            arr[N - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        double[] arr = {1.3, 2.2, 4.1, 7.9, 3.1};
        StdOut.println("arr 中最大的元素 : " + FindMaxElement(arr));
        StdOut.println("----------------------------------------");
        StdOut.println("arr 中平均值 : " + FindAverageElement(arr));
        StdOut.println("----------------------------------------");
        double[] copyArr = CopyArray((arr));
        for (int i = 0; i < copyArr.length; i++) {
            StdOut.println(String.format("arr[%s] 的值 %s 复制 copyArr[%s] 的值 %s", i, arr[i], i, copyArr[i]));
        }
        StdOut.println("----------------------------------------");
        double[] perArr = PerversionArray(copyArr);
        for (int i = 0; i < perArr.length; i++) {
            StdOut.println(String.format("arr[%s] 的值 %s 颠倒 perArr[%s]  的值 %s", i, arr[i], i, perArr[i]));
        }
        // TODO 矩阵相乘

    }
}
