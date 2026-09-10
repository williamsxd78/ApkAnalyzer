package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import javax.annotation.Nullable;

/* loaded from: classes10.dex */
class Reflection {

    /* loaded from: classes10.dex */
    static final class Android24 extends Reflection {
        @Override // retrofit2.Reflection
        Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) throws Throwable {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    /* loaded from: classes10.dex */
    static class Java8 extends Reflection {
        @Override // retrofit2.Reflection
        String describeMethodParameter(Method method, int i) {
            Parameter parameter = method.getParameters()[i];
            if (!parameter.isNamePresent()) {
                return super.describeMethodParameter(method, i);
            }
            return "parameter '" + parameter.getName() + '\'';
        }

        @Override // retrofit2.Reflection
        Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) throws Throwable {
            return DefaultMethodSupport.invoke(method, cls, obj, objArr);
        }

        @Override // retrofit2.Reflection
        boolean isDefaultMethod(Method method) {
            return method.isDefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String describeMethodParameter(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object[] objArr) throws Throwable {
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isDefaultMethod(Method method) {
        return false;
    }
}
