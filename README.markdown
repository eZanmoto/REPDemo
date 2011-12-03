RemoteExecutionPlatform Demo
============================

Contents
--------

1.  Running the Server
2.  Running the Demo Client with a Local REP Server
3.  Running the Demo Client on a Remote REP Server

### Running the Server

To run the `StandardREPServer`, you need to have the `REPServer.jar` archive.
This is located in the `RemoteExecutionPlatform/build/jar` directory, and
can be generated from the `RemoteExecutionPlatform` directory using

    ant jar-server

if it doesn't already exist. To run the server, place the server anywhere on
the machine that is going to be running it. Start the server using

    java -cp $JAVA_HOME/lib/tools.jar:./REPServer.jar \
        com.ezanmoto.rep.server.StandardREPServer

(Replace `$JAVA_HOME` with `%JAVA_HOME%` if running this on a Windows machine)

### Running the Demo Client with a Local REP Server

To run the demo client using ANT, go to the REPDemo directory and execute

    ant

which will run the code in `REPDemo/tmp/TestClass.java` on the local REP
Server. This can also be acheived by executing the following command while
in the `REPDemo` directory

    java -cp build/classes:lib/REPClient.jar com.ezanmoto.demo.rep.Code

### Running the Demo Client on a Remote REP Server

To run the demo client on a Remote REP Server, first make sure that the REP
Server is running on the remote machine, and then run the following command
while in the `REPDemo` directory

    java -cp build/classes:lib/REPClient.jar com.ezanmoto.demo.rep.Code \
        <remote-addr>

This will run the code in `REPDemo/tmp/TestClass.java` on the remote machine,
return the result to the localhost and output the result on the client's
console.
