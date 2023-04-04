import java.util.Set;
import java.util.TreeSet;

public class Names {
    Set<String> names;

    public Names(){
        names = new TreeSet<>();
    }

    public int numNames(){
        return names.size();
    }

    public boolean lookup(String target){
        return names.contains(target);
    }

    public boolean remove(String target){
        return names.remove(target);
    }

    public boolean insert(String newName){
        return names.add(newName);
    }

    public void printNames(){
//        Iterator<String> iter = names.iterator();
//        while (iter.hasNext()){
//            System.out.print(iter.next() + " ");
//        }
        for (String i: names){
            System.out.print(i+" ");
        }
    }
}
