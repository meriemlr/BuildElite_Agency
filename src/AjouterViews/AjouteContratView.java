package AjouterViews;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.LineBorder;

import com.toedter.calendar.JDateChooser;

import Models.BattimentModel;
import Models.ChambreModel;
import Models.ContratModel;
import Models.PersonneModel;
import Principale.Home;

public class AjouteContratView implements ActionListener {
	JPanel p;
	JLabel prixTotal,dateDebut,dateFin,sex,commentaire;
	JTextField prixTotalC;
	JDateChooser dateDebutC,dateFinC;
	JButton parcourir,enregistrer,annuler;
	JTextArea commentaireC;
	JOptionPane opt;
	Home parent;
	Color lightColor=new Color(217, 235,217);
	Color darkColor=new Color(39, 38, 64);
	
	String typeLocal;
	ChambreModel chambre;
	PersonneModel personne;
	BattimentModel battiment;
	
	public AjouteContratView(Home home, ChambreModel bt, PersonneModel pr,String tc) {
		super();
		parent = home;
		personne=pr;
		chambre=bt;
		typeLocal=tc;
	}

	public AjouteContratView(Home home, BattimentModel bt, PersonneModel pr, String tc) {
		super();
		parent = home;
		personne=pr;
		battiment=bt;
		typeLocal=tc;
	}

	public JPanel getPanel() {
		p=new JPanel();
		p.setLayout(null);
		p.setMinimumSize(new Dimension(768,700));
		p.setBackground(lightColor);
		
		
		prixTotal = new JLabel("prixTotal"); 
		prixTotal.setBounds(20, 82, 100, 20);
		prixTotal.setForeground(darkColor);
		p.add(prixTotal);
		prixTotalC=new JTextField();
		prixTotalC.setForeground(darkColor);
		prixTotalC.setBorder(new LineBorder(darkColor, 1, true));
		prixTotalC.setBackground(lightColor);
		prixTotalC.setBounds(80, 80, 300, 30);
		p.add(prixTotalC);
		
		
		dateDebut = new JLabel("dateDebut"); 
		dateDebut.setBounds(10, 12, 100, 20);
		dateDebut.setForeground(darkColor);
		p.add(dateDebut);
		dateDebutC=new JDateChooser();
		dateDebutC.setForeground(darkColor);
		dateDebutC.setBorder(new LineBorder(darkColor, 1, true));
		dateDebutC.setBackground(lightColor);
		dateDebutC.setBounds(80, 10, 300, 30);
		p.add(dateDebutC);
		
		
		dateFin = new JLabel("dateFin"); 
		dateFin.setBounds(390, 12, 100, 20);
		dateFin.setForeground(darkColor);
		p.add(dateFin);
		dateFinC=new JDateChooser();
		dateFinC.setForeground(darkColor);
		dateFinC.setBorder(new LineBorder(darkColor, 1, true));
		dateFinC.setBackground(lightColor);
		dateFinC.setBounds(440, 10, 300, 30);
		p.add(dateFinC);
		
		
		commentaire = new JLabel("COMMENT"); 
		commentaire.setBounds(7, 162, 100, 20);
		commentaire.setForeground(darkColor);
		p.add(commentaire);
		commentaireC=new JTextArea();
		commentaireC.setBorder(new LineBorder(darkColor, 1, true));
		commentaireC.setForeground(darkColor);
		commentaireC.setBackground(lightColor);
		commentaireC.setBounds(80, 160, 660, 100);
		p.add(commentaireC);
		


		enregistrer = new JButton("Enregistrer");   
		enregistrer.setBounds(200, 300, 180, 26);
		enregistrer.setFont(new Font("Arial", 1, 15));
		enregistrer.setForeground(new Color(255, 255, 255));
		enregistrer.setBackground(darkColor);
		enregistrer.addActionListener(this);
		p.add(enregistrer);
		
		annuler = new JButton("Annuler");   
		annuler.setBounds(400, 300, 180, 26);
		annuler.setFont(new Font("Arial", 1, 15));
		annuler.setForeground(new Color(255, 255, 255));
		annuler.setBackground(darkColor);
		annuler.addActionListener(this);
		p.add(annuler);
		
		return p;
	}
	
	public void actionPerformed(ActionEvent e) {
		Object o=e.getSource();
		if(o.equals(enregistrer)) {
			if(prixTotalC.getText().isEmpty()||dateDebutC.getDate()==null||commentaireC.getText().isEmpty())
				opt.showMessageDialog(p, "Il faut remplir tout les champs Obligatoires ! ","Champ Obligatoire vide Erreur", 0);
			else {
				if(typeLocal.equals("cbr")) {
					ContratModel ctr=new ContratModel(parent);
					ctr.chambre=chambre;
					ctr.personne=personne;
					ctr.dateDebut=dateDebutC.getDate();
					ctr.dateFin=dateFinC.getDate();
					ctr.typeLocal=typeLocal;
					ctr.typeContrat="location";
					ctr.commentaire=commentaireC.getText();
					ctr.prixContrat=Integer.valueOf(prixTotalC.getText());
					parent.database.addContratChambre(ctr);
					parent.afficheContrats(parent.database.getAllContrats());
				}
				else {
					ContratModel ctr=new ContratModel(parent);
					ctr.battiment=battiment;
					ctr.personne=personne;
					ctr.dateDebut=dateDebutC.getDate();
					ctr.typeLocal=typeLocal;
					ctr.commentaire=commentaireC.getText();
					if(dateFinC.getDate()==null)ctr.typeContrat="achat";
					else {
						ctr.dateFin=dateFinC.getDate();
						ctr.typeContrat="location";
					}
					ctr.prixContrat=Integer.valueOf(prixTotalC.getText());
					parent.database.addContratBattiment(ctr);
					parent.afficheContrats(parent.database.getAllContrats());
				}
			}
		}
		else if(o.equals(annuler)) {
			parent.afficheContrats(parent.database.getAllContrats());
		}
	}
	
	
}