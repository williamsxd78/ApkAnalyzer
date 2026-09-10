package com.tom_roush.fontbox.afm;

/* loaded from: classes3.dex */
public class KernPair {
    private String firstKernCharacter;
    private String secondKernCharacter;
    private float x;
    private float y;

    public String getFirstKernCharacter() {
        return this.firstKernCharacter;
    }

    public String getSecondKernCharacter() {
        return this.secondKernCharacter;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setFirstKernCharacter(String str) {
        this.firstKernCharacter = str;
    }

    public void setSecondKernCharacter(String str) {
        this.secondKernCharacter = str;
    }

    public void setX(float f) {
        this.x = f;
    }

    public void setY(float f) {
        this.y = f;
    }
}
