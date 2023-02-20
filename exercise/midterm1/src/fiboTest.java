public class fiboTest {
    public static void main(String[] args) {
        prifib(10);
    }
    public static void prifib(int n){
        fibo fi = new fibo();
        for (int i=1;i<=n;i++){
            System.out.println(fi.next());
        }
    }
}
