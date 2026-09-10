package com.lexisnexisrisk.threatmetrix.rl;

import com.airbnb.paris.R2;

/* loaded from: classes3.dex */
public interface TMXProfilingHandle {

    /* loaded from: classes3.dex */
    public static class Result {
        public static int FKN = 3716;
        public static int IRp = 6974;
        private final TMXStatusCode MtieOK;
        private String NRTcQt;

        public Result(String str, TMXStatusCode tMXStatusCode) {
            int i;
            if ((IRp ^ 6974) == 0) {
                this.NRTcQt = str;
                this.MtieOK = tMXStatusCode;
                return;
            }
            while (true) {
                int i2 = IRp;
                int i3 = i2 + 13;
                if (i3 == 61) {
                    i = ((i2 + i2) ^ R2.styleable.SwitchCompat_switchMinWidth) * 107;
                } else if (i3 == 79) {
                    i = (i2 * 9) ^ 3010;
                }
                IRp = i;
            }
        }

        public String getSessionID() {
            return this.NRTcQt;
        }

        public TMXStatusCode getStatus() {
            return this.MtieOK;
        }
    }

    void cancel();

    String getSessionID();

    void sendBehavioSecData();

    void stopBehavioSecDataCollection();
}
