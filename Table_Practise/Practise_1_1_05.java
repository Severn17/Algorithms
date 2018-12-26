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

    public static void main(String[] args) {
        StdOut.println(abs(-3));
    }
}
