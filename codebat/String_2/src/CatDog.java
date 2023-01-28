public class CatDog {
    public static void main(String[] args) {
        System.out.println(catDog("1cat1cadodog"));
    }

    public static boolean catDog(String str){
        int cat = 0;
        int dog = 0;
        if (str.length()<3) return true;
        for (int i=0;i<str.length()-2;++i){
            if (str.substring(i,i+3).equals("cat")) cat++;
        }
        for (int i=0;i<str.length()-2;++i){
            if (str.substring(i,i+3).equals("dog")) dog++;
        }
        if (cat == dog) return true;
        return false;
    }
}
