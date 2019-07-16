import java.util.Arrays;
import org.graalvm.compiler.hotspot.nodes.StubStartNode;

// public class Array{
//     public static void main(String[] args){
//         int []ns = {1,3,5,67,8,89};
//         for (int i = 0; )
//     } 
// }

// for each 循环无法拿到索引



// 冒泡排序算法 对数组进行排序 
// 每一轮循环后，最大的一个数被交换到末尾
// 交换两个变量的值必须借助一个临时变量 


public class Array{
    public static void main(String[] args){
        int []ns = {11,33,5,6,83,4}; // Arrays.toString 迅速地遍历数组
        System.out.println(Arrays.toString(ns)); // 排序前
        // Arrays.sort(ns);
        // 可以直接用 sort 替换掉冒泡排序
        for (int i = 0; i < ns.length -1; i++){
            for (int j = 0; j < ns.length -i -1; j++){
                if (ns[j] > ns[j+1]){ // 交换 ns[j] 和 ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                } 
            }
        System.out.println(Arrays.toString(ns));
        }
    } 
}


// 多维数组
public class Array{
    public static void main(String[] args){
        int [][]ns = {
            {1,2,3,4},
            {5,6,7,8},
            {11,22,44,66}
        };
        int[] arr0 = ns[0]; // arr0 获取了 ns 的第一个元素
        System.out.println(Arrays.deepToString(ns)); // deepToString 
    }
}


// 命令行参数
public class Array{
    public static void main(String[] args){
        for (String arg : args){
            if ("-version".equals(arg)){
                System.out.println("v 1.0");
                break;
            }
            System.out.println(arg);
        }
    }
}
