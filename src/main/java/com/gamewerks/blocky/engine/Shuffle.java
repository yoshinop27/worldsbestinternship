package com.gamewerks.blocky.engine;
import java.util.Random;

public class Shuffle {
    public static PieceKind[] fy_shuffle(PieceKind pieces[]){
        Random random = new Random();
        for (int i=pieces.length-1; i > 0; i--) {
            // Randomize
            int randomNumber = random.nextInt(i);

            // Swap values
            PieceKind temp = pieces[i];
            pieces[i] = pieces[randomNumber];
            pieces[randomNumber] = temp;
        }

        return pieces;
    }
}
