import entity.EventRegistration;
import entity.SingleEventRegistration;
import entity.TeamEventRegistration;

public class ShowYourTalentRegistration {
    public static void main(String[] args) {
        EventRegistration event1 = new SingleEventRegistration("Jenny", "Sing&Win", 1);
        event1.registerEvent();
        EventRegistration event2 = new TeamEventRegistration("Aura", "ShakeALeg", 5, 1);
        event2.registerEvent();
        EventRegistration event3 = new SingleEventRegistration("Hudson", "PlayAway", 2);
        event3.registerEvent();
    }
}
