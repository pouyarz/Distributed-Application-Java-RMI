# Distributed-Application-Java-RMI
Distributed program for adding 2-dimensional matrices using Java RMI, which adds two matrices of size N×N using three computers
(three concurrently run processes). The matrices (A and B) could be filled by randomly generated numbers in the initiating process and then divided to 3 portions and sent to the 3 computers for calculation (one could be the same computer that hosts the initiating process). The final result should be displayed by the initiating process. Also, N could vary and should be read as an input to the system.

# How to Run
Open a command prompt (for server)/n
Compile: javac *.java
Starting RMI: start rmiregistry
Adding Server: java AddServer
Open a command prompt (for client)
Adding Client: java AddClient 127.0.0.1.6
Entr Dimension of Matrix
