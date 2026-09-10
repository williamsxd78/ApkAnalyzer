package com.tom_roush.fontbox.afm;

/* loaded from: classes3.dex */
public class TrackKern {
    private int degree;
    private float maxKern;
    private float maxPointSize;
    private float minKern;
    private float minPointSize;

    public int getDegree() {
        return this.degree;
    }

    public float getMaxKern() {
        return this.maxKern;
    }

    public float getMaxPointSize() {
        return this.maxPointSize;
    }

    public float getMinKern() {
        return this.minKern;
    }

    public float getMinPointSize() {
        return this.minPointSize;
    }

    public void setDegree(int i) {
        this.degree = i;
    }

    public void setMaxKern(float f) {
        this.maxKern = f;
    }

    public void setMaxPointSize(float f) {
        this.maxPointSize = f;
    }

    public void setMinKern(float f) {
        this.minKern = f;
    }

    public void setMinPointSize(float f) {
        this.minPointSize = f;
    }
}
