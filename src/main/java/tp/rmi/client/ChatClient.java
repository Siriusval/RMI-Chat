package tp.rmi.client;

import tp.rmi.common.ChatRemote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ChatClient {

    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        ChatRemote chatRemote = (ChatRemote) Naming.lookup("//localhost/chat");
        System.out.println(chatRemote.echo("jean-michel","coucou"));

        //Register afficheur for server
        Afficheur afficheur = new Afficheur();
        chatRemote.registerCallback(afficheur);
        System.out.println(afficheur + " has been registered");

        //Ask name
        Scanner sc = new Scanner(System.in);
        System.out.println("Connected");
        System.out.println("\tWhat is your name ?");
        String name = sc.nextLine();
        System.out.printf("Hello %s, you can now send messages.%n",name);

        //Send msg
        String msg;
        while(true){
            System.out.print(">");
            msg = sc.nextLine();
            chatRemote.send(name,msg);
        }

        /*
         Registry registry = LocateRegistry.getRegistry("localhost", Registry.REGISTRY_PORT);
        System.out.println(registry);
        DateRemote date = (DateRemote) registry.lookup("date");
        System.out.println(date.getServerDate());
        System.out.println(date.getCalls());
         */
    }
}
