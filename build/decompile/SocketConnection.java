/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package CreationalDesignPattern;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 5, 1}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0004\u00a8\u0006\u0006"}, d2={"LCreationalDesignPattern/SocketConnection;", "", "()V", "connect", "", "disconnect", "DesignPattern1"})
public final class SocketConnection {
    @NotNull
    public static final SocketConnection INSTANCE = new SocketConnection();

    private SocketConnection() {
    }

    public final void connect() {
        String string = "Connected";
        boolean bl = false;
        System.out.println((Object)string);
    }

    public final void disconnect() {
        String string = "Disconnect";
        boolean bl = false;
        System.out.println((Object)string);
    }
}
