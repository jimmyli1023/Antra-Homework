import java.util.PriorityQueue;

public class FindSecondLarge {
    public static int secondLargest(int[] array) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a) ;
        for (int i = 0; i < array.length; i++) {
            pq.offer(array[i]);
        }
        pq.poll();
        int result = pq.peek();
        return result;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,5,6,8,9};
        int result = secondLargest(array);
        System.out.println(result);
    }
}
