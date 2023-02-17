import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
       int[] array=new int[20];
        ArrayList<Integer> integers=new ArrayList<>();
        LinkedList<Integer>linkedList=new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            array[i]= random.nextInt(2);
            integers.add(random.nextInt(2));
            linkedList.add(random.nextInt(2));
        }
        Arrays.sort(array);
        Collections.sort(integers);
        Collections.sort(linkedList);
        System.out.println(Arrays.toString(array));
        System.out.println(integers);
        System.out.println(linkedList);

    }
    public void sortByArrayList(){
        Comparator<Integer> sortByArrayList=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
    }
    public void sortByLinkedList(){
        Comparator<Integer> sortByLinkedList=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
    }
}