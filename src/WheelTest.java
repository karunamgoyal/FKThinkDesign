import static org.junit.Assert.*;  
import org.junit.Test;
class WheelTest{
    public void test(){
        Wheel wheel = new Wheel(26, 2);
        assertEquals(30,wheel.diameter());

    }
}