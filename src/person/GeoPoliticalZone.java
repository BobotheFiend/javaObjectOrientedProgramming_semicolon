package person;

public enum GeoPoliticalZone {
//    NORTH_CENTRAL(new String[] {"Benue", "Fct", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau"}),
//    NORTH_EAST(new String [] {"Adamawa", "Borno", "Bauchi", "Gombe", "Taraba", "Yobe"}),
//    NORTH_WEST(new String [] {"Kaduna", "Kastina", "Kana", "Kebbi", "Sokoto", "Jigawa", "Zamfara"}),
//    SOUTH_SOUTH(new String [] {"Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers"}),
//    SOUTH_EAST(new String [] {"Abia", "Anambra", "Ebonyi", "Enugu", "Imo"}),


    EKITI("SOUTH_WEST"),LAGOS("SOUTH_WEST"), OSUN("SOUTH_WEST"),
    ONDO("SOUTH_WEST"), OGUN("SOUTH_WEST"), OYO("SOUTH_WEST"),

    ABIA("SOUTH_EAST"), ANAMBRA("SOUTH_EAST"), EBONYI("SOUTH_EAST"),
    ENUGU("SOUTH_EAST"), IMO("SOUTH_EAST"),

    AKWA_IBOM("SOUTH_SOUTH"), BAYELSA("SOUTH_SOUTH"), CROSS_RIVER("SOUTH_SOUTH"),
    DELTA("SOUTH_SOUTH"), EDO("SOUTH_SOUTH"), RIVERS("SOUTH_SOUTH"),

    KADUNA("NORTH_WEST"), KASTINA("NORTH_WEST"), KANO("NORTH_WEST"),
    KEBBI("NORTH_WEST"), SOKOTO("NORTH_WEST"), JIGAWA("NORTH_WEST"),
    ZAMFARA("NORTH_WEST"),

    ADAMAWA("NORTH_EAST"), BORNO("NORTH_EAST"), BAUCHI("NORTH_EAST"),
    GOMBE("NORTH_EAST"), TARABA("NORTH_EAST"), YOBE("NORTH_EAST"),

    BENUE("NORTH_CENTRAL"), FCT("NORTH_CENTRAL"), KOGI("NORTH_CENTRAL"),
    KWARA("NORTH_CENTRAL"), NASARAWA("NORTH_CENTRAL"), NIGER("NORTH_CENTRAL"),
    PLATEAU("NORTH_CENTRAL");

    private String zone;

    GeoPoliticalZone(String zone) {
        this.zone = zone;
    }

    public String getZone() {
        return zone;
    }

//    private String [] states;
//    GeoPoliticalZone(String [] states){
//        this states = states;
//    }
}

