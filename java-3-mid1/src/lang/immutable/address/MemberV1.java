package lang.immutable.address;

public class MemberV1 {

    private String name;
    private Address adress;

    public MemberV1(String name, Address adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }

}
