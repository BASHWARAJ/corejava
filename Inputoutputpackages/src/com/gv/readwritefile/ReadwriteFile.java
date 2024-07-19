package com.gv.readwritefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadwriteFile {
	public static void main(String[] args) throws IOException {
		try(
				FileInputStream fis = 	new FileInputStream("nio.txt");
				FileChannel channel =  fis.getChannel();
				){
			ByteBuffer bytebuffer = ByteBuffer.allocate(100);
			bytebuffer.put((byte)65);
					channel.write(bytebuffer);
		}
		
		try(
			FileInputStream fis = 	new FileInputStream("nio.txt");
			FileChannel channel =  fis.getChannel();)
		{ByteBuffer buffer = ByteBuffer.allocate(1024);
		int charVal=channel.read(buffer);
		while(charVal!=1) {
			System.out.println((char)buffer.getChar());
			buffer.flip();
			
			System.out.println(charVal);
			charVal=channel.read(buffer);
			}
		
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
				
				
	}
}
