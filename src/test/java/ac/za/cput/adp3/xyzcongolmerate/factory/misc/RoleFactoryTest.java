package ac.za.cput.adp3.xyzcongolmerate.factory.misc;

import ac.za.cput.adp3.xyzcongolmerate.domain.misc.Role;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {


    @Test
    public void buildRole() {

     Role role = RoleFactory.buildRole("customer");
     assertEquals(role,role);
     assertNotNull(role.getRoleId());


        //throw new UnsupportedOperationException("Not supported yet.");

    }
}