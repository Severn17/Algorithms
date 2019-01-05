package Ch_1_1_Basic_Programming_Model;

import edu.princeton.cs.algs4.StdOut;

import java.util.Scanner;

/**
 * @BelongsProject: Algorithms
 * @BelongsPackage: Ch_1_1_Basic_Programming_Model
 * @Author: Severn
 * @CreateTime: 2019-01-04 16:08
 * @Description: ${练习1.1.3}
 */
public class Practise_1_1_03 {
    public static void main(String[] args) {
        StdOut.println("三个整数是否相等程序");
        String[] arr = new String[3];
        for (int i = 0; i < 3; i++) {
            StdOut.println(String.format("输入第%d个整数", i));
            Scanner scanner = new Scanner(System.in);
            arr[i] = scanner.next();
        }
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        if (a == b && b == c) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }
    }
}
