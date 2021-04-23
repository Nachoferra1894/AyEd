package TAD.Ejercicio3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MergeSequenceTest {
    @Test
    public void merge_Should_Sort_Sequences_While_Merging() {
        MergeSequence<String> merger = new MergeSequence<>();

        String[] firstSequence = {"apple", "banana", "orange", "peach", "watermelon"};
        String[] secondSequence = {"blueberry", "cherry", "cucumber", "date", "fig"};

        ArrayList<String> mergedSequence = new ArrayList<>();
        mergedSequence.add("apple");
        mergedSequence.add("banana");
        mergedSequence.add("blueberry");
        mergedSequence.add("cherry");
        mergedSequence.add("cucumber");
        mergedSequence.add("date");
        mergedSequence.add("fig");
        mergedSequence.add("orange");
        mergedSequence.add("peach");
        mergedSequence.add("watermelon");

        assertEquals(merger.merge(firstSequence,secondSequence),mergedSequence);
        System.out.println("The merged sequence is: " + merger.merge(firstSequence, secondSequence));
    }
}