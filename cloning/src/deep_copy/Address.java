package deep_copy;

public class Address implements Cloneable {
private String city;
public Address(String city) {
	this.city=city;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return " city=" + city ;
}
@Override
protected Address clone() throws CloneNotSupportedException {
	return (Address)super.clone();
}


}
