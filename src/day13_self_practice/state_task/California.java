package day13_self_practice.state_task;

public class California extends State {
    public California(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);
    }

    private String stateSlogan = "\"Eureka\"";
    private String capital = "Sacramento";

    void nicknames() {
        System.out.println(getName() + " nickname is \"The Golden State\"");
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
