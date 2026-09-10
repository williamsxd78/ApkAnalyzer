package com.yuno.presentation.core.validation;

import android.content.Context;
import kotlin.Metadata;

/* compiled from: TextFieldValidators.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0003H&\u0082\u0001\u000b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/yuno/presentation/core/validation/TextFieldValidator;", "", "errorMessage", "", "context", "Landroid/content/Context;", "isAmex", "", "isValid", "text", "Lcom/yuno/presentation/core/validation/CardHolderNameValidator;", "Lcom/yuno/presentation/core/validation/CardLuhnValidator;", "Lcom/yuno/presentation/core/validation/CardNumberLengthValidator;", "Lcom/yuno/presentation/core/validation/DocumentValidator;", "Lcom/yuno/presentation/core/validation/EmailValidator;", "Lcom/yuno/presentation/core/validation/ExpirationDateValidator;", "Lcom/yuno/presentation/core/validation/FirstNameValidator;", "Lcom/yuno/presentation/core/validation/LastNameValidator;", "Lcom/yuno/presentation/core/validation/NotEmptyValidator;", "Lcom/yuno/presentation/core/validation/PhoneValidator;", "Lcom/yuno/presentation/core/validation/SecurityCodeValidator;", "Yuno_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface TextFieldValidator {

    /* compiled from: TextFieldValidators.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ String errorMessage$default(TextFieldValidator textFieldValidator, Context context, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: errorMessage");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return textFieldValidator.errorMessage(context, z);
        }
    }

    String errorMessage(Context context, boolean isAmex);

    boolean isValid(String text);
}
