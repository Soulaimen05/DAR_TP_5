package rmiServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import rmiService.ConversionImpl;

public class ConversionServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);

            ConversionImpl conversion = new ConversionImpl();

            registry.rebind("ConversionService", conversion);

            System.out.println("Serveur RMI prêt : ConversionService publié sur le port 1099.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}