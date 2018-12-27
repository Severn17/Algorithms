package Table_Practise;

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
     *
     */
    private static double sqrt(double c){
        return c;
    }

    public static void main(String[] args) {
        StdOut.println(abs(-3));
        int prime = 11;
        StdOut.println(String.format("%s 是否为质数 %s", prime, isPrime(prime)));
        // TODO
    }
}
