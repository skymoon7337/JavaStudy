package collection.compare.test;

//enum은 Enum을 상속받고 있다. Enum은 Comparable이 final로 이미 정의되어있음. (ordinal로)
public enum Mark {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLOVER("♣");

    private String icon;

    Mark(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }

}
