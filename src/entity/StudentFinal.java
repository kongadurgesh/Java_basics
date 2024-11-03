package entity;

public class StudentFinal {
    private final int stipend = calculateTotalStipend();
    private int studentId;
    private int aggregateMarks;
    public int getStipend() {
        return stipend;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getAggregateMarks() {
        return aggregateMarks;
    }
    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }
    public int calculateTotalStipend(){
        int tempStipend = 100;
        if(aggregateMarks>=85 && aggregateMarks<90){
            tempStipend += 10;
        }
        if(aggregateMarks>=90 && aggregateMarks<95){
            tempStipend += 15;
        }
        if(aggregateMarks>=95 && aggregateMarks<=100){
            tempStipend += 20;
        }
        return tempStipend;
    }
    public static void main(String[] args) {
        StudentFinal student1 = new StudentFinal();
        student1.setStudentId(1212);
        student1.setAggregateMarks(93);
        double totalStipend = student1.calculateTotalStipend();
        System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);
        StudentFinal student2 = new StudentFinal();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);
		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}
}
