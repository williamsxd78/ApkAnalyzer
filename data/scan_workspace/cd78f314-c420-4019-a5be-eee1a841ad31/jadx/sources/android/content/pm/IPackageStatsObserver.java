package android.content.pm;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public interface IPackageStatsObserver extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IPackageStatsObserver {

        /* renamed from: Д0414Д0414Д0414Д, reason: contains not printable characters */
        private static final String f0041404140414 = "android.content.pm.IPackageStatsObserver";

        /* renamed from: ДД04140414Д0414Д, reason: contains not printable characters */
        static final int f1041404140414 = 1;

        /* renamed from: о043Eо043Eо043Eо, reason: contains not printable characters */
        public static int f2043E043E043E = 2;

        /* renamed from: о043Eооо043Eо, reason: contains not printable characters */
        public static int f3043E043E = 0;

        /* renamed from: оо043Eоо043Eо, reason: contains not printable characters */
        public static int f4043E043E = 1;

        /* renamed from: ооооо043Eо, reason: contains not printable characters */
        public static int f5043E = 37;

        /* renamed from: android.content.pm.IPackageStatsObserver$Stub$θπθθθθθ, reason: contains not printable characters */
        /* loaded from: classes.dex */
        private static class IPackageStatsObserverC0015 implements IPackageStatsObserver {

            /* renamed from: о043Eо043E043E043Eо, reason: contains not printable characters */
            public static int f6043E043E043E043E = 0;

            /* renamed from: оо043Eо043E043Eо, reason: contains not printable characters */
            public static int f7043E043E043E = 2;

            /* renamed from: ооо043E043E043Eо, reason: contains not printable characters */
            public static int f8043E043E043E = 1;

            /* renamed from: оооо043E043Eо, reason: contains not printable characters */
            public static int f9043E043E = 70;

            /* renamed from: Д041404140414Д0414Д, reason: contains not printable characters */
            private IBinder f100414041404140414;

            IPackageStatsObserverC0015(IBinder iBinder) {
                this.f100414041404140414 = iBinder;
            }

            /* renamed from: о043E043Eо043E043Eо, reason: contains not printable characters */
            public static int m6043E043E043E043E() {
                return 66;
            }

            /* renamed from: о043Eоо043E043Eо, reason: contains not printable characters */
            public static int m7043E043E043E() {
                return 1;
            }

            /* renamed from: оо043E043E043E043Eо, reason: contains not printable characters */
            public static int m8043E043E043E043E() {
                return 0;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                int i = f9043E043E;
                if ((i * (m7043E043E043E() + i)) % f7043E043E043E != 0) {
                    f9043E043E = 94;
                    f7043E043E043E = m6043E043E043E043E();
                }
                return this.f100414041404140414;
            }

            public String getInterfaceDescriptor() {
                return Stub.f0041404140414;
            }

            @Override // android.content.pm.IPackageStatsObserver
            public void onGetStatsCompleted(PackageStats packageStats, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.f0041404140414);
                    int i = 0;
                    if (packageStats != null) {
                        obtain.writeInt(1);
                        packageStats.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (z) {
                        i = 1;
                    } else {
                        int i2 = f9043E043E;
                        if (((f8043E043E043E + i2) * i2) % f7043E043E043E != m8043E043E043E043E()) {
                            f9043E043E = 61;
                            f6043E043E043E043E = m6043E043E043E043E();
                        }
                    }
                    obtain.writeInt(i);
                    IBinder iBinder = this.f100414041404140414;
                    int i3 = f9043E043E;
                    if (((f8043E043E043E + i3) * i3) % f7043E043E043E != f6043E043E043E043E) {
                        f9043E043E = m6043E043E043E043E();
                        f6043E043E043E043E = m6043E043E043E043E();
                    }
                    iBinder.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, f0041404140414);
        }

        public static IPackageStatsObserver asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            int i = f5043E;
            if (((f4043E043E + i) * i) % m3043E043E043E() != f3043E043E) {
                f5043E = m5043E043E();
                f3043E043E = 38;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f0041404140414);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IPackageStatsObserver)) ? new IPackageStatsObserverC0015(iBinder) : (IPackageStatsObserver) queryLocalInterface;
        }

        /* renamed from: о043E043E043Eо043Eо, reason: contains not printable characters */
        public static int m2043E043E043E043E() {
            return 1;
        }

        /* renamed from: о043E043Eоо043Eо, reason: contains not printable characters */
        public static int m3043E043E043E() {
            return 2;
        }

        /* renamed from: оо043E043Eо043Eо, reason: contains not printable characters */
        public static int m4043E043E043E() {
            return 0;
        }

        /* renamed from: ооо043Eо043Eо, reason: contains not printable characters */
        public static int m5043E043E() {
            return 45;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            int i = f5043E;
            if ((i * (m2043E043E043E043E() + i)) % f2043E043E043E != 0) {
                f5043E = m5043E043E();
                f3043E043E = 56;
            }
            int i2 = f5043E;
            if (((f4043E043E + i2) * i2) % m3043E043E043E() != m4043E043E043E()) {
                f5043E = m5043E043E();
                f3043E043E = 36;
            }
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                if (((m5043E043E() + m2043E043E043E043E()) * m5043E043E()) % f2043E043E043E != f3043E043E) {
                    f5043E = 25;
                    f3043E043E = 36;
                }
                parcel.enforceInterface(f0041404140414);
                onGetStatsCompleted(parcel.readInt() != 0 ? PackageStats.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                return true;
            }
            if (((m5043E043E() + f4043E043E) * m5043E043E()) % f2043E043E043E != f3043E043E) {
                f5043E = 19;
                f3043E043E = m5043E043E();
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(f0041404140414);
            return true;
        }
    }

    void onGetStatsCompleted(PackageStats packageStats, boolean z) throws RemoteException;
}
