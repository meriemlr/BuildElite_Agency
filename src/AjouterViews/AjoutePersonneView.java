package AjouterViews;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.border.LineBorder;

import Models.PersonneModel;
import Principale.Home;

public class AjoutePersonneView implements ActionListener {
	JPanel p;
	JLabel cin,nom,prenom,sex,adress,telephone,email,photo,commentaire,photoLabel;
	JTextField cinC,nomC,prenomC,adressC,telephoneC,photoC,emailC;
	ButtonGroup sexC;
	JRadioButton homme,femme;
	JButton parcourir,enregistrer,annuler;
	JTextField agec;
	JTextArea commentaireC;
	JOptionPane opt;
	Home parent;
	Color lightColor=new Color(217, 235,217);
	Color darkColor=new Color(39, 38, 64);
	
	public AjoutePersonneView(Home pr) {
		super();
		parent = pr;
	}

	public JPanel getPanel() {
		p=new JPanel();
		p.setLayout(null);
		p.setMinimumSize(new Dimension(768,700));
		p.setBackground(lightColor);
		cin = new JLabel("CIN"); 
		cin.setBounds(45, 237, 100, 20);
		cin.setForeground(darkColor);
		p.add(cin);
		cinC=new JTextField();
		cinC.setForeground(darkColor);
		cinC.setBorder(new LineBorder(darkColor, 1, true));
		cinC.setBackground(lightColor);
		cinC.setBounds(80, 235, 300, 30);
		p.add(cinC);
		
		
		nom = new JLabel("NOM"); 
		nom.setBounds(400, 237, 100, 20);
		nom.setForeground(darkColor);
		p.add(nom);
		nomC=new JTextField();
		nomC.setForeground(darkColor);
		nomC.setBorder(new LineBorder(darkColor, 1, true));
		nomC.setBackground(lightColor);
		nomC.setBounds(440, 235, 300, 30);
		p.add(nomC);
		
		
		prenom = new JLabel("PRENOM"); 
		prenom.setBounds(16, 295, 100, 20);
		prenom.setForeground(darkColor);
		p.add(prenom);
		prenomC=new JTextField();
		prenomC.setForeground(darkColor);
		prenomC.setBorder(new LineBorder(darkColor, 1, true));
		prenomC.setBackground(lightColor);
		prenomC.setBounds(80, 291, 300, 30);
		p.add(prenomC);
		
		sex = new JLabel("SEX"); 
		sex.setBounds(45, 411, 100, 20);
		sex.setForeground(darkColor);
		p.add(sex);
		sexC = new ButtonGroup();
		homme = new JRadioButton("Homme", false);
		homme.setBackground(lightColor);
		homme.setBounds(90, 406, 100, 30);
		p.add(homme);
		femme = new JRadioButton("Femme", false);
		femme.setBackground(lightColor);
		femme.setBounds(190, 406, 100, 30);
		p.add(femme);
		sexC.add(homme);sexC.add(femme);
		
		
		commentaire = new JLabel("COMMENT"); 
		commentaire.setBounds(7, 469, 100, 20);
		commentaire.setForeground(darkColor);
		p.add(commentaire);
		commentaireC=new JTextArea();
		commentaireC.setBorder(new LineBorder(darkColor, 1, true));
		commentaireC.setForeground(darkColor);
		commentaireC.setBackground(lightColor);
		commentaireC.setBounds(80, 469, 660, 100);
		p.add(commentaireC);
		
		
		adress = new JLabel("ADRESS"); 
		adress.setBounds(384, 295, 100, 20);
		adress.setForeground(darkColor);
		p.add(adress);
		adressC=new JTextField();
		adressC.setForeground(darkColor);
		adressC.setBorder(new LineBorder(darkColor, 1, true));
		adressC.setBackground(lightColor);
		adressC.setBounds(440, 291, 300, 30);
		p.add(adressC);
		
		
		email = new JLabel("EMAIL"); 
		email.setBounds(396, 348, 100, 20);
		email.setForeground(darkColor);
		p.add(email);
		emailC=new JTextField();
		emailC.setForeground(darkColor);
		emailC.setBorder(new LineBorder(darkColor, 1, true));
		emailC.setBackground(lightColor);
		emailC.setBounds(440, 348, 300, 30);
		p.add(emailC);
		
		JLabel age = new JLabel("AGE"); 
		age.setBounds(406, 406, 100, 20);
		age.setForeground(darkColor);
		p.add(age);
		
		agec=new JTextField();
		agec.setForeground(darkColor);
		agec.setBackground(lightColor);
		agec.setBorder(new LineBorder(darkColor, 1, true));
		agec.setBounds(440, 406,300, 30);
		p.add(agec);
		
		telephone = new JLabel("TELEPHONE"); 
		telephone.setBounds(0, 348, 100, 20);
		telephone.setForeground(darkColor);
		p.add(telephone);
		telephoneC=new JTextField();
		telephoneC.setForeground(darkColor);
		telephoneC.setBackground(lightColor);
		telephoneC.setBorder(new LineBorder(darkColor, 1, true));
		telephoneC.setBounds(80, 348, 300, 30);
		p.add(telephoneC);
		

		photoLabel = new JLabel(); 
		photoLabel.setBounds(510, 50, 150, 150);
		photoLabel.setHorizontalAlignment(JLabel.CENTER);
		photoLabel.setOpaque(true);
		photoLabel.setBackground(darkColor);
		p.add(photoLabel);
		
		photo = new JLabel("PHOTO"); 
		photo.setBounds(28, 107, 100, 20);
		photo.setForeground(darkColor);
		p.add(photo);
		photoC=new JTextField();
		photoC.setForeground(darkColor);
		photoC.setBackground(lightColor);
		photoC.setBounds(80, 107, 200, 30);
		photoC.setBorder(new LineBorder(darkColor, 1, true));
		p.add(photoC);
		
		parcourir = new JButton("parcourir");   
		parcourir.setBounds(280, 107, 100, 30); 
		parcourir.setForeground(new Color(255, 255, 255));
		parcourir.setBackground(darkColor);
		parcourir.addActionListener(this);
		p.add(parcourir);
		


		enregistrer = new JButton("Enregistrer");   
		enregistrer.setBounds(200, 615, 180, 26);
		enregistrer.setFont(new Font("Arial", 1, 15));
		enregistrer.setForeground(new Color(255, 255, 255));
		enregistrer.setBackground(darkColor);
		enregistrer.addActionListener(this);
		p.add(enregistrer);
		
		annuler = new JButton("Annuler");   
		annuler.setBounds(400, 615, 180, 26);
		annuler.setFont(new Font("Arial", 1, 15));
		annuler.setForeground(new Color(255, 255, 255));
		annuler.setBackground(darkColor);
		annuler.addActionListener(this);
		p.add(annuler);
		
		return p;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o.equals(parcourir)) {
			JFileChooser fch=new JFileChooser();
			fch.setDialogTitle("Open image");
	        if(fch.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
	            File fi=fch.getSelectedFile();
	            photoC.setText(fi.getPath());
	            photoLabel.setIcon(parent.ResizeImage(fi.getPath(),photoLabel));
	        }
		}
		else if(o.equals(enregistrer)) {
			if(cinC.getText().isEmpty()||nomC.getText().isEmpty()||agec.getText().isEmpty()||prenomC.getText().isEmpty()||adressC.getText().isEmpty()||telephoneC.getText().isEmpty()||photoC.getText().isEmpty()||emailC.getText().isEmpty()||(homme.isSelected()==false&&femme.isSelected()==false))
				opt.showMessageDialog(p, "Il faut remplir tout les champs Obligatoires ! ","Champ Obligatoire vide Erreur", 0);
			else {
				PersonneModel per=new PersonneModel(parent);
				per.setCin(cinC.getText());
				per.setNom(nomC.getText());
				per.setPrenom(prenomC.getText());
				per.setEmail(emailC.getText());
				per.setSex((homme.isSelected()==true)?"Homme":"Femme");
				per.setAdress(adressC.getText());
				per.setAge(Integer.valueOf(agec.getText()));
				per.setTelephone(telephoneC.getText());
				per.setCommentaire(commentaireC.getText());
				per.setPhotoPath(photoC.getText());
				parent.database.addPersonn(per);
				cinC.setText("");
				nomC.setText("");
				prenomC.setText("");
				adressC.setText("");
				telephoneC.setText("");
				photoC.setText("");
				emailC.setText("");
				agec.setText("");
				commentaireC.setText("");
			}
		}
		else if(o.equals(annuler)) {
			cinC.setText("");
			nomC.setText("");
			prenomC.setText("");
			adressC.setText("");
			telephoneC.setText("");
			photoC.setText("");
			emailC.setText("");
			agec.setText("");
			commentaireC.setText("");
		}
	}
	
	
}