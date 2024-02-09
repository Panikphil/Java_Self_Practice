package day13_self_practice.state_task;

public class Florida extends State{
    public Florida(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }

    private String stateSlogan = "\"In God We Trust\"";
    private String capital = "Tallahassee";

    void nicknames() {
        System.out.println(getName() + " nickname is  \"The Sunshine State\"");
    }

    public String getStateSlogan() {
        return stateSlogan;
    }

    public String getCapital() {
        return capital;
    }


    @Override
    public String toString() {
        return super.toString() +
                "stateSlogan='" + stateSlogan + '\'' +
                ", capital='" + capital + '\'' +
                "}";
    }
}
