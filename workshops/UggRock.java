

public class UggRock {
    private UggRockSize size;
    private UggRockType type;

    public UggRock(UggRockSize size, UggRockType type) {
        this.size = size;
        this.type = type;
    }
    
    public UggRockType RockType() {
        return type;
    }

    public UggRockSize RockSize() {
        return size;
    }
 
    public String toString(UggRockSize size, UggRockType type) {
        return "The rock is a " + type + size;
    }

    public int rockValue() {
        return size.getMultiplierValue() * type.getMultiplierValue();
    }
}