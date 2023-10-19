package me.marquez.socketplugin;

import me.marquez.socket.SocketManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SocketCommunicatorPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        SocketManager.initialize();
        getLogger().info("socket-communicator-api has been initialized!");
    }

}
