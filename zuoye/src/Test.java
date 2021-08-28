public class Test {
    public static String convertToTitle(int columnNumber) {
        if(columnNumber<=26)
            return String.valueOf((char)('A'+columnNumber-1));
        else{
            int t = columnNumber%26;
            String b = convertToTitle(t);
            String a  = convertToTitle((columnNumber-t)/26);
            return String.valueOf(a+b);
        }
    }
    public static void main(String[] args){
        System.out.println(convertToTitle(52));
    }
/*        Object[] objects = {new Person("namePerson","addressPerson","phonePerson","emailPerson"),
        new Student("nameStudent","addressStudent","phoneStudent","emailStudent",Student.FRESHMAN),
        new Employee("nameEmployee","addressEmployee","phoneEmployee","emailEmployee","officeEmployee",10),
        new Staff("nameStaff","addressStaff","phoneStaff","emailStaff","officeStaff",10,"titleStaff")};
        for (int i=0;i<objects.length;i++){
            Person person = (Person)(objects[i]);
            System.out.println(person.toString());
        }*/
/*        double[] arr = {1,2,3,4,5,3,2,0.1};
        double min  = arr[0];
        for (int i=0;i<arr.length;i++){
            if (min>arr[i])
                min = arr[i];
        }*/
/*        System.out.println(min);*/
/*        int cnt = 0;
        int number=2;
        while (number<=1000){
            boolean isPrime = true;
            for (int div = 2;div<=number/2;div++){
                if (number%div==0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                cnt++;
                if (cnt%8==0){
                    System.out.println(number);
                }else
                    System.out.print(number+" ");
            }
            number++;
        }*/
/*        char zimu = (char)(Math.random()*26+'A');
        System.out.println(zimu);
        //int[] arr = new int[2];
        try {
            System.out.println(arr[3]);
        }catch (java.lang.ArrayIndexOutOfBoundsException exception){
            arr = new int[5];
            System.out.println(arr[3]);
        }*/

/*    }
    public final int index(double[] array){
        int min = Integer.MIN_VALUE;
        int index = 0;
        return 1;
    }*/
}
class point{
    int x, y;
    point(int x,int y ){ this.x=x;this.y=y;    }
    public void a(){}
    private int a(int b){
        System.out.println("");
        return 1;
    }
}
class circle extends point{
    int radius;
    private circle(int r,int x,int y){
        super(x,y);
        radius=r;
    }
    private void a(int a){
        System.out.println("");
    }
}