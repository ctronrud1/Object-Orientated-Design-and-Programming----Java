// ************************************************************ 
// File Name: Task6_Runs
// Author: Charlie Tronrud
// Purpose:he Coin class from lecture is in the file Task6_Coin.java. Write a program Task6_Runs.java to find the
//...length of the longest run of heads in 100 flips of the coin
// ************************************************************
public class Task6_Runs {
    public static void main(String[] args) {
        Task6_Coin coin = new Task6_Coin();
        
        int currentRun = 0;
        int maxRun = 0;        
        boolean prevIsHeads = false;
        
        for (int i = 0; i < 100; i++) {
            coin.flip();
            boolean isHeads = coin.isHeads();
            if (isHeads) {
                currentRun++;
            } 
            else
            {
                if (currentRun > maxRun) 
                {
                    maxRun = currentRun;
                }
                currentRun = 0;
            }
            prevIsHeads = isHeads;
            System.out.println(coin);
        }
        if (prevIsHeads)
        {
            if (currentRun > maxRun)
            {
                maxRun = currentRun;
            }
        }
        System.out.println("The longest run was " + maxRun + " heads in a row");
    }
}
