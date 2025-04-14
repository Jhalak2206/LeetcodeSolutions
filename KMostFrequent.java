import java.util.*;

class KMostFrequent {
    public static List<Integer> findKMostFrequent(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));

        for (int num : frequencyMap.keySet()) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        Collections.reverse(result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> result = findKMostFrequent(arr, k);
        System.out.println(k + " most frequent elements: " + result);
    }
}
