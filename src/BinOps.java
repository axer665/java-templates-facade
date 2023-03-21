public class BinOps {
    public String sum(String a, String b) {
        int arg1 = Integer.parseInt(a, 2);
        int arg2 = Integer.parseInt(b, 2);
        int summ = arg1 + arg2;
        String result = Integer.toBinaryString(summ);
        return result;
    }

    public String mult(String a, String b) {
        Integer arg1 = Integer.parseInt(a, 2);
        Integer arg2 = Integer.parseInt(b, 2);
        int mult = arg1 * arg2;
        String result = Integer.toBinaryString(mult);
        return result;
    }
}