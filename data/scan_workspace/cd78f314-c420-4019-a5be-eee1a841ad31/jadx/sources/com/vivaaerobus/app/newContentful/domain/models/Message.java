package com.vivaaerobus.app.newContentful.domain.models;

import coil3.util.UtilsKt;
import com.braze.models.Banner;
import com.vivaaerobus.app.contentful.data.dataSource.common.ContentfulConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.cms.CMSAttributeTableGenerator;

/* compiled from: Message.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003567B\u007f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0099\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0014\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00102\u001a\u000203HÖ\u0081\u0004J\n\u00104\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00068"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/Message;", "", "tag", "", "type", "title", "text", "displayColor", "callToAction", "Lcom/vivaaerobus/app/newContentful/domain/models/Message$CallToAction;", "ctaText", "ctaLink", "badgeColor", Banner.HTML, "customBadgeColor", "customImage", "Lcom/vivaaerobus/app/newContentful/domain/models/Message$CustomImage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vivaaerobus/app/newContentful/domain/models/Message$CallToAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/vivaaerobus/app/newContentful/domain/models/Message$CustomImage;)V", "getTag", "()Ljava/lang/String;", "getType", "getTitle", "getText", "getDisplayColor", "getCallToAction", "()Lcom/vivaaerobus/app/newContentful/domain/models/Message$CallToAction;", "getCtaText", "getCtaLink", "getBadgeColor", "getHtml", "getCustomBadgeColor", "getCustomImage", "()Lcom/vivaaerobus/app/newContentful/domain/models/Message$CustomImage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "CallToAction", "CustomImage", "File", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class Message {
    private final String badgeColor;
    private final CallToAction callToAction;
    private final String ctaLink;
    private final String ctaText;
    private final String customBadgeColor;
    private final CustomImage customImage;
    private final String displayColor;
    private final String html;
    private final String tag;
    private final String text;
    private final String title;
    private final String type;

    /* compiled from: Message.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/Message$CallToAction;", "", "url", "", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getText", "component1", "component2", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CallToAction {
        private final String text;
        private final String url;

        public CallToAction(String str, String str2) {
            this.url = str;
            this.text = str2;
        }

        public static /* synthetic */ CallToAction copy$default(CallToAction callToAction, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = callToAction.url;
            }
            if ((i & 2) != 0) {
                str2 = callToAction.text;
            }
            return callToAction.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final CallToAction copy(String url, String text) {
            return new CallToAction(url, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallToAction)) {
                return false;
            }
            CallToAction callToAction = (CallToAction) other;
            return Intrinsics.areEqual(this.url, callToAction.url) && Intrinsics.areEqual(this.text, callToAction.text);
        }

        public final String getText() {
            return this.text;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.text;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "CallToAction(url=" + this.url + ", text=" + this.text + ")";
        }
    }

    /* compiled from: Message.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0005HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/Message$CustomImage;", "", UtilsKt.SCHEME_FILE, "Lcom/vivaaerobus/app/newContentful/domain/models/Message$File;", "description", "", "title", "<init>", "(Lcom/vivaaerobus/app/newContentful/domain/models/Message$File;Ljava/lang/String;Ljava/lang/String;)V", "getFile", "()Lcom/vivaaerobus/app/newContentful/domain/models/Message$File;", "getDescription", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class CustomImage {
        private final String description;
        private final File file;
        private final String title;

        public CustomImage(File file, String str, String str2) {
            this.file = file;
            this.description = str;
            this.title = str2;
        }

        public static /* synthetic */ CustomImage copy$default(CustomImage customImage, File file, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                file = customImage.file;
            }
            if ((i & 2) != 0) {
                str = customImage.description;
            }
            if ((i & 4) != 0) {
                str2 = customImage.title;
            }
            return customImage.copy(file, str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final File getFile() {
            return this.file;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final CustomImage copy(File file, String description, String title) {
            return new CustomImage(file, description, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CustomImage)) {
                return false;
            }
            CustomImage customImage = (CustomImage) other;
            return Intrinsics.areEqual(this.file, customImage.file) && Intrinsics.areEqual(this.description, customImage.description) && Intrinsics.areEqual(this.title, customImage.title);
        }

        public final String getDescription() {
            return this.description;
        }

        public final File getFile() {
            return this.file;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            File file = this.file;
            int hashCode = (file == null ? 0 : file.hashCode()) * 31;
            String str = this.description;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "CustomImage(file=" + this.file + ", description=" + this.description + ", title=" + this.title + ")";
        }
    }

    /* compiled from: Message.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/vivaaerobus/app/newContentful/domain/models/Message$File;", "", "url", "", "fileName", CMSAttributeTableGenerator.CONTENT_TYPE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getFileName", "getContentType", "component1", "component2", "component3", ContentfulConstants.CONTENT_TYPE_COPY, "equals", "", "other", "hashCode", "", "toString", "newContentful_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final /* data */ class File {
        private final String contentType;
        private final String fileName;
        private final String url;

        public File(String str, String str2, String str3) {
            this.url = str;
            this.fileName = str2;
            this.contentType = str3;
        }

        public static /* synthetic */ File copy$default(File file, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = file.url;
            }
            if ((i & 2) != 0) {
                str2 = file.fileName;
            }
            if ((i & 4) != 0) {
                str3 = file.contentType;
            }
            return file.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        public final File copy(String url, String fileName, String contentType) {
            return new File(url, fileName, contentType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof File)) {
                return false;
            }
            File file = (File) other;
            return Intrinsics.areEqual(this.url, file.url) && Intrinsics.areEqual(this.fileName, file.fileName) && Intrinsics.areEqual(this.contentType, file.contentType);
        }

        public final String getContentType() {
            return this.contentType;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fileName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.contentType;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "File(url=" + this.url + ", fileName=" + this.fileName + ", contentType=" + this.contentType + ")";
        }
    }

    public Message(String str, String str2, String str3, String str4, String str5, CallToAction callToAction, String str6, String str7, String str8, String str9, String str10, CustomImage customImage) {
        this.tag = str;
        this.type = str2;
        this.title = str3;
        this.text = str4;
        this.displayColor = str5;
        this.callToAction = callToAction;
        this.ctaText = str6;
        this.ctaLink = str7;
        this.badgeColor = str8;
        this.html = str9;
        this.customBadgeColor = str10;
        this.customImage = customImage;
    }

    public static /* synthetic */ Message copy$default(Message message, String str, String str2, String str3, String str4, String str5, CallToAction callToAction, String str6, String str7, String str8, String str9, String str10, CustomImage customImage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = message.tag;
        }
        if ((i & 2) != 0) {
            str2 = message.type;
        }
        if ((i & 4) != 0) {
            str3 = message.title;
        }
        if ((i & 8) != 0) {
            str4 = message.text;
        }
        if ((i & 16) != 0) {
            str5 = message.displayColor;
        }
        if ((i & 32) != 0) {
            callToAction = message.callToAction;
        }
        if ((i & 64) != 0) {
            str6 = message.ctaText;
        }
        if ((i & 128) != 0) {
            str7 = message.ctaLink;
        }
        if ((i & 256) != 0) {
            str8 = message.badgeColor;
        }
        if ((i & 512) != 0) {
            str9 = message.html;
        }
        if ((i & 1024) != 0) {
            str10 = message.customBadgeColor;
        }
        if ((i & 2048) != 0) {
            customImage = message.customImage;
        }
        String str11 = str10;
        CustomImage customImage2 = customImage;
        String str12 = str8;
        String str13 = str9;
        String str14 = str6;
        String str15 = str7;
        String str16 = str5;
        CallToAction callToAction2 = callToAction;
        return message.copy(str, str2, str3, str4, str16, callToAction2, str14, str15, str12, str13, str11, customImage2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: component10, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    /* renamed from: component11, reason: from getter */
    public final String getCustomBadgeColor() {
        return this.customBadgeColor;
    }

    /* renamed from: component12, reason: from getter */
    public final CustomImage getCustomImage() {
        return this.customImage;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayColor() {
        return this.displayColor;
    }

    /* renamed from: component6, reason: from getter */
    public final CallToAction getCallToAction() {
        return this.callToAction;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCtaText() {
        return this.ctaText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCtaLink() {
        return this.ctaLink;
    }

    /* renamed from: component9, reason: from getter */
    public final String getBadgeColor() {
        return this.badgeColor;
    }

    public final Message copy(String tag, String type, String title, String text, String displayColor, CallToAction callToAction, String ctaText, String ctaLink, String badgeColor, String html, String customBadgeColor, CustomImage customImage) {
        return new Message(tag, type, title, text, displayColor, callToAction, ctaText, ctaLink, badgeColor, html, customBadgeColor, customImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return Intrinsics.areEqual(this.tag, message.tag) && Intrinsics.areEqual(this.type, message.type) && Intrinsics.areEqual(this.title, message.title) && Intrinsics.areEqual(this.text, message.text) && Intrinsics.areEqual(this.displayColor, message.displayColor) && Intrinsics.areEqual(this.callToAction, message.callToAction) && Intrinsics.areEqual(this.ctaText, message.ctaText) && Intrinsics.areEqual(this.ctaLink, message.ctaLink) && Intrinsics.areEqual(this.badgeColor, message.badgeColor) && Intrinsics.areEqual(this.html, message.html) && Intrinsics.areEqual(this.customBadgeColor, message.customBadgeColor) && Intrinsics.areEqual(this.customImage, message.customImage);
    }

    public final String getBadgeColor() {
        return this.badgeColor;
    }

    public final CallToAction getCallToAction() {
        return this.callToAction;
    }

    public final String getCtaLink() {
        return this.ctaLink;
    }

    public final String getCtaText() {
        return this.ctaText;
    }

    public final String getCustomBadgeColor() {
        return this.customBadgeColor;
    }

    public final CustomImage getCustomImage() {
        return this.customImage;
    }

    public final String getDisplayColor() {
        return this.displayColor;
    }

    public final String getHtml() {
        return this.html;
    }

    public final String getTag() {
        return this.tag;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.tag;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.text;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayColor;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        CallToAction callToAction = this.callToAction;
        int hashCode6 = (hashCode5 + (callToAction == null ? 0 : callToAction.hashCode())) * 31;
        String str6 = this.ctaText;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.ctaLink;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.badgeColor;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.html;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.customBadgeColor;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        CustomImage customImage = this.customImage;
        return hashCode11 + (customImage != null ? customImage.hashCode() : 0);
    }

    public String toString() {
        return "Message(tag=" + this.tag + ", type=" + this.type + ", title=" + this.title + ", text=" + this.text + ", displayColor=" + this.displayColor + ", callToAction=" + this.callToAction + ", ctaText=" + this.ctaText + ", ctaLink=" + this.ctaLink + ", badgeColor=" + this.badgeColor + ", html=" + this.html + ", customBadgeColor=" + this.customBadgeColor + ", customImage=" + this.customImage + ")";
    }
}
