import java.util.Date;

/**
 * Author: Andrews, Hannah
 * Description:Here lies an interface for allllll of the items
 */


public interface Item {

  public static final String MANUFACTURER = "OracleProduction";

  public void setProductionNumber(int number);

  public void setName(String name);

  public String getName();

  public Date getManufactureDate();

  public int getSerialNumber();

}
