// $Id$
package indi.wangx.java.noi;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

import org.junit.Test;

public class CreateArrayBuffer
{
  static public void main( String args[] ) throws Exception {
    byte array[] = new byte[1024];

    ByteBuffer buffer = ByteBuffer.wrap( array );

    buffer.put( (byte)'a' );
    buffer.put( (byte)'b' );
    buffer.put( (byte)'c' );

    buffer.flip();

    System.out.println( (char)buffer.get() );
    System.out.println( (char)buffer.get() );
    System.out.println( (char)buffer.get() );
  }
  
  @Test
  public void test() {
	  int a = 1;
  }
  
}
