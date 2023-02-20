public class String1UpToN {
    public static void main(String[] args) {

    }

    public static String string1UpToN(int n) {
        return RAppendUpTo("", 1, n);
    }

    private static String RAppendUpTo(String strSoFar, int i, int n) {
        if (i==n) return strSoFar + i;
        return RAppendUpTo( strSoFar + i + " ",i+1,n);
    }
}
