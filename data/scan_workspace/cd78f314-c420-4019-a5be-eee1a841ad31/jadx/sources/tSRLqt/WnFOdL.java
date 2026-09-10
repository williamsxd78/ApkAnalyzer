package tSRLqt;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import com.vivaaerobus.app.more.presentation.language.LanguageFragment;
import java.util.Observable;

/* JADX WARN: Incorrect field signature: Ldouble; */
/* JADX WARN: Incorrect field signature: Lint; */
/* loaded from: classes10.dex */
public class WnFOdL extends Observable implements TextWatcher {
    private static int EqsBss = -1;
    private static final String WYbZcq = "TextChangeListener";
    public static char[] fn;
    private boolean HgBVdV;
    private final SSK ZnTURT;
    private final int hqOAwn;
    private final OfO lXtmjW;
    private int IHJHdt = 0;
    private boolean lxqcJZ = false;
    private boolean NaIaxz = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WnFOdL(Context context, int i, String str, boolean z) {
        this.lXtmjW = context;
        this.hqOAwn = i;
        this.ZnTURT = str;
        this.HgBVdV = z;
    }

    /* JADX WARN: Incorrect return type in method signature: ()V */
    public static /* synthetic */ String rva(String str) {
        if (fn == null) {
            fn = new char[32767];
            int i = 3;
            for (int i2 = 0; i2 < 32767; i2++) {
                i = ((i + (i ^ i2)) + 90) % 63;
                fn[i2] = (char) i;
            }
        }
        char[] cArr = new char[str.length()];
        char[] charArray = str.toCharArray();
        for (int i3 = 0; i3 < str.length(); i3++) {
            cArr[i3] = (char) (cArr[i3] + ((char) (charArray[i3] ^ fn[i3])));
        }
        return new String(cArr);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4;
        ClipData primaryClip;
        try {
            this.lxqcJZ = false;
            this.NaIaxz = false;
            String str = "";
            if (i3 > 0 && i >= 0) {
                try {
                    if (i < charSequence.length()) {
                        str = charSequence.subSequence(i, Math.min(i + i3, charSequence.length())).toString();
                    }
                } catch (Exception unused) {
                }
            }
            int i5 = 1;
            if (i3 > 1) {
                ClipboardManager clipboardManager = (ClipboardManager) this.lXtmjW.getSystemService(rva("Bqq\u007fWm@QN"));
                CharSequence text = (clipboardManager == null || !clipboardManager.hasPrimaryClip() || (primaryClip = clipboardManager.getPrimaryClip()) == null || primaryClip.getItemCount() <= 0) ? null : primaryClip.getItemAt(0).getText();
                if (text == null || !str.equals(text.toString())) {
                    this.NaIaxz = true;
                } else {
                    this.lxqcJZ = true;
                }
                i4 = -1;
            } else {
                i4 = (i3 == 1 && LanguageFragment.SPACE.equals(str)) ? 3 : i2 >= 1 ? 4 : (i3 == 1 && str.length() > 0 && Character.isUpperCase(str.charAt(0))) ? 5 : 0;
            }
            if (!this.lxqcJZ) {
                i5 = i4;
            }
            if (this.NaIaxz) {
                i5 = 2;
            }
            int i6 = this.HgBVdV ? 0 : i5;
            setChanged();
            long uptimeMillis = SystemClock.uptimeMillis();
            Long.valueOf(uptimeMillis).getClass();
            notifyObservers(new EYAmUY(uptimeMillis, "2", this.hqOAwn, this.ZnTURT, i6));
            this.IHJHdt = charSequence.length();
        } catch (Exception unused2) {
        }
    }
}
