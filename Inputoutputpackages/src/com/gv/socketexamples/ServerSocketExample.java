package com.gv.socketexamples;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class ServerSocketExample {
    public static void main(String[] args) {
        int port = 9090;
        try (ServerSocketChannel server = ServerSocketChannel.open()) {
            server.bind(new InetSocketAddress(port));
            System.out.println("Server started at: " + port);

            while (true) {
                try (SocketChannel client = server.accept()) {
                    System.out.println("Client connected: " + client.getRemoteAddress());
                    ByteBuffer buffer = ByteBuffer.allocate(1024);
                    int bytesRead = client.read(buffer);
                    if (bytesRead != -1) {
                        buffer.flip();
                        byte[] byteArray = new byte[buffer.remaining()];
                        buffer.get(byteArray);
                        try (ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
                             ObjectInputStream ois = new ObjectInputStream(bais)) {

                            Book book = (Book) ois.readObject();
                            System.out.println(book);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
