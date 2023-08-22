import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList< Student  > arrayList = new ArrayList<>();
        arrayList.add( new Student(533," bek1 ", " wolf1", 30) );
        arrayList.add(new Student(767, "vek3 " , " wolf2 ", 28 ));
        arrayList.add(new Student(466, "aek2 " , " wolf3 ", 16 )  );



        TreeSet < Student > treeSet = new TreeSet <>();
        for ( Student student : arrayList) {
                if ( student.getId() % 2 == 1) {
                    treeSet.add ( student);
                }
            }
        for ( Student treeSets : treeSet){

            System.out.println(treeSets);
        }













    }
}