import static org.junit.Assert.*;  
import org.junit.Test;
class GearTest{
    public void test(){
        Gear gear = new Gear(52,11,26,2);
        assertEquals(137.1,gear.gearInches());

    }
}