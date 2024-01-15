package AjouterViews;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.border.LineBorder;

import Models.BattimentModel;
import Principale.Home;

public class AjouteBattimentView implements ActionListener {
	JPanel p;
	JLabel chambres,status,photos;
	JLabel title,prixPerDay,ville,type,adress,prixAchat,description,nbChambres;
	JTextField titleC,prixPerDayC,villeC,adressC,typebC,photoC,prixAchatC,nbChambresC;
	ButtonGroup typeC;
	JRadioButton allType,locationAll,locationChambre,locationBattiment,vente;
	JButton parcourir,enregistrer,annuler;
	JPanel panType;
	JTextArea descriptionC;
	JOptionPane opt;
	Home parent;
	Color lightColor=new Color(217, 235,217);
	Color darkColor=new Color(39, 38, 64);
	
	public AjouteBattimentView(Home pr) {
		super();
		parent = pr;
	}

	public JPanel getPanel() {
		p=new JPanel();
		p.setLayout(null);
		p.setMinimumSize(new Dimension(768,700));
		p.setBackground(lightColor);
		title = new JLabel("TITLE"); 
		title.setBounds(40, 37, 100, 20);
		title.setForeground(darkColor);
		p.add(title);
		titleC=new JTextField();
		titleC.setForeground(darkColor);
		titleC.setBorder(new LineBorder(darkColor, 1, true));
		titleC.setBackground(lightColor);
		titleC.setBounds(80, 35, 280, 30);
		p.add(titleC);
		
		
		prixPerDay = new JLabel("PRIX/DAY"); 
		prixPerDay.setBounds(380, 37, 100, 20);
		prixPerDay.setForeground(darkColor);
		p.add(prixPerDay);
		prixPerDayC=new JTextField();
		prixPerDayC.setForeground(darkColor);
		prixPerDayC.setBorder(new LineBorder(darkColor, 1, true));
		prixPerDayC.setBackground(lightColor);
		prixPerDayC.setBounds(440, 35, 280, 30);
		p.add(prixPerDayC);
		
		
		ville = new JLabel("VILLE"); 
		ville.setBounds(40, 95, 100, 20);
		ville.setForeground(darkColor);
		p.add(ville);
		villeC=new JTextField();
		villeC.setForeground(darkColor);
		villeC.setBorder(new LineBorder(darkColor, 1, true));
		villeC.setBackground(lightColor);
		villeC.setBounds(80, 91, 280, 30);
		p.add(villeC);
		
		nbChambres = new JLabel("NBR CHAMBRES"); 
		nbChambres.setBounds(0, 269, 100, 20);
		nbChambres.setForeground(darkColor);
		p.add(nbChambres);
		nbChambresC=new JTextField();
		nbChambresC.setForeground(darkColor);
		nbChambresC.setBorder(new LineBorder(darkColor, 1, true));
		nbChambresC.setBackground(lightColor);
		nbChambresC.setBounds(80, 300, 280, 30);
		p.add(nbChambresC);
		
		type = new JLabel("TYPE"); 
		type.setBounds(40, 211, 100, 20);
		type.setForeground(darkColor);
		p.add(type);
		typeC = new ButtonGroup();
		locationAll = new JRadioButton("LocationAll", false);
		locationAll.setActionCommand("locationAll");
		locationAll.setBackground(lightColor);
		locationAll.setBounds(200, 210, 90, 20);
		p.add(locationAll);
		locationChambre = new JRadioButton("LocationChambre", false);
		locationChambre.setActionCommand("locationChambre");
		locationChambre.setBackground(lightColor);
		locationChambre.setBounds(330, 210, 130, 20);
		p.add(locationChambre);
		locationBattiment = new JRadioButton("LocationBattiment", false);
		locationBattiment.setActionCommand("locationBattiment");
		locationBattiment.setBackground(lightColor);
		locationBattiment.setBounds(480, 210, 130, 20);
		p.add(locationBattiment);
		vente = new JRadioButton("VENTE", false);
		vente.setActionCommand("vente");
		vente.setBackground(lightColor);
		vente.setBounds(630, 210, 80, 20);
		p.add(vente);
		allType = new JRadioButton("ALL", false);
		allType.setActionCommand("all");
		allType.setBackground(lightColor);
		allType.setBounds(120, 210, 60, 20);
		p.add(allType);
		typeC.add(locationAll);
		typeC.add(locationChambre);
		typeC.add(locationBattiment);
		typeC.add(vente);
		typeC.add(allType);
		
		description = new JLabel("DESCRIPTION"); 
		description.setBounds(7, 369, 100, 20);
		description.setForeground(darkColor);
		p.add(description);
		descriptionC=new JTextArea();
		descriptionC.setBorder(new LineBorder(darkColor, 1, true));
		descriptionC.setForeground(darkColor);
		descriptionC.setBackground(lightColor);
		descriptionC.setBounds(80, 400, 640, 100);
		p.add(descriptionC);
		
		
		adress = new JLabel("ADRESS"); 
		adress.setBounds(386, 150, 100, 20);
		adress.setForeground(darkColor);
		p.add(adress);
		adressC=new JTextField();
		adressC.setForeground(darkColor);
		adressC.setBorder(new LineBorder(darkColor, 1, true));
		adressC.setBackground(lightColor);
		adressC.setBounds(440, 148, 280, 30);
		p.add(adressC);
		
		
		prixAchat = new JLabel("PRIX/ACHAT"); 
		prixAchat.setBounds(366, 95, 100, 20);
		prixAchat.setForeground(darkColor);
		p.add(prixAchat);
		prixAchatC=new JTextField();
		prixAchatC.setForeground(darkColor);
		prixAchatC.setBorder(new LineBorder(darkColor, 1, true));
		prixAchatC.setBackground(lightColor);
		prixAchatC.setBounds(440, 91, 280, 30);
		p.add(prixAchatC);
		
		
		panType=new JPanel();
		panType.setForeground(darkColor);
		panType.setBackground(lightColor);
		panType.setBorder(new LineBorder(darkColor, 1, true));
		panType.setBounds(80, 206,640, 30);
		p.add(panType);
		

		
		JLabel photo = new JLabel("PHOTOS"); 
		photo.setBounds(24, 150, 100, 20);
		photo.setForeground(darkColor);
		p.add(photo);
		photoC=new JTextField();
		photoC.setForeground(darkColor);
		photoC.setBackground(lightColor);
		photoC.setBounds(80, 148, 180, 30);
		photoC.setBorder(new LineBorder(darkColor, 1, true));
		p.add(photoC);
		
		parcourir = new JButton("parcourir");   
		parcourir.setBounds(260, 148, 100, 30); 
		parcourir.setForeground(new Color(255, 255, 255));
		parcourir.setBackground(darkColor);
		parcourir.addActionListener(this);
		p.add(parcourir);

		enregistrer = new JButton("Enregistrer");   
		enregistrer.setBounds(200, 550, 180, 26);
		enregistrer.setFont(new Font("Arial", 1, 15));
		enregistrer.setForeground(new Color(255, 255, 255));
		enregistrer.setBackground(darkColor);
		enregistrer.addActionListener(this);
		p.add(enregistrer);
		
		annuler = new JButton("Annuler");   
		annuler.setBounds(400, 550, 180, 26);
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
			fch.setMultiSelectionEnabled(true);
	        if(fch.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
	            File[] fi=fch.getSelectedFiles();
	            String s="";
	            for(File f: fi) {
	            	s+=f.getPath()+"!";
	            }
	            System.out.println(s);
	            photoC.setText(s);
	        }
		}
		else if(o.equals(enregistrer)) {
			if(nbChambresC.getText().isEmpty()||titleC.getText().isEmpty()||prixPerDayC.getText().isEmpty()||villeC.getText().isEmpty()||typeC.getSelection()==null||descriptionC.getText().isEmpty()||adressC.getText().isEmpty()||prixAchatC.getText().isEmpty()||photoC.getText().isEmpty())
				opt.showMessageDialog(p, "Il faut remplir tout les champs Obligatoires ! ","Champ Obligatoire vide Erreur", 0);
			else {
				BattimentModel bat=new BattimentModel(parent);
				bat.title=titleC.getText();
				bat.nbChambres=Integer.valueOf(nbChambresC.getText());
				bat.prixPerDay=Integer.valueOf(prixPerDayC.getText());
				bat.ville=villeC.getText();
				bat.businessType=typeC.getSelection().getActionCommand();
				bat.description=descriptionC.getText();
				bat.adress=adressC.getText();
				bat.prixAchat=Integer.valueOf(prixAchatC.getText());
				bat.photos=photoC.getText();
				parent.database.addBattiment(bat);
				titleC.setText("");
				prixPerDayC.setText("");
				villeC.setText("");
				adressC.setText("");
				nbChambresC.setText("");
//				typebC.setText("");
				photoC.setText("");
				prixAchatC.setText("");
				descriptionC.setText("");
				int myId=parent.database.getBattimentId(bat.adress,bat.photos);
				parent.afficheBattiment(parent.database.getBattiment(myId));
			}
		}
		else if(o.equals(annuler)) {
			titleC.setText("");
			nbChambresC.setText("");
			prixPerDayC.setText("");
			villeC.setText("");
			adressC.setText("");
//			typebC.setText("");
			photoC.setText("");
			prixAchatC.setText("");
			descriptionC.setText("");
		}
	}
	
	
}