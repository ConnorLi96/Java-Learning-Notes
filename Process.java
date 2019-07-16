// 格式化输出使用System.out.printf()
import java.util.Scanner;

// public class Process {
//     public static void main(String[] args) {
//         int n = 12345000;
//         System.out.printf("n=%d, hex=%08x", n, n); // 注意，两个%占位符必须传入两个数
//     } // %d 格式化输出整数 %x 格式化输出 16 进制整数
// }


// public class Process{
//     public static void main(String[] args){
//         Scanner scanner  = new Scanner(System.in); // 创建 Scanner 对象
//         System.out.print("Input your name: "); // 打印提示
//         String name = scanner.nextLine(); // 读取一行并获取整数
//         System.out.print("Input yout age ");
//         int age = scanner.nextInt();
//         System.out.printf("Hi, %s, you age is %d\n", name, age);
//     }
// }



// 要测试输入，所以必须要编译、执行的流程


// public class Process {
//     public static void main(String[] args) {
//         int n = 20;
//         if (n >= 60) { // 注意 if 是带括号的 
//             System.out.println("及格了");
//             System.out.println("恭喜你");
//         }else{
//             System.out.println("gg");
//         }
        
//     }
// }

// equals() 判断引用类型的变量内容是否相等


// switch 多重选择 也可以用 if 来写
// public class Process{
//     public static void main(String[] args){
//         int option = 4;
//         switch (option){
//         case 1: // case 是 switch 函数的变量，写的时候一定要记得加上 break
//             System.out.println("selected 1");
//             break;  
//         case 2: -> System.out.println("selected 2");
//         default:
//             System.out.println(" no selected");
//             break;
//         }
//     }
// }



// while 语句
// while (条件表达式) {
//     循环语句
// }


// public class Process{
//     public static void main(String[] args){
//         int sum = 0;
//         int n = 1;
//         while (n <= 100){
//             sum += n;
//             n++;
//         }
//         System.out.println(sum);
//     }
// }

// do while 循环 是先执行循环再判定条件，条件满足时继续循环，条件不满足时则退出。
// 以下还是以 1-100 的求和为例

// public class Process{
//     public static void main(String[] args){
//         int n = 1;
//         int sum = 0;
//         do{ // do 后面接的也是花括号
//             sum = sum + n;
//             n++;
//         }while  (n <= 100);
//         System.out.println(sum);
//     }
// }


// public class Process{
//     public static void main(String[] args){
//         int sum = 0;
//         for (int i=1; i<= 100; i++){
//             sum = sum + i;
//         }
//         System.out.print(sum);
//     } 

// }

//for (初始条件; 循环检测条件; 循环后更新计数器) {
    // 执行语句}


// for 循环对数组求和

// public class Process{
//     public static void main(String[] args){
//         int []ns = {1,10,100,400,2000,6444,13423};
//         int sum = 0;
//         for (int i = 0; i <ns.length; i++){ // 这个地方要加 i，相当于一个计数器，以此作为索引。
//             System.out.println("i = " + i + ", ns[i] = " + ns[i]);
//             sum = sum + ns[i];
//         }
//         System.out.println("sum = "+ sum);
//     }
// }

// for each 循环
// public class Process{
//     public static void main(String[] args){
//         int[] ns = {1,3,4,5,7,9,10};
//         for (int n : ns){ // for 循环里面
//             System.out.println(n);
//         }
//     }
// }


// Break 和 continue 

// Break 一般是配合 if 语句在使用，break 会跳出自己那一层的循环然后进入下一层
public class Process{
    public static void main(String[] args){
        int sum = 0;
        for (int i =2; i<=10; i++){
            System.out.println("begin i = " + i);
            if (i % 2==0);{
                continue;
            }
            sum = sum + i;
            System.out.println("end i =" + i);
        }
        System.out.println(sum);
    }
}











