import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Test {


    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>();
//        map.put("1" , "2");
//
//
//        int sum = 0;
//        for (int i = 0; i < 16; i ++) {
//            sum += Math.pow(2, i);
//        }
//
//
//        System.out.println( "sum : " + sum);
//        System.out.println(Math.pow(2, 16));

//        System.out.println(1 << 30);
//        System.out.println(1 > 31);
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//
//        System.out.println(Integer.toBinaryString(Integer.MIN_VALUE));
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
//
//        System.out.println(Integer.toBinaryString(1 << 30));
//        System.out.println(1 << 31);
//
//
//        System.out.println(Integer.toBinaryString(tableSizeFor(4562)));

        int[] num = {0};
        IntStream.range(0, ((int)Math.pow(2, 20))).forEach(i -> {
            if (tableSizeFor(i) % 2 > 0) {
                System.out.println(i);
            }
            num[0] ++;
        });

        System.out.println(num[0]);

        System.out.println(Integer.toBinaryString((int)Math.pow(2, 10) & 3));

//
//        System.out.println(Integer.toBinaryString(tableSizeFor(4562)));
//
//        System.out.println(Integer.toBinaryString(4562 >>> 1));

    }
    static final int MAXIMUM_CAPACITY = 1 << 30;

    static final int tableSizeFor(int cap) {
        int n = cap /*- 1*/;
//        System.out.println(Integer.toBinaryString(n));

//        System.out.println(Integer.toBinaryString(n >>> 1));
        n |= n >>> 1;
//        System.out.println(Integer.toBinaryString(n));
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
//        System.out.println(Integer.toBinaryString(n));
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }
}
