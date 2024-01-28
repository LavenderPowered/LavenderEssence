package dev.andus.bastom.commands;

import net.minestom.server.permission.Permission;

public class Permissions {
    // Microstom
    public static final Permission SHUTDOWN = new Permission("bastom.shutdown");
    public static final Permission RESTART = new Permission("bastom.restart");
    // Bastom
    public static final Permission EXTENSIONS = new Permission("bastom.exts");
    public static final Permission SERVER_INFO = new Permission("bastom.svinfo");
}
