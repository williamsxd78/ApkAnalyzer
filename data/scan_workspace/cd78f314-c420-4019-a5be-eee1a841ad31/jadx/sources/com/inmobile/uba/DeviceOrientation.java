package com.inmobile.uba;

import com.braze.models.inappmessage.InAppMessageBase;
import ictkdxpsjjglkvx.C0402;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/inmobile/uba/DeviceOrientation;", "", InAppMessageBase.ORIENTATION, "", "(Ljava/lang/String;ILjava/lang/String;)V", "getOrientation", "()Ljava/lang/String;", "LANDSCAPE", "PORTRAIT", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public enum DeviceOrientation {
    LANDSCAPE("l"),
    PORTRAIT("p");


    /* renamed from: ММ041CМ041C041C041C, reason: contains not printable characters */
    private final String f3009041C041C041C041C;

    static {
        int m13797044B044B = ((m13797044B044B() + m13795044B044B044B()) * m13797044B044B()) % m13796044B044B044B();
        m13794044B044B044B044B();
        int m13797044B044B2 = m13797044B044B();
        int m13795044B044B044B = (m13797044B044B2 * (m13795044B044B044B() + m13797044B044B2)) % m13796044B044B044B();
    }

    DeviceOrientation(String str) {
        this.f3009041C041C041C041C = str;
    }

    public static DeviceOrientation valueOf(String str) {
        int m13797044B044B = m13797044B044B();
        if ((m13797044B044B * (m13795044B044B044B() + m13797044B044B)) % m13796044B044B044B() != 0) {
            int m13797044B044B2 = m13797044B044B();
            int m13795044B044B044B = (m13797044B044B2 * (m13795044B044B044B() + m13797044B044B2)) % m13796044B044B044B();
        }
        return (DeviceOrientation) C0402.m17189045304530453(DeviceOrientation.class, str);
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static DeviceOrientation[] valuesCustom() {
        Object clone = values().clone();
        int m13797044B044B = m13797044B044B();
        int m13795044B044B044B = (m13797044B044B * (m13795044B044B044B() + m13797044B044B)) % m13796044B044B044B();
        return (DeviceOrientation[]) clone;
    }

    /* renamed from: ы044B044B044Bыы044B, reason: contains not printable characters */
    public static int m13794044B044B044B044B() {
        return 0;
    }

    /* renamed from: ы044Bы044Bыы044B, reason: contains not printable characters */
    public static int m13795044B044B044B() {
        return 1;
    }

    /* renamed from: ыы044B044Bыы044B, reason: contains not printable characters */
    public static int m13796044B044B044B() {
        return 2;
    }

    /* renamed from: ыыы044Bыы044B, reason: contains not printable characters */
    public static int m13797044B044B() {
        return 91;
    }

    public final String getOrientation() {
        int m13797044B044B = ((m13797044B044B() + m13795044B044B044B()) * m13797044B044B()) % m13796044B044B044B();
        m13794044B044B044B044B();
        String str = this.f3009041C041C041C041C;
        int m13797044B044B2 = ((m13797044B044B() + m13795044B044B044B()) * m13797044B044B()) % m13796044B044B044B();
        m13794044B044B044B044B();
        return str;
    }
}
