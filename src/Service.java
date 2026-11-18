import java.util.Random;

public class Service implements Runnable{

    private final String nom;

    public Service(String nom) {
        this.nom = nom;
    }

    public void traitement() {
        System.out.println("Bonjour, je suis le processus " + nom);

        Random random = new Random();
        int duree = 250 + random.nextInt(2000 - 250 + 1);
        System.out.println("Mon traitement prendra " + duree + " millisecondes");
        try {
            Thread.sleep(duree);
        } catch (Exception e) {
            System.out.println("Le processus " + nom + " a été interrompu");
            return;
        }
        System.out.println("Ici le processus "+ nom + ", j’ai finis de travailler");
    }

    @Override
    public void run() {
        this.traitement();
    }
}