// Automatically generated by flapigen
package org.iota.wallet;


public final class Address {
    @Override
    public String toString() {
        return this.to_string();
    }

    public boolean equals(Object obj) {
        boolean equal = false;
        if (obj instanceof Address)
        equal = ((Address)obj).rustEq(this);
        return equal;
    }

    public int hashCode() {
        return (int)mNativeObj;
    }


    private Address() {}

    private final boolean rustEq(Address o) {
        long a0 = o.mNativeObj;
        boolean ret = do_rustEq(mNativeObj, a0);

        JNIReachabilityFence.reachabilityFence1(o);

        return ret;
    }
    private static native boolean do_rustEq(long self, long o);

    private final String to_string() {
        String ret = do_to_string(mNativeObj);

        return ret;
    }
    private static native String do_to_string(long self);

    public final long getBalance() {
        long ret = do_getBalance(mNativeObj);

        return ret;
    }
    private static native long do_getBalance(long self);

    public final String getReadable() {
        String ret = do_getReadable(mNativeObj);

        return ret;
    }
    private static native String do_getReadable(long self);

    public final AddressWrapper address() {
        long ret = do_address(mNativeObj);
        AddressWrapper convRet = new AddressWrapper(InternalPointerMarker.RAW_PTR, ret);

        return convRet;
    }
    private static native long do_address(long self);

    public synchronized void delete() {
        if (mNativeObj != 0) {
            do_delete(mNativeObj);
            mNativeObj = 0;
       }
    }
    @Override
    protected void finalize() throws Throwable {
        try {
            delete();
        }
        finally {
             super.finalize();
        }
    }
    private static native void do_delete(long me);
    /*package*/ Address(InternalPointerMarker marker, long ptr) {
        assert marker == InternalPointerMarker.RAW_PTR;
        this.mNativeObj = ptr;
    }
    /*package*/ long mNativeObj;
}