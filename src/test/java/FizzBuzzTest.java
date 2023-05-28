import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    public final String FIZZ = "Fizz";
    public final String BUZZ = "Buzz";
    public final String FIZZ_BUZZ = "FizzBuzz";
    private FizzBuzz game;

    @Before
    public void before(){
        game = new FizzBuzz();
    }

    @Test
    public void should_returnNumbers_whenNotAMultipleOf3Or5(){

        List<String> numbersList = game.getNumbers();
        Assert.assertEquals("1", numbersList.get(0));
        Assert.assertEquals("2", numbersList.get(1));
        Assert.assertEquals("7", numbersList.get(6));
        Assert.assertEquals("13", numbersList.get(12));
    }

    @Test
    public void should_returnFizz_whenMultipleOf3(){

        List<String> numberList = game.getNumbers();
        Assert.assertEquals(FIZZ, numberList.get(2));
        Assert.assertEquals(FIZZ, numberList.get(5));
        Assert.assertEquals(FIZZ, numberList.get(8));
        Assert.assertEquals(FIZZ, numberList.get(11));
    }

    @Test
    public void should_returnBuzz_whenMultipleOf5(){
        List<String> numberList = game.getNumbers();
        Assert.assertEquals(BUZZ, numberList.get(4));
        Assert.assertEquals(BUZZ, numberList.get(9));
        Assert.assertEquals(BUZZ, numberList.get(19));
        Assert.assertEquals(BUZZ, numberList.get(24));
    }

    @Test
    public void should_returnFizzBuzz_whenMultipleOf3And5(){
        List<String> numberList = game.getNumbers();
        Assert.assertEquals(FIZZ_BUZZ, numberList.get(14));
        Assert.assertEquals(FIZZ_BUZZ, numberList.get(29));
        Assert.assertEquals(FIZZ_BUZZ, numberList.get(59));
        Assert.assertEquals(FIZZ_BUZZ, numberList.get(89));
    }
}
