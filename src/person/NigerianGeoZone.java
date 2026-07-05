package person;

public class NigerianGeoZone {

    private final String [] easternStates = {"ABIA", "ANAMBRA", "IMO", "ENUGU", "EBONYI"};
    private final String [] westernStates = {"EKITI", "LAGOS", "ONDO", "OGUN", "OSUN", "OYO"};
    private final String [] southernStates = {"AKWA_IBOM", "BAYELSA", "CROSS_RIVER", "DELTA", "EDO", "RIVERS"};
    private final String [] northCentralStates = {"BENUE", "FCT", "KOGI", "KWARA", "NASARAWA", "NIGER", "PLATEAU"};
    private final String [] northWestStates = {"KADUNA", "KASTINA", "KANA", "KEBBI", "SOKOTO", "JIGAWA", "ZAMFARA"};
    private final String [] northEastStates = {"ADAMAWA", "BORNO", "BAUCHI", "GOMBE", "TARABA", "YOBE"};

    private String geoZone;
    private final String stateOfOrigin;
    private  String name;

    public NigerianGeoZone(String name, String stateOfOrigin) {
        this.name = name;
        this.stateOfOrigin = stateOfOrigin;
    }

    private String getStateOfOrigin() {
        return stateOfOrigin;
    }

    private void getSouthEast() {

        String userState = getStateOfOrigin();

        for (String state : easternStates) {
            if (state.equals(userState.toUpperCase())) {
                this.geoZone = "South-East";
                break;
            }
        }
    }

    private void getSouthWest() {
        for (String state : westernStates) {
            if (state.equals(stateOfOrigin.toUpperCase())) {
                this.geoZone = "South-West";
                break;
            }
        }
    }

    private void getSouthSouth() {
        String userState = getStateOfOrigin();
        for (String state : southernStates) {
            if (state.equals(userState.toUpperCase())) {
                this.geoZone = "South-South";
                break;
            }
        }
    }

    private void getNorthCentral() {
        String userState = getStateOfOrigin();
        for (String state : northCentralStates) {
            if (state.equals(userState.toUpperCase())) {
                this.geoZone = "North-Central";
                break;
            }
        }
    }

    private void getNorthEastCentral() {
        String userState = getStateOfOrigin();
        for (String state : northEastStates) {
            if (state.equals(userState.toUpperCase())) {
                this.geoZone = "North-East";
                break;
            }
        }
    }

    private void getNorthWestCentral() {
        String userState = getStateOfOrigin();
        for (String state : northWestStates) {
            if (state.equals(userState.toUpperCase())) {
                this.geoZone = "North-West";
                break;
            }
        }
    }


    private void validateGeoPoliticalZone() {
        getNorthCentral();
        getNorthEastCentral();
        getNorthWestCentral();
        getSouthEast();
        getSouthWest();
        getSouthSouth();
        if (geoZone == null) {
            throw new IllegalArgumentException("Invalid State");
        }
    }

    public String getGeoZone() {
        validateGeoPoliticalZone();
        return geoZone;
    }

//    public String getName(){
//        return name;
//    }
//
//    public String getStateofOrigin(){
//        return stateOfOrigin;
//    }


    static void main() {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int count = 0;
        String choice = "Yes";
        boolean running = choice.equalsIgnoreCase("YES");
        while(running) {
            ++count;
            System.out.printf("--------------------Person %d---------------------%n%n", count);

            System.out.print("What is your Name: ");
            String userName = input.nextLine();

            System.out.print("What is your state: ");
            String userState = input.nextLine();

            NigerianGeoZone person = new NigerianGeoZone(userName, userState);
            String geoZone = person.getGeoZone();

            System.out.printf("Hello %s Your State is %s and your GeoPoliticalZone Is %s%n", userName, userState, geoZone);

            System.out.print("Do you wish to continue? ");
            choice = input.nextLine().toUpperCase();

            if(choice.equalsIgnoreCase("NO")) running = false;

        }
    }
}
