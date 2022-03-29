import edu.upc.eetac.dsa.User;
import edu.upc.eetac.dsa.UserImpl;

import org.junit.Test;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class UserImplTest {

    UserImpl u1;
    UserImpl u2 = new UserImpl(1, "Manolo");

    @Before
    public void setNames() {
        /////////////////
    }

    @Test
    public void getNames() {

        System.out.println(u2.getName());
    }

    @After
    public void clearNames() {

        this.u1 = null;
        this.u2 = null;
    }
}
