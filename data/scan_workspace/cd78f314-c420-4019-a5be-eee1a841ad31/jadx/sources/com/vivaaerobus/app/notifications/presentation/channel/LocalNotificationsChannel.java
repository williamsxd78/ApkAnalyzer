package com.vivaaerobus.app.notifications.presentation.channel;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalNotificationsChannel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/vivaaerobus/app/notifications/presentation/channel/LocalNotificationsChannel;", "", "<init>", "()V", "NOTIFICATIONS_CHANNEL_ID", "", "create", "", "context", "Landroid/content/Context;", "notifications_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LocalNotificationsChannel {
    public static final LocalNotificationsChannel INSTANCE = new LocalNotificationsChannel();
    public static final String NOTIFICATIONS_CHANNEL_ID = "check_in_notifications_channel";

    private LocalNotificationsChannel() {
    }

    public final void create(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATIONS_CHANNEL_ID, "Local notifications", 4);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationChannel.setLockscreenVisibility(1);
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
    }
}
