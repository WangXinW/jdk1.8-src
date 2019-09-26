// $Id$
package indi.wangx.java.noi;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class WriteSomeBytes
{
  static private final byte message[] = { 83, 111, 109, 101, 32,
                                          98, 121, 116, 101, 115, 46 };

  public static void main( String[] args) {
    FileOutputStream fout = null;
	try {
		fout = new FileOutputStream( "writesomebytes.txt" );
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    FileChannel fc = fout.getChannel();

    ByteBuffer buffer = ByteBuffer.allocate( 1024 );

    for (int i=0; i<message.length; ++i) {
      buffer.put( message[i] );
    }

    buffer.flip();

    try {
		fc.write( buffer );
	} catch (IOException e) {
		e.printStackTrace();
	}

    try {
		fout.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
  }
}
