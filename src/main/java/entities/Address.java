package entities;

public class Address {
  private int id;
  private String street_name;
  private String city_name;
  private String state_name;
  private String zipcode;

  public Address() {}
  public Address(String street, String city,
                 String state, String zipcode) {
    this.street_name = street;
    this.city_name = city;
    this.state_name = state;
    this.zipcode = zipcode;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getStreet_name() {
    return street_name;
  }

  public void setStreet_name(String street_name) {
    this.street_name = street_name;
  }

  public String getCity_name() {
    return city_name;
  }

  public void setCity_name(String city_name) {
    this.city_name = city_name;
  }

  public String getState_name() {
    return state_name;
  }

  public void setState_name(String state_name) {
    this.state_name = state_name;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }
}
