package com.vivaaerobus.app.analytics.presentation.annotations.firebase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: ProfileActionsType.kt */
@Target({ElementType.METHOD, ElementType.PARAMETER})
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/firebase/ProfileActionsType;", "", "Companion", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes3.dex */
public @interface ProfileActionsType {
    public static final String ADD_COMPANIONS = "Agregar_Acompaniantes_Viaje";
    public static final String ADD_DOCUMENTS = "Agregar_Documentos";
    public static final String ADD_KNOW_TRAVELER_NUMBER = "click_añadir_KNN";
    public static final String ADD_PAYMENT_METHODS = "Agregar_Metodos_Pago";
    public static final String ADD_REDRESS_NUMBER = "click_añadir_redress_number";
    public static final String CHANGE_PASSWORD = "Recuperar_Contrasenia";
    public static final String CONFIRM_SAVE = "Confirmar_Guardar";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String DOTERS = "doters_profile";
    public static final String EDIT_MY_PROFILE = "Edit_Mi_profile";
    public static final String ENTER_CARD_DATA_MANUAL = "Ingresar Manualmente";
    public static final String ENTER_PASSPORT_DATA_MANUAL = "Ingresar_Datos_Manual";
    public static final String FACE_ID = "face_id";
    public static final String LOG_OUT = "Cerrar_Sesión";
    public static final String PERSONAL_DATA = "Datos_Personales";
    public static final String SAVE_CHANGES = "Guardar_Cambios";
    public static final String SCAN_PASSPORT = "Escanea_Pasaporte";
    public static final String USE_CARD = "Utilizar_Tarjeta";
    public static final String VIVA_CASH = "Viva_Cash";

    /* compiled from: ProfileActionsType.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/vivaaerobus/app/analytics/presentation/annotations/firebase/ProfileActionsType$Companion;", "", "<init>", "()V", "ADD_DOCUMENTS", "", "ADD_COMPANIONS", "FACE_ID", "ADD_PAYMENT_METHODS", "LOG_OUT", "CHANGE_PASSWORD", "PERSONAL_DATA", "VIVA_CASH", "EDIT_MY_PROFILE", "SCAN_PASSPORT", "ENTER_PASSPORT_DATA_MANUAL", "CONFIRM_SAVE", "SAVE_CHANGES", "ADD_KNOW_TRAVELER_NUMBER", "ADD_REDRESS_NUMBER", "ENTER_CARD_DATA_MANUAL", "USE_CARD", "DOTERS", "analytics_productionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String ADD_COMPANIONS = "Agregar_Acompaniantes_Viaje";
        public static final String ADD_DOCUMENTS = "Agregar_Documentos";
        public static final String ADD_KNOW_TRAVELER_NUMBER = "click_añadir_KNN";
        public static final String ADD_PAYMENT_METHODS = "Agregar_Metodos_Pago";
        public static final String ADD_REDRESS_NUMBER = "click_añadir_redress_number";
        public static final String CHANGE_PASSWORD = "Recuperar_Contrasenia";
        public static final String CONFIRM_SAVE = "Confirmar_Guardar";
        public static final String DOTERS = "doters_profile";
        public static final String EDIT_MY_PROFILE = "Edit_Mi_profile";
        public static final String ENTER_CARD_DATA_MANUAL = "Ingresar Manualmente";
        public static final String ENTER_PASSPORT_DATA_MANUAL = "Ingresar_Datos_Manual";
        public static final String FACE_ID = "face_id";
        public static final String LOG_OUT = "Cerrar_Sesión";
        public static final String PERSONAL_DATA = "Datos_Personales";
        public static final String SAVE_CHANGES = "Guardar_Cambios";
        public static final String SCAN_PASSPORT = "Escanea_Pasaporte";
        public static final String USE_CARD = "Utilizar_Tarjeta";
        public static final String VIVA_CASH = "Viva_Cash";

        private Companion() {
        }
    }
}
