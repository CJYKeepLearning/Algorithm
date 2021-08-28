import java.util.Scanner;

public class AnalyzeGrade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int temp=0,i=0,sum=0;
        while (temp!=-1){
            arr[i++] = temp;
            sum += temp;
            temp = sc.nextInt();
        }
        int m=0,l=0;
        double ave = sum/(i-1);
        for (;i>=1;i--){
            if (arr[i]>=ave)
                m++;
            else
                l++;
        }
        System.out.println("有"+m+"个分数大于等于平均分");
        System.out.println("有"+l+"个分数小于平均分");
    }
}
