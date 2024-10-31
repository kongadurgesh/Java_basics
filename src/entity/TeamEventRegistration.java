package entity;

public class TeamEventRegistration extends EventRegistration {
    private int noOfParticipants;
    private int teamNo;

    public TeamEventRegistration(String name, String nameOfEvent, int noOfParticipants, int teamNo) {
        super(name, nameOfEvent);
        this.noOfParticipants = noOfParticipants;
        this.teamNo = teamNo;
    }

    public int getNoOfParticipants() {
        return noOfParticipants;
    }

    public void setNoOfParticipants(int noOfParticipants) {
        this.noOfParticipants = noOfParticipants;
    }

    public int getTeamNo() {
        return teamNo;
    }

    public void setTeamNo(int teamNo) {
        this.teamNo = teamNo;
    }

    public void registerEvent() {
        super.registerEvent();
        if (getNameOfEvent().equals("ShakeALeg")) {
            System.out.println("Your registration fee is: " + 50 * getNoOfParticipants());
        } else if (getNameOfEvent().equals("Sing&Win")) {
            System.out.println("Your registration fee is: " + 60 * getNoOfParticipants());
        } else if (getNameOfEvent().equals("Actathon")) {
            System.out.println("Your registration fee is: " + 80 * getNoOfParticipants());
        } else if (getNameOfEvent().equals("PlayAway")) {
            System.out.println("Your registration fee is: " + 100 * getNoOfParticipants());
        }
        System.out.println("You are participant no: " + getTeamNo());
    }
}
