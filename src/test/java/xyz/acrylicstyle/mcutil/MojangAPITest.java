package xyz.acrylicstyle.mcutil;

import org.junit.Test;
import util.promise.UnhandledPromiseException;
import xyz.acrylicstyle.mcutil.mojang.MojangAPI;

import java.util.UUID;

public class MojangAPITest {
    public static final UUID uuid1 = UUID.fromString("1865ab8c-700b-478b-9b52-a8c58739df1a");
    public static final UUID nil = UUID.fromString("00000000-0000-0000-0000-000000000000");

    @Test(timeout = 3000)
    public void getGameProfile() {
        MojangAPI.getGameProfile(uuid1).complete();
    }

    @Test(timeout = 3000, expected = UnhandledPromiseException.class)
    public void xGetGameProfile() {
        MojangAPI.getGameProfile(nil).complete();
    }

    @Test(timeout = 3000)
    public void getNameChanges() {
        MojangAPI.getNameChanges(uuid1).complete();
    }

    @Test(timeout = 3000, expected = UnhandledPromiseException.class)
    public void xGetNameChanges() {
        MojangAPI.getNameChanges(nil).complete();
    }

    @Test(timeout = 3000)
    public void getPlayerProfile() {
        MojangAPI.getPlayerProfile("MHF_Cake").complete();
    }

    @Test(timeout = 3000, expected = UnhandledPromiseException.class)
    public void xGetPlayerProfile() {
        // this name is permanently banned by Mojang so it should be safe to use it as test
        MojangAPI.getPlayerProfile("MojangSucksDick").complete();
    }

    @Test(timeout = 3000)
    public void getName() {
        MojangAPI.getName(uuid1).complete();
    }

    @Test(timeout = 3000, expected = UnhandledPromiseException.class)
    public void xGetName() {
        MojangAPI.getName(nil).complete();
    }

    @Test(timeout = 3000)
    public void getUniqueId() {
        MojangAPI.getUniqueId("MHF_TNT").complete();
    }

    @Test(timeout = 3000, expected = UnhandledPromiseException.class)
    public void xGetUniqueId() {
        MojangAPI.getUniqueId("I.Hope.This.Name.Isn't.Taken.").complete();
    }

    // #changeName cannot be tested for obvious reasons
}
