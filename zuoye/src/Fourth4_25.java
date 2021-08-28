public class Fourth4_25 {
    public static void main(String[] args) {
        //store vehicle plate numbers
        int[] num = new int[4];

        //generate uppercase letters
        for (int i=0;i<num.length-1;i++){
            num[i] = (int)(Math.random()*26)+65;
        }

        //generate four digits
        num[num.length-1] = (int)(Math.random()*10000);

        //display vehicle plate numbers
        for (int i=0;i<num.length-1;i++)
            System.out.print((char)num[i]);
        //printf
        System.out.printf("%04d",num[num.length-1]);
    }
}
