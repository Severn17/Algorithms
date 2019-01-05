package Ch_1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.*;

/**
 * @BelongsProject: Algorithms
 * @BelongsPackage: Ch_1_1_Basic_Programming_Model
 * @Author: Severn
 * @CreateTime: 2018-12-18 14:19
 * @Description: ${练习1.1.1}
 */
public class Practise_1_1_01 {
    public static void main(String[] args) {
        /*
         * 整数相除，向0舍入
         * 7
         */
        StdOut.println((0 + 15) / 2);
        /*
         * 字数值是双精度
         * 200.0000002
         */
        StdOut.println(2.0e-6 * 100000000.1);
        /*
         * && 优先级高于 ||
         * true
         */
        StdOut.println(true && false || true && true);
    }
}
