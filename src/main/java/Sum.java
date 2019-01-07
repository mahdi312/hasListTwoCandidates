import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sum {

    public Set<Integer> findingPairs(List<Integer> list, int sum) {

        HashSet<Integer> numbers = new HashSet<Integer>();
        for (int i = 0; i < list.size(); i++) {
            int temp = sum - list.get(i);
            if (temp >= 0 && numbers.contains(temp)) {
                System.out.println("Pair with given sum " +
                        sum + " is (" + list.get(i) +
                        ", " + temp + ")");
            }
            numbers.add(list.get(i));
        }
        return numbers;
    }
}
