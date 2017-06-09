import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();        //创建随机数生成器对象
        int[] nums = new int[16];            //创建数组
        int temp;                            //交换的临时变量
        boolean exchanged;                   //每轮排序中是否发生了元素变换
        System.out.println("排序前的数组：");
        for (int i = 0; i < nums.length; i++){
            nums[i] = random.nextInt(100);
            System.out.print(nums[i] + " ");
        }
        //N个元素进行冒泡排序，至多执行N-1轮
        for (int i = 0; i < nums.length; i++){
            exchanged = false;
            for (int j = 0; j < nums.length - 1; j++){
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    exchanged = true;
                }
            }
            if (exchanged == false){
                break;
            }
        }

        System.out.println("\n排序后的数组：");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
