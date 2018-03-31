import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class testEuro {

    @Test
    public void shouldReturnEqual(){
        assertEquals(new Euro(10.0), new Euro(10.0));
    }

    @Test
    public void shouldReturnNotEqual(){
        assertNotEquals(new Euro(5.0), new Euro(10.0));
    }

    @Test
    public void shouldNotEqualNull(){
        assertNotEquals(new Euro(10.0), null);
    }

    @Test
    public void shouldReturnNotEqualOtherType(){
        assertNotEquals(new Euro(10.0), new Object());
    }

    @Test
    public void shouldReturnEqualValues(){
        assertNotEquals(new Euro(10.0), new Euro(7.0).add(new Euro(3.0)));
    }

    @Test
    public void shouldReturnNotEqualValues(){
        assertNotEquals(new Euro(10.0), new Euro(5.0).add(new Euro(2.0)));
    }

}
