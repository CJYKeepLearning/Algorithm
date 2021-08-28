import java.util.ArrayList;
import java.util.Scanner;
public class AnalyzeGrade {
    public static void main(String[] args) {
        System.out.println("请输入需要输入的考试分数个数:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum=0,temp=0,i=0;
        System.out.println("请输入成绩：");
        while (true){
            temp = sc.nextInt();
            if (temp==-1){
                break;
            }
            if (temp>=0 && temp<=100){
                arr[i++] = temp;
                sum += temp;
            }
        }
        double ave = sum/i;
        int m=0,l=0;
        for (int j=0;j<i;j++){
            if (arr[j]>=ave)
                m++;
            else
                l++;
        }
        System.out.println("有"+m+"个分数大于等于平均分");
        System.out.println("有"+l+"个分数小于平均分");
    }
}
