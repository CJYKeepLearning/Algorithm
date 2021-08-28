
    /**
     * 蒙特卡罗方法
     * 1777年，法国数学家布丰（Georges Louis Leclere de Buffon，1707—1788）提出用投针实验的方法求圆周率π
     * 假设有一个圆半径为1，所以四分之一圆面积就为PI，而包括此四分之一圆的正方形面积就为1
     * 如果随意的在正方形中投射飞标（点）好了，则这些飞标（点）有些会落于四分之一圆内，假设所投射的飞标（点）有 n点，在圆内的飞标（点）有 c 点
     * PI/4:1 = c:n
     * PI = 4*c/n
     * @author idea-pcfff
     *
     */
    public class MonteCarlo {

        public static void main(String[] args) {
            final int N = 90000;
            int sum = 0;
            for (int i = 1; i < N; i++) {
                double x = Math.random();
                double y = Math.random();
                if ((x * x + y * y) < 1)
                    sum++;
            }
            System.out.println("PI = " + (double) 4 * sum / N);
        }

    }
