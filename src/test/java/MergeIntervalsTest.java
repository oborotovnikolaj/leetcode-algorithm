import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {

    private final MergeIntervals mergeIntervals = new MergeIntervals();

    @Test
    void merge() {
//        List<int[]> list = new ArrayList<>();
//        list.add(new int[] {2,3});
//        list.add(new int[] {2,2});
//        list.add(new int[] {3,3});
//        list.add(new int[] {1,3});
//        list.add(new int[] {5,7});
//        list.add(new int[] {2,2});
//        list.add(new int[] {4,6});
        List<int[]> list = new ArrayList<>();
        list.add(new int[] {1,3});
        list.add(new int[] {2,6});
        list.add(new int[] {8,10});
        list.add(new int[] {15,18});

        int[][] merge = mergeIntervals.merge(list.toArray(v -> new int[v][]));
        System.out.println("shit");
    }
}