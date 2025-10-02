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

    @Override 
    public String toString() {
        String stringsize = 
    }

    private String formatName(){
        switch (size) {
            case bigun:
                return "Bigun"
        }
        String lower =  name.toLowerCase();
        String replaced = lower.replace("_", "-");

        return replaced;
    }


}