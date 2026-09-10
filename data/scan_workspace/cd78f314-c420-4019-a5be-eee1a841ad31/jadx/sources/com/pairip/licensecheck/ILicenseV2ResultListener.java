package com.pairip.licensecheck;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public interface ILicenseV2ResultListener extends IInterface {
    public static final String DESCRIPTOR = "com.android.vending.licensing.ILicenseV2ResultListener";

    /* loaded from: classes2.dex */
    public static abstract class Stub extends Binder implements ILicenseV2ResultListener {
        static final int TRANSACTION_VERIFY_LICENSE = 1;

        public Stub() {
            attachInterface(this, ILicenseV2ResultListener.DESCRIPTOR);
        }

        private static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(ILicenseV2ResultListener.DESCRIPTOR);
            }
            if (i == 1) {
                verifyLicense(parcel.readInt(), (Bundle) readTypedObject(parcel, Bundle.CREATOR));
            } else {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString(ILicenseV2ResultListener.DESCRIPTOR);
            }
            return true;
        }
    }

    void verifyLicense(int i, Bundle bundle) throws RemoteException;
}
