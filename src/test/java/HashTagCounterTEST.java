
import org.example.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import java.util.ArrayList;

public class HashTagCounterTEST {
    @Test
    public void hashTagCounterTest(){
        ArrayList<String> input = new ArrayList<>();
        input.add("I #love epic #game!");
        input.add("#game #game is my #game life!");
        input.add("Enter zone 51! #suicide #game");
        input.add("I am deadinside #suicide #game #suicide #suicide");
        input.add("I am genius #clever #genius");
        String[] expected = {"#1. #game = 4","#2. #suicide = 2","#3. #clever = 1","#4. #love = 1","#5. #genius = 1"};
        String[] inputed = HashTagCounter.HashTagCounterFUNC(input);
        Assertions.assertArrayEquals(expected, inputed);
    }
}
