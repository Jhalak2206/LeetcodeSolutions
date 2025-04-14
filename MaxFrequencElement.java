import java.util.HashMap;
import java.util.Map;

class MaxFrequencyElement {
    public static int findMaxFrequencyElement(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        int maxElement = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int element = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxElement = element;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 2};
        int maxElement = findMaxFrequencyElement(arr);
        System.out.println("Element with maximum frequency: " + maxElement);
    }
}

