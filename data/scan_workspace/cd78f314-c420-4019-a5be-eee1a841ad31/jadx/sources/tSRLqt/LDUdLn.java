package tSRLqt;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes10.dex */
public class LDUdLn {
    private static final String WYbZcq = "LDUdLn";

    LDUdLn() {
    }

    public static List<View> getAllChildren(View view) {
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        linkedList.add(view);
        while (!linkedList.isEmpty()) {
            View view2 = (View) linkedList.remove();
            arrayList.add(view2);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    linkedList.add(viewGroup.getChildAt(i));
                }
            }
        }
        return arrayList;
    }
}
