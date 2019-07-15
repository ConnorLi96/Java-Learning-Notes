// public class Main{
//     public static void main(String[] args){
//     int n = 3300;
//     n++; // 相当于 n = n + 1;
//     n--; // 可以对一个整数进行加1和减1的操作
//     int y = 100 + (++n);
//     System.out.println(n--);
//     System.out.println(y);
//     }
// }

// long 可表示的整型范围更大

// 移位运算
// 位运算
// 加括号就可以保证运算的优先级正确

// public class Main {
//     public static void main(String[] args) {
//         double x = 1.0 / 10;
//         double y = 1 - 9.0 / 10;
//         // 观察x和y是否相等:
//         System.out.println(x);
//         System.out.println(y);
//     }
// }

// 类型提升 如果参与运算的两个数其中一个是整型，那么整型可以自动提升到浮点型：
// Boolean 运算

// public class Main{
//     public static void main(String[] args){
//     boolean b = 5 < 3;
//     boolean result = b && (5 / 0 > 0);
//     System.out.println(result);
//     }
// }

// 字符和字符串

// public class Main{
//     public static void main(String[] args){
//         String s1 = "Hello";
//         String s2 = "Roxy 'Love you'";
//         String s = s1 + ' '+ s2;
//         System.out.println(s);
//     }
// }

public class Main {
    public static void main(String[] args) {
        String s = "hello";
        
        s = "world";
        System.out.println(s); // 显示 world
    }
}

// char c1 = 'A'; 字符只能用单引号来表示
// String c2 = "shkahfda" 字符串可以表达任意多个字符