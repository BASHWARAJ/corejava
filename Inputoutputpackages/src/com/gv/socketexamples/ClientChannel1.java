package com.gv.socketexamples;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class ClientChannel1 {
    public static void main(String[] args) {
        int port = 9090;
        String host = "localhost";
        try (SocketChannel client = SocketChannel.open()) {
            client.connect(new InetSocketAddress(host, port));
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);

            Book book = new Book(2, "Who Didn't Move My Cheese");
            oos.writeObject(book);
            oos.flush();

            ByteBuffer buffer = ByteBuffer.wrap(baos.toByteArray());
            client.write(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
