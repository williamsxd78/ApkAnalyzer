package org.bouncycastle.pqc.jcajce.interfaces;

import java.security.Key;
import org.bouncycastle.pqc.jcajce.spec.SIKEParameterSpec;

/* loaded from: classes10.dex */
public interface SIKEKey extends Key {
    SIKEParameterSpec getParameterSpec();
}
