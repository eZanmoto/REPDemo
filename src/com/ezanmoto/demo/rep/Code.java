package com.ezanmoto.demo.rep;

import com.ezanmoto.rep.REPException;
import com.ezanmoto.rep.client.REPClient;
import com.ezanmoto.rep.client.StandardREPClient;

import java.io.File;

public class Code {

    private static final File TEST_DIR = new File( "tmp" );

    public static void main( String[] args ) {
        final File callable = new File( TEST_DIR, "TestClass.java" );
        REPClient client = StandardREPClient.newInstance();
        final String host = args.length > 0 ? args[ 0 ] : "localhost";
        final Object result = client.callWithHost( callable, host );
        System.out.println( result );
    }
}
