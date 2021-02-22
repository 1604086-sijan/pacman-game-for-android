package com.example.jimmyle.pacmanandroid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;


public class Ghost {
    private int xPos, yPos, dir;

    public Ghost(int blockSize){

        xPos = 8 * blockSize;
        yPos = 4 * blockSize;
        dir = 4;
    }

    public int getXPos(){ return xPos; }
    public int getYPos(){ return yPos; }
    public int getDir(){ return dir; }

    public void setXPos(int xPos){ this.xPos = xPos; }
    public void setYPos(int yPos){ this.yPos = yPos; }
    public void setDir(int dir){ this.dir = dir; }

    public void drawGhost(BitmapImages bitmap, Canvas canvas, Movement movement, Paint paint, Context context, int type) {
       if (type == 0) {

           movement.moveGhost0();

           canvas.drawBitmap(bitmap.getGhostBitmap0(), this.getXPos(), this.getYPos(), paint);

           movement.tryDeath(context);
           }
        else if (type == 1) {

           movement.moveGhost1();

           canvas.drawBitmap(bitmap.getGhostBitmap1(), this.getXPos(), this.getYPos(), paint);

           movement.tryDeath(context);
           }
        else if (type == 2) {

           movement.moveGhost2();

           canvas.drawBitmap(bitmap.getGhostBitmap2(), this.getXPos(), this.getYPos(), paint);

           movement.tryDeath(context);
           }
        else if (type == 3) {

           movement.moveGhost3();

           canvas.drawBitmap(bitmap.getGhostBitmap3(), this.getXPos(), this.getYPos(), paint);

           movement.tryDeath(context);
        }
    }
}
