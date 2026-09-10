package IeltIF;

import android.util.Log;

/* loaded from: classes.dex */
public class NMQKxr {
    public static final int DEBUG = 3;
    private static final NMQKxr EJvezp = new NMQKxr();
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int NONE = 15;
    public static final String TAG = "NMQKxr";
    public static final int WARN = 5;
    private int lMuakv = 5;

    public NMQKxr() {
        hhlqkI();
    }

    private void BdjMx(int i, String str, String str2) {
        String str3;
        try {
            String str4 = XFiXk.rUA("~pL\b") + str;
            if (str2.length() <= 4000) {
                Log.println(i, str4, str2);
                return;
            }
            int length = str2.length() / 4000;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = i2 + 1;
                int i4 = i3 * 4000;
                if (i4 >= str2.length()) {
                    str3 = XFiXk.rUA("lPnF\u0000") + i2 + XFiXk.rUA("\u0006\u0011") + str2.substring(i2 * 4000);
                } else {
                    str3 = XFiXk.rUA("lPnF\u0000") + i2 + XFiXk.rUA("\u0006\u0011") + str2.substring(i2 * 4000, i4);
                }
                Log.println(i, str4, str3);
                i2 = i3;
            }
        } catch (Exception unused) {
        }
    }

    private void cFIZfc(int i, String str, String str2, Throwable... thArr) {
        if (str == null) {
            try {
                str = XFiXk.rUA("rdP~\u007fhoH");
            } catch (Exception unused) {
                return;
            }
        }
        if (str2 == null) {
            str2 = XFiXk.rUA("RDp^\u0000Q]h");
        }
        if (i < this.lMuakv) {
            return;
        }
        if (thArr.length > 0) {
            str2 = str2 + '\n' + Log.getStackTraceString(thArr[0]);
        }
        BdjMx(i, str, str2);
    }

    public static void d(String str, String str2, Throwable... thArr) {
        getInstance().cFIZfc(3, str, str2, thArr);
    }

    public static void e(String str, String str2, Throwable... thArr) {
        getInstance().cFIZfc(6, str, str2, thArr);
    }

    public static NMQKxr getInstance() {
        return EJvezp;
    }

    public static int getLogLevel() {
        return getInstance().lMuakv;
    }

    private void hhlqkI() {
        this.lMuakv = 3;
    }

    public static void i(String str, String str2, Throwable... thArr) {
        getInstance().cFIZfc(4, str, str2, thArr);
    }

    public static void setLogLevel(int i) {
        getInstance().lMuakv = i;
    }

    public static void w(String str, String str2, Throwable... thArr) {
        getInstance().cFIZfc(5, str, str2, thArr);
    }
}
