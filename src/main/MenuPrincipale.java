/**
 * Exercice JDBC :
 * <p>
 * Ecrire un programme divis� en plusieurs fichiers et dossiers.
 * <p>
 * Un dossier dao pour la partie de code accedant � la BDD.
 * Un dossier modele pour les objets utilis�s sous forme de JavaBean.
 * Un dossier main pour le programme principal g�rant les menus.
 * Vous pouvez creer d'autres dossiers si vous le juger necessaire.
 * <p>
 * Cr�er des fichiers differents selon les besoin,
 * et importer les dans les autres fichiers si n�cessaire.
 * <p>
 * Description :
 * <p>
 * Cre�r la base de donn�es MySQL si elle n'existe pas. Nomm�e la comme vous le souhait�.
 * Connectez-vous � la BDD et cr�er les tables de la BDD si elles n'existent pas.
 * Ces tables sont : Utilisateurs, Clients, Fournisseurs et Articles.
 * <p>
 * La table Utilisateurs correpond aux utilisateurs du programme dans une entreprise.
 * Les Utilisateurs ont un id, un numero d'employ� unique, un nom, un prenom, un email,
 * un login et un mot de passe.
 * <p>
 * La table Clients contiendra les clients de l'entreprise. Ils ont un id, un num�ro unique,
 * un nom, un pr�nom, un email et une adresse.
 * <p>
 * La table Fournisseurs correspond aux fournisseurs de l'entreprise.
 * Ils ont un id, un num�ro unique, un nom, un email et une adresse.
 * <p>
 * La table Article correspond aux articles achet�s aux fournisseurs et vendu aux clients.
 * Ils ont un id, un numero unique, un champ indiquant si c'est un article achet� ou vendu, un nom, une description.
 * <p>
 * les op�rations � faire sur les toutes tables de la BDD et � decrire dans les menus sont :
 * la lectures complete.
 * la lecture d'un enregistrement selon l'id.
 * l'ecriture.
 * la modification.
 * la suppression.
 * <p>
 * Pour les menus, faites un premier menu pour choisir la table sur laquelle on veut faire une op�ration.
 * Puis un sous-menu corresondant aux diff�rentes op�rations.
 * <p>
 * Faites-les controles necesaires sur les op�rations pour eviter les incoh�rences et les erreur SQL.
 * <p>
 * Tous les champs de toutes les tables sont obligatoires.
 * <p>
 * Faire les javadoc pour toutes les m�thodes et classes.
 */

package main;

public class MenuPrincipale {
    private static final String DB_URL = "jdbc:mysql://localhost:3306?useSSL=false";
    private static final String DB_NAME = "Entreprise";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static void main(String[] args) {
    }


}
