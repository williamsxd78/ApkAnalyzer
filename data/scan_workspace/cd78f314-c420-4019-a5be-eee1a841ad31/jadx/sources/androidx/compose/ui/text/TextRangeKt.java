package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* compiled from: TextRange.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0000\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000b\u001a\u0013\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\r\u001a!\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0015"}, d2 = {"substring", "", "", "range", "Landroidx/compose/ui/text/TextRange;", "substring-FDrldGo", "(Ljava/lang/CharSequence;J)Ljava/lang/String;", "TextRange", TtmlNode.START, "", TtmlNode.END, "(II)J", FirebaseAnalytics.Param.INDEX, "(I)J", "coerceIn", "minimumValue", "maximumValue", "coerceIn-8ffj60Q", "(JII)J", "packWithCheck", "", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TextRangeKt {
    public static final long TextRange(int i) {
        return TextRange(i, i);
    }

    public static final long TextRange(int i, int i2) {
        return TextRange.m8161constructorimpl(packWithCheck(i, i2));
    }

    /* renamed from: coerceIn-8ffj60Q, reason: not valid java name */
    public static final long m8178coerceIn8ffj60Q(long j, int i, int i2) {
        int m8172getStartimpl = TextRange.m8172getStartimpl(j);
        if (m8172getStartimpl < i) {
            m8172getStartimpl = i;
        }
        if (m8172getStartimpl > i2) {
            m8172getStartimpl = i2;
        }
        int m8167getEndimpl = TextRange.m8167getEndimpl(j);
        if (m8167getEndimpl >= i) {
            i = m8167getEndimpl;
        }
        if (i <= i2) {
            i2 = i;
        }
        return (m8172getStartimpl == TextRange.m8172getStartimpl(j) && i2 == TextRange.m8167getEndimpl(j)) ? j : TextRange(m8172getStartimpl, i2);
    }

    private static final long packWithCheck(int i, int i2) {
        if (!(i >= 0 && i2 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("start and end cannot be negative. [start: " + i + ", end: " + i2 + AbstractJsonLexerKt.END_LIST);
        }
        return (i2 & BodyPartID.bodyIdMax) | (i << 32);
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m8179substringFDrldGo(CharSequence charSequence, long j) {
        return charSequence.subSequence(TextRange.m8170getMinimpl(j), TextRange.m8169getMaximpl(j)).toString();
    }
}
