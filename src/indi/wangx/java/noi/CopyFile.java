// $Id$
package indi.wangx.java.noi;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class CopyFile
{
   public static void main( String args[] ) throws Exception {

    String infile = "F:\\test\\testIo.txt";
    String outfile = "F:\\test\\testIoCopy.txt";

    FileInputStream fin = new FileInputStream( infile );
    FileOutputStream fout = new FileOutputStream( outfile );

    FileChannel fcin = fin.getChannel();
    FileChannel fcout = fout.getChannel();

    ByteBuffer buffer = ByteBuffer.allocate( 1024 );
    
    int r;
    buffer.clear();
    while ( (r = fcin.read(buffer)) >= 0) {
    	buffer.flip();
    	fcout.write(buffer);
    	buffer.clear();
    }
  }
}
