package com.ezanmoto.demo.rep;

import com.ezanmoto.rep.Callable;
import com.ezanmoto.rep.RemoteFunction;
import com.ezanmoto.rep.REPException;

public class Sum {

    private static final int N = 1000;

    public static void main( String[] args ) {
        try {
            final int result = RemoteFunction.invoke( new Callable<Integer>() {
                public Integer call() {
                    int total = 0;
                    for ( int i = 1; i <= N; i++ ) {
                        System.out.println( total += i );
                    }
                    return total;
                }
            } );
        } catch ( REPException e ) {
            e.printStackTrace();
        }
    }
}
