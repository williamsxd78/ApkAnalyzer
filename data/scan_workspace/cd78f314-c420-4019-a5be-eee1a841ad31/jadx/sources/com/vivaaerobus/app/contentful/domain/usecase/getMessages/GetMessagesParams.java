package com.vivaaerobus.app.contentful.domain.usecase.getMessages;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import com.vivaaerobus.app.selectBundles.presentation.chooseBundle.ChooseBundleModal;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetMessagesParams.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ \u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003HÆ\u0001¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0004HÖ\u0081\u0004R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/contentful/domain/usecase/getMessages/GetMessagesParams;", "", ChooseBundleModal.ARG_PARAMS, "", "", "<init>", "([Ljava/lang/String;)V", "getParams", "()[Ljava/lang/String;", "[Ljava/lang/String;", "component1", ContentfulConstants.CONTENT_TYPE_COPY, "([Ljava/lang/String;)Lcom/vivaaerobus/app/contentful/domain/usecase/getMessages/GetMessagesParams;", "equals", "", "other", "hashCode", "", "toString", "contentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class GetMessagesParams {
    private final String[] params;

    public GetMessagesParams(String[] params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    public static /* synthetic */ GetMessagesParams copy$default(GetMessagesParams getMessagesParams, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = getMessagesParams.params;
        }
        return getMessagesParams.copy(strArr);
    }

    /* renamed from: component1, reason: from getter */
    public final String[] getParams() {
        return this.params;
    }

    public final GetMessagesParams copy(String[] params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return new GetMessagesParams(params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetMessagesParams) && Intrinsics.areEqual(this.params, ((GetMessagesParams) other).params);
    }

    public final String[] getParams() {
        return this.params;
    }

    public int hashCode() {
        return Arrays.hashCode(this.params);
    }

    public String toString() {
        return "GetMessagesParams(params=" + Arrays.toString(this.params) + ")";
    }
}
