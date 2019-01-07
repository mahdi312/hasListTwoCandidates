import org.hamcrest.MatcherAssert;
import org.hamcrest.collection.IsCollectionWithSize;
import org.hamcrest.core.IsCollectionContaining;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @Test
    public void findPairs(){
        Sum find = new Sum();
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,3,8,12,17,35,145,156));
        int sum = 25;
        Set<Integer> integers = find.findingPairs(list, sum);

        MatcherAssert.assertThat(integers , IsCollectionContaining.hasItems(17,8));
    }

}