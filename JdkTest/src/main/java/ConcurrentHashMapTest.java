public class ConcurrentHashMapTest {


    public static void main(String[] args) {

//        final int HASH_BITS = 0x7fffffff;
//        System.out.println(HASH_BITS);


//        System.out.println(Integer.toBinaryString(spread(-100)));
//        System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));
//
//        String value = "11111111111111110000000001100011";
//        System.out.println(value.length());

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(2));
        System.out.println(Integer.toBinaryString(1 | 3));

    }

// & Integer.MAX_VALUE
    static  int spread(int h) {
        return (h ^ (h >>> 16));
    }
}
