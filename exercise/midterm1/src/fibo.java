public class fibo {
    private int fib1;
    private int fib2;

    public fibo(){
        fib1=1;
        fib2=1;
    }

    public int next(){
        int res = fib1;
        fib1 = fib2;
        fib2 = fib2+res;
        return res;
    }
}
