package day13_self_practice.state_task;

public class Texas extends State {
    public Texas(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }

    private String stateSlogan = "Friendship";
    private String capital = "Austin";

    void nicknames() {
        System.out.println(getName() + " nickname is \"the Lone Star State\"");
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
