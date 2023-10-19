package me.marquez.socketplugin;

import me.marquez.socket.SocketManager;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.plugin.java.JavaPlugin;

public class SocketCommunicatorPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        SocketManager.initialize();
        getServer().getConsoleSender().sendMessage(Component
                .text("The socket-communicator-api has been initialized!")
                .color(NamedTextColor.GREEN)
        );
    }

}
