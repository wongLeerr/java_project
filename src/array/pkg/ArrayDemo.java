package array.pkg;

import java.util.Arrays;

public class ArrayDemo {
    public  static  void  main(String[] args) {
        int[] arr= {5,3,9,2,1,4,5,6,7};
        int[][] nArr = {
                {2,9,4},
                {3,4,6,6},
                {5,6,6,7,8}
        };
        // 遍历方式1
        for (int i = 0; i < arr.length; i++) {
            System.out.println("i="+arr[i]);
        }

        // 遍历方式2 for each
        for (int n :arr) {
            System.out.println("n="+n);
        }

        // 打印数组内容
        System.out.println(Arrays.toString(arr));

        // 对数组进行排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString((arr)));


        System.out.println(Arrays.deepToString(nArr));

        // 遍历二维数组
        for(int[] oneArr: nArr){
            System.out.println("oneArr="+ Arrays.toString(oneArr) );
            for (int i:oneArr){
                System.out.println("i="+i);
            }
        }

        System.out.println("args:" + Arrays.toString(args));

        for (String arg:args){
            if("--verison".equals(arg)){
                System.out.println("version:11.0.0");
                return;
            }
        }
    }
}
