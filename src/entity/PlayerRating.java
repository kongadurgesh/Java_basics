package entity;

public class PlayerRating {
    private int playerPosition;
    private String playerName;
    private float criticOneRating;
    private float criticTwoRating;
    private float criticThreeRating;
    private float averageRating;
    private char category;
    public PlayerRating(int playerPosition, String playerName) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    public void calculateAverageRating(float criticOneRating, float criticTwoRating){
        averageRating = (criticOneRating +criticTwoRating)/2;
    }

    public void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating){
        averageRating = (criticOneRating +criticTwoRating+criticThreeRating)/3;
    }
    public void calculateCategory(){
        if(this.averageRating>8){
            category = 'A';
        }
        else if(this.averageRating>5 && this.averageRating<=8){
            category = 'B';
        }
        else if(this.averageRating>0 && this.averageRating<=5){
            category = 'C';
        }
    }
    
    public void display() {
        System.out.println( "PlayerRating [playerPosition=" + playerPosition + ", playerName=" + playerName + ", criticOneRating="
                + criticOneRating + ", criticTwoRating=" + criticTwoRating + ", criticThreeRating=" + criticThreeRating
                + ", averageRating=" + averageRating + ", category=" + category + "]");
    }
    public static void main(String[] args) {
        PlayerRating rating1 = new PlayerRating(1, "Beckham");
        rating1.calculateAverageRating(9f, 9.9f);
        rating1.calculateCategory();
        rating1.display();

        PlayerRating rating2 = new PlayerRating(1, "Oscar");
        rating2.calculateAverageRating(1f, 1f, 1f);
        rating2.calculateCategory();
        rating2.display();
    }
}
