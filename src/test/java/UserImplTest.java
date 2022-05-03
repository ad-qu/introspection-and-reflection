import edu.upc.eetac.dsa.User;
import edu.upc.eetac.dsa.UserImpl;

import org.junit.Test;
import org.junit.Assert;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class UserImplTest {

    @Test
    public void basic() throws Exception {

        UserImpl u1 = new UserImpl (1, "Juan");
        Assert.assertEquals("Juan", u1.getName());

        Class c = Class.forName("edu.upc.eetac.dsa.UserImpl");
        User u2 = (User) c.newInstance();

        u2.setName("Pere");
        Assert.assertEquals("Pere", u2.getName());

        Class c2 = u1.getClass();

        for (Constructor constr: c2.getConstructors()) {
            System.out.println(constr.toGenericString());
        }

        for (Field f: c2.getDeclaredFields()) {
            System.out.println(f.getName());
        }

        for (Method m: c2.getDeclaredMethods()) {
            System.out.println(m.getName());
        }

        System.out.println("====================");

        for (Method m: c2.getMethods()) {
            System.out.println(m.getName());
        }
    }
}
