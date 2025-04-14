import java.util.*;

class TopKFrequent {
    public static List<Integer> findTopKFrequent(int[] nums, int k) {
       
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

       
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (minHeap.size() < k) {
                minHeap.offer(entry);
            } else if (entry.getValue() > minHeap.peek().getValue()) {
                minHeap.poll();
                minHeap.offer(entry);
            }
        }

     
        List<Integer> topKList = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topKList.add(minHeap.poll().getKey());
        }
        Collections.reverse(topKList); 
        return topKList;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        List<Integer> topK = findTopKFrequent(nums, k);
        System.out.println("Top " + k + " frequent elements: " + topK);
    }
}
