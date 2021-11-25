public class Player4 {
     private boolean gameFinished(Player A, Player B){
         if(B.isFinished()){
             return true;
         }
         else if(A.isFinished()){
             return true;
         }
         else{
             return false;
         }
     }
        public static void main(String[] args){
            Player playerA= new Player();
            Player playerB= new Player();
            Player4 game = new Player4();
        
            
            while(!game.gameFinished(playerA, playerB)){
                 playerA.rollDice();
                 playerB.rollDice();
                
                System.out.println("Runde nummer: " + playerA.getTrows());
                System.out.println("Spiller A sin nåværende score: " + playerA.getSumPoints() + "\nSpiller B sin nåværende score: " + playerB.getSumPoints());
            
            }
            if(playerA.getSumPoints() < playerB.getSumPoints()){
                System.out.println("Spiller B vant!!");
            }else{
                System.out.println("Spiller A vant!!");
            }
    }


}
    

