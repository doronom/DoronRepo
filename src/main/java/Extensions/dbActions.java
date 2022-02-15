package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class dbActions extends CommonOps
{
    //Get credentials from DB by query
    @Step("Get customer details from DB")
    public static List<String> getCredentials(String query)
    {
        List <String> DBcredentials = new ArrayList<String>();
        try
        {
            rs = stmt.executeQuery(query);
            rs.next();
            DBcredentials.add(rs.getString(1));
            DBcredentials.add(rs.getString(2));
        }
        catch (Exception e)
        {
            System.out.println("Query execution error, see details: " + e);
        }
        return DBcredentials;
    }
}
