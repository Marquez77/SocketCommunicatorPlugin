package me.marquez.socketplugin;

import com.google.inject.Inject;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.ProxyServer;
import me.marquez.socket.SocketManager;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.slf4j.Logger;

import java.io.IOException;
import java.nio.file.Path;

@Plugin(id = "socketcommunicator", name = "Socket Communicator for Velocity", version = "1.0.0",
        url = "https://marsys.kr", description = "It is plugin to use socket communication api", authors = {"DevMarquez"})
public class SocketCommunicatorPlugin {
    @Inject
    public SocketCommunicatorPlugin(ProxyServer proxy, Logger logger, @DataDirectory Path dataDirectory) throws IOException {
        SocketManager.initialize();
        proxy.sendMessage(Component.text("The socket-communicator-api has been initialized!").color(NamedTextColor.GREEN));
    }
}
