package oshi;

import org.junit.Test;

public class GetClassName {

    @Test
    public void test() {
        String name = this.getClass().getSimpleName();
        System.out.println(name);
    }
}
