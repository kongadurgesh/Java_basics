package entity;

public class SingleEventRegistration extends EventRegistration {
    private int participantNo;

    public SingleEventRegistration(String name, String nameOfEvent, int participantNo) {
        super(name, nameOfEvent);
        this.participantNo = participantNo;
    }

    public int getParticipantNo() {
        return participantNo;
    }

    public void setParticipantNo(int participantNo) {
        this.participantNo = participantNo;
    }

    public void registerEvent() {
        super.registerEvent();
        if (getNameOfEvent().equals("ShakeALeg")) {
            System.out.println("Your registration fee is: " + 100);
        } else if (getNameOfEvent().equals("Sing&Win")) {
            System.out.println("Your registration fee is: " + 150);
        } else if (getNameOfEvent().equals("Actathon")) {
            System.out.println("Your registration fee is: " + 70);
        } else if (getNameOfEvent().equals("PlayAway")) {
            System.out.println("Your registration fee is: " + 130);
        } else {
            System.out.println("invalid");
        }
        System.out.println("You are participant no: " + getParticipantNo());
    }
}
