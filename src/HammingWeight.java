public class HammingWeight {
    int hammingWeight(int n) {
        int count = 0;
        while (n > 0){
            if( n % 2 == 1){
                count++;
            }
            n = n / 2;
        }
        return count;
    }
    static int hammingWeightBitwise(int n){ // static is used when we don't need objects
        int count = 0;
        while (n > 0){
            if( (n & 1) == 1){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        HammingWeight obj = new HammingWeight(); // class name obj = new class name();
        int result = obj.hammingWeight(8);
        System.out.println(result);
        System.out.println(hammingWeightBitwise(5));
    }
}
