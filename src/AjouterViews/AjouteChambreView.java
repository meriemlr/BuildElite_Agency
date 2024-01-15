package AjouterViews;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.border.LineBorder;

import Models.BattimentModel;
import Models.ChambreModel;
import Principale.Home;

public class AjouteChambreView implements ActionListener {
//	int id_chambre;
//	String title="fvdbfl";
//	String description="cfsnlvsnfisn";
//	String ville;
//	String adress="dnvskjsflivjow";
//	String typec;
//	int prixPerDay;
//	BattimentModel battiment;
//	String photos;
//	String status="Available";
	JPanel p;
	JLabel chambres,status,photos;
	JLabel title,prixPerDay,ville,type,prixPerMonth,adress,description;
	JTextField titleC,prixPerDayC,villeC,adressC,typebC,prixPerMonthC,photoC;
	ButtonGroup typeC;
	JRadioButton any,single,Double,Triple,Quad;
	JButton parcourir,enregistrer,annuler;
	JPanel panType;
	JTextArea descriptionC;
	JOptionPane opt;
	Home parent;
	Color lightColor=new Color(217, 235,217);
	Color darkColor=new Color(39, 38, 64);
	int idBattiment=-1;
	public AjouteChambreView(Home pr) {
		super();
		parent = pr;
	}
	public AjouteChambreView(Home pr,int idb) {
		super();
		parent = pr;
		idBattiment=idb;
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
		
		type = new JLabel("TYPE"); 
		type.setBounds(40, 211, 100, 20);
		type.setForeground(darkColor);
		p.add(type);
		typeC = new ButtonGroup();
		single = new JRadioButton("single", false);
		single.setActionCommand("single");
		single.setBackground(lightColor);
		single.setBounds(200, 210, 90, 20);
		p.add(single);
		Double = new JRadioButton("Double", false);
		Double.setActionCommand("Double");
		Double.setBackground(lightColor);
		Double.setBounds(330, 210, 130, 20);
		p.add(Double);
		Triple = new JRadioButton("Triple", false);
		Triple.setActionCommand("Triple");
		Triple.setBackground(lightColor);
		Triple.setBounds(480, 210, 130, 20);
		p.add(Triple);
		Quad = new JRadioButton("Quad", false);
		Quad.setActionCommand("Quad");
		Quad.setBackground(lightColor);
		Quad.setBounds(630, 210, 80, 20);
		p.add(Quad);
		any = new JRadioButton("ALL", false);
		any.setActionCommand("all");
		any.setBackground(lightColor);
		any.setBounds(120, 210, 60, 20);
		p.add(any);
		typeC.add(single);
		typeC.add(Double);
		typeC.add(Triple);
		typeC.add(Quad);
		typeC.add(any);
		
		description = new JLabel("DESCRIPTION"); 
		description.setBounds(7, 269, 100, 20);
		description.setForeground(darkColor);
		p.add(description);
		descriptionC=new JTextArea();
		descriptionC.setBorder(new LineBorder(darkColor, 1, true));
		descriptionC.setForeground(darkColor);
		descriptionC.setBackground(lightColor);
		descriptionC.setBounds(80, 300, 640, 100);
		p.add(descriptionC);
		
		prixPerMonth = new JLabel("PRIX/MONTH"); 
		prixPerMonth.setBounds(366, 95, 100, 20);
		prixPerMonth.setForeground(darkColor);
		p.add(prixPerMonth);
		prixPerMonthC=new JTextField();
		prixPerMonthC.setForeground(darkColor);
		prixPerMonthC.setBorder(new LineBorder(darkColor, 1, true));
		prixPerMonthC.setBackground(lightColor);
		prixPerMonthC.setBounds(440, 91, 280, 30);
		p.add(prixPerMonthC);
		
		
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
		
		
//		prixPerMonth = new JLabel("PRIX/ACHAT"); 
//		prixPerMonth.setBounds(366, 95, 100, 20);
//		prixPerMonth.setForeground(darkColor);
//		p.add(prixPerMonth);
//		prixPerMonthC=new JTextField();
//		prixPerMonthC.setForeground(darkColor);
//		prixPerMonthC.setBorder(new LineBorder(darkColor, 1, true));
//		prixPerMonthC.setBackground(lightColor);
//		prixPerMonthC.setBounds(440, 91, 280, 30);
//		p.add(prixPerMonthC);
		
		
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
		enregistrer.setBounds(200, 450, 180, 26);
		enregistrer.setFont(new Font("Arial", 1, 15));
		enregistrer.setForeground(new Color(255, 255, 255));
		enregistrer.setBackground(darkColor);
		enregistrer.addActionListener(this);
		p.add(enregistrer);
		
		annuler = new JButton("Annuler");   
		annuler.setBounds(400, 450, 180, 26);
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
			if(prixPerMonthC.getText().isEmpty()||titleC.getText().isEmpty()||prixPerDayC.getText().isEmpty()||villeC.getText().isEmpty()||typeC.getSelection()==null||descriptionC.getText().isEmpty()||adressC.getText().isEmpty()||photoC.getText().isEmpty())
				opt.showMessageDialog(p, "Il faut remplir tout les champs Obligatoires ! ","Champ Obligatoire vide Erreur", 0);
			else {
				ChambreModel bat=new ChambreModel(parent);
				bat.title=titleC.getText();
				bat.prixPerDay=Integer.valueOf(prixPerDayC.getText());
				bat.prixPerMonth=Integer.valueOf(prixPerMonthC.getText());
				bat.ville=villeC.getText();
				bat.typec=typeC.getSelection().getActionCommand();
				bat.description=descriptionC.getText();
				bat.adress=adressC.getText();
				bat.photos=photoC.getText();
				bat.battiment=new BattimentModel(parent);bat.battiment.id_batiment=idBattiment;
				parent.database.addChambre(bat);
				titleC.setText("");
				prixPerDayC.setText("");
				prixPerMonthC.setText("");
				villeC.setText("");
				adressC.setText("");
				photoC.setText("");
				descriptionC.setText("");
				if(idBattiment!=-1)
					parent.afficheBattiment(parent.database.getBattiment(idBattiment));
			}
		}
		else if(o.equals(annuler)) {
			titleC.setText("");
			prixPerDayC.setText("");
			villeC.setText("");
			adressC.setText("");
			prixPerMonthC.setText("");
			photoC.setText("");
			descriptionC.setText("");
		}
	}
	
	
}