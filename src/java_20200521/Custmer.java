package java_20200521;

public class Custmer {
private String name;
private String addr;
public Custmer(String name, String addr) {
	this.name = name;
	this.addr= addr;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}

//오버라이딩 이퀄이랑 클래스를
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((addr == null) ? 0 : addr.hashCode());
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Custmer other = (Custmer) obj;
	if (addr == null) {
		if (other.addr != null)
			return false;
	} else if (!addr.equals(other.addr))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public String toString() {
	return "Custmer [name=" + name + ", addr=" + addr + "]";
}



}
