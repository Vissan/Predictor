package utils;

import org.junit.Test;
import org.scnu.utils.ReadArray;

public class TestReadArrays {

    @Test
    public void test() {
        ReadArray readArray = new ReadArray();
        int[] integers = ReadArray.GenerateArray();
        assert integers != null;
        System.out.println(integers.length);
    }
}
