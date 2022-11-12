import org.example.HigherZeroSorted;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HigherThanZeroSortedTEST {
    @Test
    public void higherZeroSorted(){
        int[] input = {10, 3, -53, 1, 54,74, -8, 43, -11};
        int[] expected = {74, 54, 43, 10, 3, 1};
        Assertions.assertArrayEquals(expected, HigherZeroSorted.returnHigherThanZeroSortedBackward(input));
    }
}
