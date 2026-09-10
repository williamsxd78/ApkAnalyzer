package org.bouncycastle.operator;

import java.io.OutputStream;

/* loaded from: classes10.dex */
public interface AADProcessor {
    OutputStream getAADStream();

    byte[] getMAC();
}
