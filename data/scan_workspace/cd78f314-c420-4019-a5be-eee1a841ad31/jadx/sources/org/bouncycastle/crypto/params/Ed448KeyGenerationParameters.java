package org.bouncycastle.crypto.params;

import com.airbnb.paris.R2;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

/* loaded from: classes9.dex */
public class Ed448KeyGenerationParameters extends KeyGenerationParameters {
    public Ed448KeyGenerationParameters(SecureRandom secureRandom) {
        super(secureRandom, R2.dimen.abc_search_view_preferred_height);
    }
}
