package Ch_1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @BelongsProject: Algorithms
 * @BelongsPackage: Ch_1_1_Basic_Programming_Model
 * @Author: Severn
 * @CreateTime: 2019-01-04 15:58
 * @Description: ${练习1.1.2}
 */
public class Practise_1_1_02 {
    public static void main(String[] args) {
        //浮点型
        StdOut.println((1 + 2.235) / 2);
        //运算中有浮点型，计算数自动转换为浮点型
        StdOut.println(1 + 2 + 3 + 4.0);
        //
        StdOut.println(4.1 >= 4);
        //先计算然后拼接字符串
        StdOut.println(1 + 2 + "3");
    }
}
