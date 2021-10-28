public class BinOps {
    public String sum(String a, String b) {
        int aAsInt = Integer.parseInt(a, 2);
        int bAsInt = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aAsInt + bAsInt);
    }
    public String mult(String a, String b) {
        int aAsInt = Integer.parseInt(a, 2);
        int bAsInt = Integer.parseInt(b, 2);
        return Integer.toBinaryString(aAsInt * bAsInt);
    }

    }
