public class WithoutString {
    public static void main(String[] args) {
        System.out.println();
    }

    public static String withoutString(String base, String remove){
        int blen = base.length();
        int rlen = remove.length();
        if (blen<rlen) return base;
        for (int i = 0;i<=blen-rlen;++i){
            if (i==0 && (base.substring(i,i+rlen).toLowerCase()).equals(remove.toLowerCase())){
                base = base.substring(i+rlen);
                blen = base.length();
                if (blen<rlen) break;
                i -= rlen;
            } else if (i>0 && (base.substring(i,i+rlen).toLowerCase()).equals(remove.toLowerCase())) {
                base = base.substring(0,i)+base.substring(i+rlen);
                blen = base.length();
                if (blen<rlen) break;
                i -= rlen;
            } else if (i==blen-rlen && (base.substring(i,i+rlen).toLowerCase()).equals(remove.toLowerCase())){
                base = base.substring(0,i);
                blen = base.length();
                if (blen<rlen) break;
                i -= rlen;
            }
        }
        return base;
    }
}
