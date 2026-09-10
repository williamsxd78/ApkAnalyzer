package com.vivaaerobus.app.androidExtensions.model.crmAttributionManager;

import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Context.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/vivaaerobus/app/androidExtensions/model/crmAttributionManager/Context;", "", "channel", "", "campaignId", "campaignName", "messageId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChannel", "()Ljava/lang/String;", "getCampaignId", "getCampaignName", "getMessageId", "component1", "component2", "component3", "component4", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "androidExtensions_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Context {
    public static final int $stable = 0;
    private final String campaignId;
    private final String campaignName;
    private final String channel;
    private final String messageId;

    public Context(String channel, String campaignId, String campaignName, String messageId) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(campaignName, "campaignName");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        this.channel = channel;
        this.campaignId = campaignId;
        this.campaignName = campaignName;
        this.messageId = messageId;
    }

    public static /* synthetic */ Context copy$default(Context context, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = context.channel;
        }
        if ((i & 2) != 0) {
            str2 = context.campaignId;
        }
        if ((i & 4) != 0) {
            str3 = context.campaignName;
        }
        if ((i & 8) != 0) {
            str4 = context.messageId;
        }
        return context.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCampaignId() {
        return this.campaignId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCampaignName() {
        return this.campaignName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public final Context copy(String channel, String campaignId, String campaignName, String messageId) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(campaignId, "campaignId");
        Intrinsics.checkNotNullParameter(campaignName, "campaignName");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        return new Context(channel, campaignId, campaignName, messageId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Context)) {
            return false;
        }
        Context context = (Context) other;
        return Intrinsics.areEqual(this.channel, context.channel) && Intrinsics.areEqual(this.campaignId, context.campaignId) && Intrinsics.areEqual(this.campaignName, context.campaignName) && Intrinsics.areEqual(this.messageId, context.messageId);
    }

    public final String getCampaignId() {
        return this.campaignId;
    }

    public final String getCampaignName() {
        return this.campaignName;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public int hashCode() {
        return (((((this.channel.hashCode() * 31) + this.campaignId.hashCode()) * 31) + this.campaignName.hashCode()) * 31) + this.messageId.hashCode();
    }

    public String toString() {
        return "Context(channel=" + this.channel + ", campaignId=" + this.campaignId + ", campaignName=" + this.campaignName + ", messageId=" + this.messageId + ")";
    }
}
