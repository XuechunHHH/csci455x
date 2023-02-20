public class Triangle {
    public static void main(String[] args) {

    }

    public static int triangle(int rows){
        if (rows==0) return 0;
        return rows + triangle(rows-1);
    }
}
