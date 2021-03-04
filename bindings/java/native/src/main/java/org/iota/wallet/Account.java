// Automatically generated by flapigen
package org.iota.wallet;


public final class Account {

    private Account() {}

    public final Message transfer(Transfer transfer) {
        long a0 = transfer.mNativeObj;
        transfer.mNativeObj = 0;

        long ret = do_transfer(mNativeObj, a0);
        Message convRet = new Message(InternalPointerMarker.RAW_PTR, ret);

        JNIReachabilityFence.reachabilityFence1(transfer);

        return convRet;
    }
    private static native long do_transfer(long self, long transfer);

    public final Address generate_address() {
        long ret = do_generate_address(mNativeObj);
        Address convRet = new Address(InternalPointerMarker.RAW_PTR, ret);

        return convRet;
    }
    private static native long do_generate_address(long self);

    public final Address get_unused_address() {
        long ret = do_get_unused_address(mNativeObj);
        Address convRet = new Address(InternalPointerMarker.RAW_PTR, ret);

        return convRet;
    }
    private static native long do_get_unused_address(long self);

    public final boolean is_latest_address_unused() {
        boolean ret = do_is_latest_address_unused(mNativeObj);

        return ret;
    }
    private static native boolean do_is_latest_address_unused(long self);

    public final Address latest_address() {
        long ret = do_latest_address(mNativeObj);
        Address convRet = new Address(InternalPointerMarker.RAW_PTR, ret);

        return convRet;
    }
    private static native long do_latest_address(long self);

    public final void set_alias(String alias) {
        do_set_alias(mNativeObj, alias);
    }
    private static native void do_set_alias(long self, String alias);

    public final void set_client_options(ClientOptions options) {
        long a0 = options.mNativeObj;
        options.mNativeObj = 0;

        do_set_client_options(mNativeObj, a0);

        JNIReachabilityFence.reachabilityFence1(options);
    }
    private static native void do_set_client_options(long self, long options);

    public final Message [] list_messages(long count, long from, MessageType message_type) {
        int a2 = (message_type != null) ? message_type.getValue() : -1;

        Message [] ret = do_list_messages(mNativeObj, count, from, a2);

        JNIReachabilityFence.reachabilityFence1(message_type);

        return ret;
    }
    private static native Message [] do_list_messages(long self, long count, long from, int message_type);

    public final Address [] list_spent_addresses() {
        Address [] ret = do_list_spent_addresses(mNativeObj);

        return ret;
    }
    private static native Address [] do_list_spent_addresses(long self);

    public final Address [] list_unspent_addresses() {
        Address [] ret = do_list_unspent_addresses(mNativeObj);

        return ret;
    }
    private static native Address [] do_list_unspent_addresses(long self);

    public final java.util.Optional<Message> get_message(MessageId message_id) {
        long a0 = message_id.mNativeObj;
        message_id.mNativeObj = 0;

        long ret = do_get_message(mNativeObj, a0);
        java.util.Optional<Message> convRet;
        if (ret != 0) {
            convRet = java.util.Optional.of(new Message(InternalPointerMarker.RAW_PTR, ret));
        } else {
            convRet = java.util.Optional.empty();
        }

        JNIReachabilityFence.reachabilityFence1(message_id);

        return convRet;
    }
    private static native long do_get_message(long self, long message_id);

    public final String alias() {
        String ret = do_alias(mNativeObj);

        return ret;
    }
    private static native String do_alias(long self);

    public final AccountBalance balance() {
        long ret = do_balance(mNativeObj);
        AccountBalance convRet = new AccountBalance(InternalPointerMarker.RAW_PTR, ret);

        return convRet;
    }
    private static native long do_balance(long self);

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
    /*package*/ Account(InternalPointerMarker marker, long ptr) {
        assert marker == InternalPointerMarker.RAW_PTR;
        this.mNativeObj = ptr;
    }
    /*package*/ long mNativeObj;
}