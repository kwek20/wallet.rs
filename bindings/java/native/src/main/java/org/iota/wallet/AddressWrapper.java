// Automatically generated by flapigen
package org.iota.wallet;


public final class AddressWrapper {

    private AddressWrapper() {}

    public final String toBech32() {
        String ret = do_toBech32(mNativeObj);

        return ret;
    }
    private static native String do_toBech32(long self);

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
    /*package*/ AddressWrapper(InternalPointerMarker marker, long ptr) {
        assert marker == InternalPointerMarker.RAW_PTR;
        this.mNativeObj = ptr;
    }
    /*package*/ long mNativeObj;
}