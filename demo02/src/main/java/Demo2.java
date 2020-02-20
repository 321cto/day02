
public class Demo2 {
    public static void main(String[] args) {
        //标签lab
        lab:
        for (int i = 2; i <= 100; i++) {
            //使用Math.sqrt()方法求i的开平方，提高效率
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue lab;
                }
            }
            //质数i
            System.out.print(i+" cc");
        }
    }
}


