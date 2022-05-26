import static org.junit.Assert.*;

public class Test {

    @org.junit.Test
    public void fac() {
        Polin numbers = new Polin();
        int actual = numbers.pol(5);
        int expected = 15;
        assertEquals(expected, actual);
    }
}

