package affichage;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class AfficherFichier extends JFrame {
	private static final long serialVersionUID = 1L;
		private JTextArea text;
	 
	    public AfficherFichier()
	    {
	        // INIT
	        super("Fichier Disque :");
	        setBounds(100, 200, 302, 150);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         
	        // CREE UN TEXTE CONTENANT UN TEXTE
	        text = new JTextArea("test de text");
	         
	        // AJOUT TEXTE DANS LA FENETRE
	        add(text,BorderLayout.CENTER);
	         
	        // AFFICHE
	        setVisible(true);
	    }
	     
	    public static void main( String [] args )
	    {
	        new AfficherFichier();
	    }
	}