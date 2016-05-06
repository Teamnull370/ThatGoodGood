package com.teamnull.thatgoodgood.gittabz;

import android.graphics.Path;
import android.graphics.Canvas;
import android.graphics.Paint;
/**
 * Created by Danny on 5/3/2016.
 */
class Circle{
    public float ln;
    public float ex;
    public int fr;
    public int tim;
    private Path cir;
    private static final int time_factor = 3;

    public Circle( float x, int line, int fret, Integer timmy){
        ex = x;
        ln = line;
        fr = fret;
        tim = timmy;
    }
    public void draw(Canvas canvas, Paint p, Paint w, Paint num, int current_time, int offset){
        canvas.drawCircle(ex-(current_time-tim)/time_factor + offset*2, ln, 25, p);
//        //White circle
        canvas.drawCircle(ex-(current_time-tim)/time_factor + offset, ln, 24, w);
//        //Number
        canvas.drawText(String.valueOf(fr), ex - (current_time - tim) / time_factor + offset, ln + 10, num);
    }
    public void setX(float ex) {
        this.ex = ex;
    }

    public float getX() {
        return ex;
    }

    public int getPosition(int current_time) {
        return (int)ex - (current_time-tim)/time_factor;
    }

    public void setLn(int ln) {
        this.ln = ln;
    }

    public float getLn() {
        return ln;
    }

    public void setFret(int fr) {
        this.fr = fr;
    }

    public float getFret() {
        return fr;
    }

    public void setTime(Integer tim) {
        this.tim = tim;
    }

    public Integer getTime() {
        return tim;
    }
}


