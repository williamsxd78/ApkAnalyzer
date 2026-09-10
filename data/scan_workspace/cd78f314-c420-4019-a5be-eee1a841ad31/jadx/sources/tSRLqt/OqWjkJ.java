package tSRLqt;

/* loaded from: classes10.dex */
public class OqWjkJ {
    private String ZnTURT;
    private int ZquMuV;
    private int czlxHw;
    private int hqOAwn;
    private int rYWDnA;
    private int rxUECP;

    public OqWjkJ(int i, String str, int i2, int i3, int i4, int i5) {
        this.hqOAwn = i;
        this.ZnTURT = str;
        this.rxUECP = i5;
        this.rYWDnA = i4;
        this.ZquMuV = i3;
        this.czlxHw = i2;
    }

    public int getDigitsCount() {
        return this.rxUECP;
    }

    public int getId() {
        return this.hqOAwn;
    }

    public int getLettersCount() {
        return this.rYWDnA;
    }

    public int getSpecialCharactersCount() {
        return this.ZquMuV;
    }

    public int getTotalLength() {
        return this.czlxHw;
    }

    public String getUniqueIdentifier() {
        return this.ZnTURT;
    }
}
