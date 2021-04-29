package prototype;

/**
 * @name DesignPatternDemo
 * @class name：prototype
 * @class describe
 * @anthor jin
 * @time 2021/4/30 0:30
 * @change
 * @chang time
 */

public class Address implements Cloneable {

  private String city;
  private  String address;

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public Address clone() {
    Address address = null;
    try {
      address = ((Address) super.clone());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return address;
  }

  @Override
  public String toString() {
    return "Address{" + "city='" + city + '\'' + ", address='" + address + '\'' + '}';
  }

}
