package com.apollographql.apollo3.api;

import com.google.common.net.HttpHeaders;
import com.vivaaerobus.app.VivaApplication;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Error.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B_\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t\u0012\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0003H\u0016R!\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/apollographql/apollo3/api/Error;", "", "message", "", "locations", "", "Lcom/apollographql/apollo3/api/Error$Location;", "path", "extensions", "", "nonStandardFields", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getExtensions", "()Ljava/util/Map;", "getLocations", "()Ljava/util/List;", "getMessage", "()Ljava/lang/String;", "getNonStandardFields", "getPath", "toString", "Builder", HttpHeaders.LOCATION, "apollo-api"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Error {
    private final Map<String, Object> extensions;
    private final List<Location> locations;
    private final String message;
    private final Map<String, Object> nonStandardFields;
    private final List<Object> path;

    /* compiled from: Error.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0015\u001a\u00020\u0016J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u0012\u001a\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\nJ\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\r\"\u0004\b\u0014\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/apollographql/apollo3/api/Error$Builder;", "", "message", "", "(Ljava/lang/String;)V", "extensions", "", "getExtensions", "()Ljava/util/Map;", "locations", "", "Lcom/apollographql/apollo3/api/Error$Location;", "getLocations", "()Ljava/util/List;", "setLocations", "(Ljava/util/List;)V", "getMessage", "()Ljava/lang/String;", "path", "getPath", "setPath", VivaApplication.Constants.BUILD, "Lcom/apollographql/apollo3/api/Error;", "putExtension", "name", "value", "apollo-api"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Builder {
        private final Map<String, Object> extensions;
        private List<Location> locations;
        private final String message;
        private List<? extends Object> path;

        public Builder(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
            this.extensions = new LinkedHashMap();
        }

        public final Error build() {
            return new Error(this.message, this.locations, this.path, this.extensions, null);
        }

        public final Map<String, Object> getExtensions() {
            return this.extensions;
        }

        public final List<Location> getLocations() {
            return this.locations;
        }

        public final String getMessage() {
            return this.message;
        }

        public final List<Object> getPath() {
            return this.path;
        }

        public final Builder locations(List<Location> locations) {
            Intrinsics.checkNotNullParameter(locations, "locations");
            this.locations = locations;
            return this;
        }

        public final Builder path(List<? extends Object> path) {
            Intrinsics.checkNotNullParameter(path, "path");
            this.path = path;
            return this;
        }

        public final Builder putExtension(String name, Object value) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.extensions.put(name, value);
            return this;
        }

        public final void setLocations(List<Location> list) {
            this.locations = list;
        }

        public final void setPath(List<? extends Object> list) {
            this.path = list;
        }
    }

    /* compiled from: Error.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/apollographql/apollo3/api/Error$Location;", "", "line", "", "column", "(II)V", "getColumn", "()I", "getLine", "toString", "", "apollo-api"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Location {
        private final int column;
        private final int line;

        public Location(int i, int i2) {
            this.line = i;
            this.column = i2;
        }

        public final int getColumn() {
            return this.column;
        }

        public final int getLine() {
            return this.line;
        }

        public String toString() {
            return "Location(line = " + this.line + ", column = " + this.column + ')';
        }
    }

    @Deprecated(message = "Use Error.Builder instead", replaceWith = @ReplaceWith(expression = "Builder(message = message).locations(locations).path(path).extensions(extensions)", imports = {}))
    public Error(String message, List<Location> list, List<? extends Object> list2, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.message = message;
        this.locations = list;
        this.path = list2;
        this.extensions = map;
        this.nonStandardFields = map2;
    }

    public final Map<String, Object> getExtensions() {
        return this.extensions;
    }

    public final List<Location> getLocations() {
        return this.locations;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Map<String, Object> getNonStandardFields() {
        return this.nonStandardFields;
    }

    public final List<Object> getPath() {
        return this.path;
    }

    public String toString() {
        return "Error(message = " + this.message + ", locations = " + this.locations + ", path=" + this.path + ", extensions = " + this.extensions + ", nonStandardFields = " + this.nonStandardFields + ')';
    }
}
