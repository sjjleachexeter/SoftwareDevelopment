enum UggRockSize {
    BIGUN((short)5),
    QUITE_BIGUN((short)3),
    NOT_SO_BIGUN((short)1);

    private final short multiplierValue;

    private UggRockSize(short multiplierValue){
        this.multiplierValue = multiplierValue;
    } 

    public short getMultiplierValue() {
        return multiplierValue;
    }
}

enum UggRockType {
    SPECKILY((short) 7),
    OUCHY_BLACK((short) 20),
    FLOATY((short) 1),
    HOT_HOT_HOT((short) 15);

    private final short multiplierValue;

    private UggRockType(short multiplierValue){
        this.multiplierValue =multiplierValue;
    }

    public short getMultiplierValue(){
        return multiplierValue;
    }

}
