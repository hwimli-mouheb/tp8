import java.awt.event.*;
import java.awt.*;
import java.io.*;
class MyActionListenerForOpen implements ActionListener
{
MyFrameAWT f;
public MyActionListenerForOpen(MyFrameAWT f)
{
this.f=f;
}
public void actionPerformed(ActionEvent e)
{
System.out.println("Bouton Open actionné");
FileDialog fd = new FileDialog(f);

fd.setVisible(true);
String nomFichier = fd.getFile();
String repFichier = fd.getDirectory();
String nomComplet = repFichier + nomFichier;
System.out.println("Nom Fichier : " + nomFichier);
System.out.println("Répertoire Fichier : " + repFichier);
System.out.println("Nom complet du Fichier : " +nomComplet);
File file = new File(nomComplet);
int size;
size = (int) file.length();
System.out.println("Taille du Fichier : " + size);
try
{
    FileInputStream in = new FileInputStream(file);
    byte data[] = new byte[size];
in.read(data);

String s = new String(data);
f.ta.setText(s);

  }catch(FileNotFoundException e2){System.out.println(e2);}
  catch(IOException e3){System.out.println(e3);}
}
}