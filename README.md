---
title: RMI Chat  
author: vhulot  
date: 2021-02
---

# RMI Chat

Socket programming with Java RMI.

Features :

- Implement a chat over RMI.
- tp.rmi.common contains interfaces
- tp.rmi.client contains client
- tp.rmi.serveur contains server

Exercise for University.

## Instructions

1. Execute registry script  
   (*.sh for Linux & *.bat for windows)
2. Start ChatServeur.java. Object should register successfully.
````shell
ChatRemoteImpl[UnicastServerRef [liveRef: [endpoint:[192.168.1.31:63266](local),objID:[-1d2bf11d:177921b1193:-7fff, -7620124741303965567]]]] has been registered
````
3. Start ChatClient.java. Client is sending a msg.
```
jean-michel>coucou
```
