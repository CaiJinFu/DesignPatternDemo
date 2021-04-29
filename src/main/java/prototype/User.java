package prototype;

/**
 * @name DesignPatternDemo
 * @class name：prototype
 * @class describe
 * @anthor jin
 * @time 2021/4/30 0:21
 * @change
 * @chang time
 */
public class User implements Cloneable {
  private int age;
  private String name;
  private Address address;

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public User clone() {
    User user = null;
    try {
      user = ((User) super.clone());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return user;
  }

  @Override
  public String toString() {
    return "User{" + "age=" + age + ", name='" + name + '\'' + ", address=" + address + '}';
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
