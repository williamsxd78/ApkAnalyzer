package com.inmobile;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.inmobile.MMEConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JA\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/inmobile/MMEWrapperSuspendable;", "", "sendDeviceData", "", "", "transactionId", "disclosureMap", "Lcom/inmobile/MMEConstants$DISCLOSURES;", "", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", TtmlNode.START, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sse_fullNormalRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public interface MMEWrapperSuspendable {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {

        /* renamed from: ЀЀ04000400040004000400, reason: contains not printable characters */
        public static int f46804000400040004000400 = 57;

        /* renamed from: Ј04080408ЈЈЈЈ, reason: contains not printable characters */
        public static int f46904080408 = 2;

        /* renamed from: ЈЈ0408ЈЈЈЈ, reason: contains not printable characters */
        public static int f4700408 = 1;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object sendDeviceData$default(MMEWrapperSuspendable mMEWrapperSuspendable, String str, Map map, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                if ((i & 2) != 0) {
                    map = null;
                }
                return mMEWrapperSuspendable.sendDeviceData(str, map, continuation);
            }
            UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendDeviceData");
            int i2 = f46804000400040004000400;
            if (((f4700408 + i2) * i2) % f46904080408 == m113550408()) {
                throw unsupportedOperationException;
            }
            int m113570408 = m113570408();
            f46804000400040004000400 = m113570408;
            f4700408 = 35;
            if (((m113570408 + m1135404080408()) * f46804000400040004000400) % m1135604080408() == m113550408()) {
                throw unsupportedOperationException;
            }
            f46804000400040004000400 = m113570408();
            f4700408 = m113570408();
            throw unsupportedOperationException;
        }

        /* renamed from: Ј0408Ј0408ЈЈЈ, reason: contains not printable characters */
        public static int m1135404080408() {
            return 1;
        }

        /* renamed from: Ј0408ЈЈЈЈЈ, reason: contains not printable characters */
        public static int m113550408() {
            return 0;
        }

        /* renamed from: ЈЈ04080408ЈЈЈ, reason: contains not printable characters */
        public static int m1135604080408() {
            return 2;
        }

        /* renamed from: ЈЈЈ0408ЈЈЈ, reason: contains not printable characters */
        public static int m113570408() {
            return 49;
        }
    }

    Object sendDeviceData(String str, Map<MMEConstants.DISCLOSURES, Boolean> map, Continuation<? super Map<String, ?>> continuation);

    Object start(Continuation<? super Map<String, ?>> continuation);
}
