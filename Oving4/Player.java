import java.util.Random;
public class Player {
    private Random dice;
    private int sumPoints;
    private int trows; 


    public Player(){
        this.sumPoints=0;
        this.trows = 0;
        this.dice = new Random();
    }

    public int getSumPoints(){
        return sumPoints;
    }
    public int getTrows(){
     return trows;
 }

  public Random getDice(){
    return dice;
  }

    public void rollDice(){
        int rollDice = dice.nextInt(6)+1;
        if(rollDice == 1 ){
            this.sumPoints = 0;
        }else{
            this.sumPoints+= rollDice;
        }
        this.trows++;
    }

    public Boolean isFinished(){
        if(sumPoints >= 100){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    }