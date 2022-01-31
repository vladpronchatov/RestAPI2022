package testApi;

import employee.resources.SingleEmployeeResources;
import org.testng.annotations.Test;

public class TestSingleEmployeeResources extends SingleEmployeeResources {

    @Test
    public void singleValidEmployeeCall(){
        getValidSingleEmployeeResources();
    }

    @Test
    public void singleInValidEmployeeCall(){
        getInValidSingleEmployeeResources();
    }
}
