package day13_self_practice.state_task;

public class Virginia extends State{
    public Virginia(String name, String abbreviation, String politicalParty, String governor, String senator, int population) {
        super(name, abbreviation, politicalParty, governor, senator, population);

    }

    private String stateSlogan = "\"Thus always to tyrants\"";
    private String capital = "Richmond";

    void nicknames(){
        System.out.println(getName()+" nicknames are: Mother of states, Old Dominion; Mother of Presidents");
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
