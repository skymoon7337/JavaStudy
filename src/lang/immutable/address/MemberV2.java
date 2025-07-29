package lang.immutable.address;

public class MemberV2 {

    private String name;
    private ImmutableAddress adress;

    public MemberV2(String name, ImmutableAddress adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImmutableAddress getAdress() {
        return adress;
    }

    public void setAdress(ImmutableAddress adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "MemberV2{" +
                "name='" + name + '\'' +
                ", adress=" + adress +
                '}';
    }

}
