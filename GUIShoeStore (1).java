// Aziz Osman || Dr. Ali																						 
/* This GUI will be of a shoe store where you can buy five types of three different brand name shoes 
  and add them to your virtual cart where there is a total visible in a JTextArea to the			 
  right of the screen which records what was bought and how many of them were bought.				 
*/ 

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class GUIShoeStore implements ActionListener
{
	JFrame frame;
	JPanel contentPane;
	JLabel title, nike, adidas, jordan;
	JTextArea reciept;
	JButton nikeAirMax, nikePaulGeorgeIII, nikeAirMax700, nikeReactInfinity, nikeAirForce,
			jordanWhyNot, jordanRetroII, jordanAirJordan, jordanRetro13, jordanAeroSpace720,
			adidasYeezyBoost, adidasYeezyBoost700, adidasYeezy500, adidasYeezyBoost750, adidasNMD;
	
	int nikeAirMaxCost = 80, nikePaulGeorgeIIICost = 130, nikeAirMax700Cost = 200, nikeReactInfinityCost = 80, nikeAirForceCost = 120,
	jordanWhyNotCost = 200, jordanRetroIICost = 225, jordanAirJordanCost = 390, jordanRetro13Cost = 365, jordanAeroSpace720Cost = 180,
	adidasYeezyBoostCost = 300, adidasYeezyBoost700Cost = 450, adidasYeezy500Cost = 280, adidasYeezyBoost750Cost = 550, adidasNMDCost = 600,
	nikeAirMaxCounter = 0, nikePaulGeorgeIIICounter = 0, nikeAirMax700Counter = 0, nikeReactInfinityCounter = 0, nikeAirForceCounter = 0,
	jordanWhyNotCounter = 0, jordanRetroIICounter = 0, jordanAirJordanCounter = 0, jordanRetro13Counter = 0, jordanAeroSpace720Counter = 0,
	adidasYeezyBoostCounter = 0, adidasYeezyBoost700Counter = 0, adidasYeezy500Counter = 0, adidasYeezyBoost750Counter = 0, adidasNMDCounter = 0;
	double total = 0.0, subtotal = 0.0;
	final double TAX = 1.07;
	String recieptActual = "Welcome to Aziz's Shoe Store!\n"
			+ "Home to the Best Brands!\n\n"
			+ "If Anything Sparks Your Interest\n"
			+ "Click the Button to Add to Your Cart\n\n"
			+ "Virtual Cart:"
			+ "\n***********\n\n"
			+ "Subtotal: $0.00\n\n"
			+ "Tax: 7%\n\n"
			+ "Total: $0.00";
	String recieptActualStencil =  "Welcome to Aziz's Shoe Store!\n"
			+ "Home to the Best Brands!\n\n"
			+ "If Anything has Your Interest\n"
			+ "Click the Button to Add to Your Cart\n\n"
			+ "Virtual Cart:\n";
	String endRecieptActual = "";
	ArrayList <String> shoes = new ArrayList<String>();
	
	public GUIShoeStore()
	{
		//Create the frame for the GUI
		frame = new JFrame("Aziz's Shoe Store");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create the content pane for the GUI
		contentPane = new JPanel();
		contentPane.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.HORIZONTAL;
		
		/** HOW TO USE GridBagLayout
		 * To set the position of each component use c.gridx = #, c.gridy = #,			
		 * then when you add to the content pane -> contentPane.add(<componentName>, c)	
		 */
	
		//Creates the main title label of the GUI
		title = new JLabel("Aziz's Shoe Store");
		c.gridx= 1;
		c.gridy= 0;
		contentPane.add(title, c);
		
		//Creates the Nike label and the Nike shoe buttons underneath
		nike = new JLabel("Nike");
		c.gridx= 0;
		c.gridy= 1;
		contentPane.add(nike, c);
		
		nikeAirMax = new JButton("Air Max - $80");
		nikeAirMax.setActionCommand("AirMax");
		nikeAirMax.addActionListener(this);
		c.gridx= 0;
		c.gridy= 2;
		contentPane.add(nikeAirMax, c);
		
		nikePaulGeorgeIII = new JButton("Paul George III - $130");
		nikePaulGeorgeIII.setActionCommand("PaulGeorgeIII");
		nikePaulGeorgeIII.addActionListener(this);
		c.gridx= 0;
		c.gridy= 3;
		contentPane.add(nikePaulGeorgeIII, c);
		
		nikeAirMax700 = new JButton("Air Max 700 - $200");
		nikeAirMax700.setActionCommand("AirMax700");
		nikeAirMax700.addActionListener(this);
		c.gridx= 0;
		c.gridy= 4;
		contentPane.add(nikeAirMax700, c);
		
		nikeReactInfinity = new JButton("React Infinity - $80");
		nikeReactInfinity.setActionCommand("ReactInfinity");
		nikeReactInfinity.addActionListener(this);
		c.gridx= 0;
		c.gridy= 5;
		contentPane.add(nikeReactInfinity, c);
		
		nikeAirForce = new JButton("Air Force - $120");
		nikeAirForce.setActionCommand("AirForce");
		nikeAirForce.addActionListener(this);
		c.gridx= 0;
		c.gridy= 6;
		contentPane.add(nikeAirForce, c);
		
		//Creates the Jordan label and the Jordan shoe buttons underneath
		jordan = new JLabel("Jordan");
		c.gridx= 1;
		c.gridy= 1;
		contentPane.add(jordan, c);
		
		jordanWhyNot = new JButton("Why Not - $200");
		jordanWhyNot.setActionCommand("WhyNot");
		jordanWhyNot.addActionListener(this);
		c.gridx= 1;
		c.gridy= 2;
		contentPane.add(jordanWhyNot, c);
		
		jordanRetroII = new JButton("Retro II - $225");
		jordanRetroII.setActionCommand("RetroII");
		jordanRetroII.addActionListener(this);
		c.gridx= 1;
		c.gridy= 3;
		contentPane.add(jordanRetroII, c);

		jordanAirJordan = new JButton("Air Jordan - $390");
		jordanAirJordan.setActionCommand("AirJordan");
		jordanAirJordan.addActionListener(this);
		c.gridx= 1;
		c.gridy= 4;
		contentPane.add(jordanAirJordan, c);
		
		jordanRetro13 = new JButton("Retro 13 - $365");
		jordanRetro13.setActionCommand("Retro13");
		jordanRetro13.addActionListener(this);
		c.gridx= 1;
		c.gridy= 5;
		contentPane.add(jordanRetro13, c);
		
		jordanAeroSpace720 = new JButton("Aero Space 720 - $180");
		jordanAeroSpace720.setActionCommand("AeroSpace720");
		jordanAeroSpace720.addActionListener(this);
		c.gridx= 1;
		c.gridy= 6;
		contentPane.add(jordanAeroSpace720, c);
		
		//Creates the Adidas label and the Adidas shoe buttons underneath
		adidas = new JLabel("Adidas");
		c.gridx= 2;
		c.gridy= 1;
		contentPane.add(adidas, c);
		
		adidasYeezyBoost = new JButton("Yeezy Boost - $300");
		adidasYeezyBoost.setActionCommand("YeezyBoost");
		adidasYeezyBoost.addActionListener(this);
		c.gridx= 2;
		c.gridy= 2;
		contentPane.add(adidasYeezyBoost, c);
		
		adidasYeezyBoost700 = new JButton("Yeezy Boost 700 - $450");
		adidasYeezyBoost700.setActionCommand("YeezyBoost700");
		adidasYeezyBoost700.addActionListener(this);
		c.gridx= 2;
		c.gridy= 3;
		contentPane.add(adidasYeezyBoost700, c);
		
		adidasYeezy500 = new JButton("Yeezy 500 - $280");
		adidasYeezy500.setActionCommand("Yeezy500");
		adidasYeezy500.addActionListener(this);
		c.gridx= 2;
		c.gridy= 4;
		contentPane.add(adidasYeezy500, c);
		
		adidasYeezyBoost750 = new JButton("Yeezy Boost 750 - $550");
		adidasYeezyBoost750.setActionCommand("YeezyBoost750");
		adidasYeezyBoost750.addActionListener(this);
		c.gridx= 2;
		c.gridy= 5;
		contentPane.add(adidasYeezyBoost750, c);
		
		adidasNMD = new JButton("NMD - $600");
		adidasNMD.setActionCommand("NMD");
		adidasNMD.addActionListener(this);
		c.gridx= 2;
		c.gridy= 6;
		contentPane.add(adidasNMD, c);
		
		//Creates the text area for the receipt total which is updated during run-time
		reciept = new JTextArea(recieptActual + endRecieptActual);
		c.gridx= 3;
		c.gridy= 1;
		c.weighty = 20;
		reciept.setEditable(false);
		contentPane.add(reciept, c);
		
		//set content, pack frame, and visibility
		frame.setContentPane(contentPane);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed (ActionEvent event)
	{
		String eventName = event.getActionCommand();
		
		if(eventName.equals("AirMax"))
		{
			nikeAirMaxCounter++;
			if(nikeAirMaxCounter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Nike Air Max -")>=0)
					{
						shoes.set(i, nikeAirMaxCounter + " Nike Air Max - $" + (nikeAirMaxCounter*nikeAirMaxCost)+"\n");
						subtotal += nikeAirMaxCost;
					}
				}
			}
			else if(nikeAirMaxCounter==1)
			{
				shoes.add(nikeAirMaxCounter + " Nike Air Max - $" + (nikeAirMaxCounter*nikeAirMaxCost)+"\n");
				subtotal += nikeAirMaxCost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("PaulGeorgeIII"))
		{
			nikePaulGeorgeIIICounter++;
			if(nikePaulGeorgeIIICounter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Paul George III")>=0)
					{
						shoes.set(i, nikePaulGeorgeIIICounter + " Paul George III - $" + (nikePaulGeorgeIIICounter*nikePaulGeorgeIIICost)+"\n");
						subtotal += nikePaulGeorgeIIICost;
					}
				}
			}
			else if(nikePaulGeorgeIIICounter==1)
			{
				shoes.add(nikePaulGeorgeIIICounter + " Nike Paul George III - $" + (nikePaulGeorgeIIICounter*nikePaulGeorgeIIICost)+"\n");
				subtotal += nikePaulGeorgeIIICost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("AirMax700"))
		{
			nikeAirMax700Counter++;
			if(nikeAirMax700Counter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Air Max 700")>=0)
					{
						shoes.set(i, nikeAirMax700Counter + " Nike Air Max 700 - $" + (nikeAirMax700Counter*nikeAirMax700Cost)+"\n");
						subtotal += nikeAirMax700Cost;
					}
				}
			}
			else if(nikeAirMax700Counter==1)
			{
				shoes.add(nikeAirMax700Counter + " Nike Air Max 700 - $" + (nikeAirMax700Counter*nikeAirMax700Cost)+"\n");
				subtotal += nikeAirMax700Cost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("ReactInfinity"))
		{
			nikeReactInfinityCounter++;
			if(nikeReactInfinityCounter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Nike React Infinity")>=0)
					{
						shoes.set(i, nikeReactInfinityCounter + " Nike React Infinity - $" + (nikeReactInfinityCounter*nikeReactInfinityCost)+"\n");
						subtotal += nikeReactInfinityCost;
					}
				}
			}
			else if(nikeReactInfinityCounter==1)
			{
				shoes.add(nikeReactInfinityCounter + " Nike React Infinity - $" + (nikeReactInfinityCounter*nikeReactInfinityCost)+"\n");
				subtotal += nikeReactInfinityCost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("AirForce"))
		{
			nikeAirForceCounter++;
			if(nikeAirForceCounter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Nike Air Force")>=0)
					{
						shoes.set(i, nikeAirForceCounter + " Nike Air Force - $" + (nikeAirForceCounter*nikeAirForceCost)+"\n");
						subtotal += nikeAirForceCost;
					}
				}
			}
			else if(nikeAirForceCounter==1)
			{
				shoes.add(nikeAirForceCounter + " Nike Air Force - $" + (nikeAirForceCounter*nikeAirForceCost)+"\n");
				subtotal += nikeAirForceCost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("WhyNot"))
		{
			jordanWhyNotCounter++;
			if(jordanWhyNotCounter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Jordan Why Not")>=0)
					{
						shoes.set(i, jordanWhyNotCounter + " Jordan Why Not - $" + (jordanWhyNotCounter*jordanWhyNotCost)+"\n");
						subtotal += jordanWhyNotCost;
					}
				}
			}
			else if(jordanWhyNotCounter==1)
			{
				shoes.add(jordanWhyNotCounter + " Jordan Why Not - $" + (jordanWhyNotCounter*jordanWhyNotCost)+"\n");
				subtotal += jordanWhyNotCost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("RetroII"))
		{
			jordanRetroIICounter++;
			if(jordanRetroIICounter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Jordan Retro II")>=0)
					{
						shoes.set(i, jordanRetroIICounter + " Jordan Retro II - $" + (jordanRetroIICounter*jordanRetroIICost)+"\n");
						subtotal += jordanRetroIICost;
					}
				}
			}
			else if(jordanRetroIICounter==1)
			{
				shoes.add(jordanRetroIICounter + " Jordan Retro II - $" + (jordanRetroIICounter*jordanRetroIICost)+"\n");
				subtotal += jordanRetroIICost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("AirJordan"))
		{
			jordanAirJordanCounter++;
			if(jordanAirJordanCounter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Jordan Air Jordan")>=0)
					{
						shoes.set(i, jordanAirJordanCounter + " Jordan Air Jordan - $" + (jordanAirJordanCounter*jordanAirJordanCost)+"\n");
						subtotal += jordanAirJordanCost;
					}
				}
			}
			else if(jordanAirJordanCounter==1)
			{
				shoes.add(jordanAirJordanCounter + " Jordan Air Jordan - $" + (jordanAirJordanCounter*jordanAirJordanCost)+"\n");
				subtotal += jordanAirJordanCost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("Retro13"))
		{
			jordanRetro13Counter++;
			if(jordanRetro13Counter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Jordan Retro 13")>=0)
					{
						shoes.set(i, jordanRetro13Counter + " Jordan Retro 13 - $" + (jordanRetro13Counter*jordanRetro13Cost)+"\n");
						subtotal += jordanRetro13Cost;
					}
				}
			}
			else if(jordanRetro13Counter==1)
			{
				shoes.add(jordanRetro13Counter + " Jordan Retro 13 - $" + (jordanRetro13Counter*jordanRetro13Cost)+"\n");
				subtotal += jordanRetro13Cost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("AeroSpace720"))
		{
			jordanAeroSpace720Counter++;
			if(jordanAeroSpace720Counter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Jordan Aero Space 720")>=0)
					{
						shoes.set(i, jordanAeroSpace720Counter + " Jordan Aero Space 720 - $" + (jordanAeroSpace720Counter*jordanAeroSpace720Cost)+"\n");
						subtotal += jordanAeroSpace720Cost;
					}
				}
			}
			else if(jordanAeroSpace720Counter==1)
			{
				shoes.add(jordanAeroSpace720Counter + " Jordan Aero Space 720 - $" + (jordanAeroSpace720Counter*jordanAeroSpace720Cost)+"\n");
				subtotal += jordanAeroSpace720Cost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("YeezyBoost"))
		{
			adidasYeezyBoostCounter++;
			if(adidasYeezyBoostCounter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Adidas Yeezy Boost -")>=0)
					{
						shoes.set(i, adidasYeezyBoostCounter + " Adidas Yeezy Boost - $" + (adidasYeezyBoostCounter*adidasYeezyBoostCost)+"\n");
						subtotal += adidasYeezyBoostCost;
					}
				}
			}
			else if(adidasYeezyBoostCounter==1)
			{
				shoes.add(adidasYeezyBoostCounter + " Adidas Yeezy Boost - $" + (adidasYeezyBoostCounter*adidasYeezyBoostCost)+"\n");
				subtotal += adidasYeezyBoostCost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("YeezyBoost700"))
		{
			adidasYeezyBoost700Counter++;
			if(adidasYeezyBoost700Counter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Adidas Yeezy Boost 700")>=0)
					{
						shoes.set(i, adidasYeezyBoost700Counter + " Adidas Yeezy Boost 700 - $" + (adidasYeezyBoost700Counter*adidasYeezyBoost700Cost)+"\n");
						subtotal += adidasYeezyBoost700Cost;
					}
				}
			}
			else if(adidasYeezyBoost700Counter==1)
			{
				shoes.add(adidasYeezyBoost700Counter + " Adidas Yeezy Boost 700 - $" + (adidasYeezyBoost700Counter*adidasYeezyBoost700Cost)+"\n");
				subtotal += adidasYeezyBoost700Cost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("YeezyBoost750"))
		{
			adidasYeezyBoost750Counter++;
			if(adidasYeezyBoost750Counter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Adidas Yeezy Boost 750")>=0)
					{
						shoes.set(i, adidasYeezyBoost750Counter + " Adidas Yeezy Boost 750 - $" + (adidasYeezyBoost750Counter*adidasYeezyBoost750Cost)+"\n");
						subtotal += adidasYeezyBoost750Cost;
					}
				}
			}
			else if(adidasYeezyBoost750Counter==1)
			{
				shoes.add(adidasYeezyBoost750Counter + " Adidas Yeezy Boost 750 - $" + (adidasYeezyBoost750Counter*adidasYeezyBoost750Cost)+"\n");
				subtotal += adidasYeezyBoost750Cost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("Yeezy500"))
		{
			adidasYeezy500Counter++;
			if(adidasYeezy500Counter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Adidas Yeezy 500")>=0)
					{
						shoes.set(i, adidasYeezy500Counter + " Adidas Yeezy 500 - $" + (adidasYeezy500Counter*adidasYeezy500Cost)+"\n");
						subtotal += adidasYeezy500Cost;
					}
				}
			}
			else if(adidasYeezy500Counter==1)
			{
				shoes.add(adidasYeezy500Counter + " Adidas Yeezy 500 - $" + (adidasYeezy500Counter*adidasYeezy500Cost)+"\n");
				subtotal += adidasYeezy500Cost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
		
		else if(eventName.equals("NMD"))
		{
			adidasNMDCounter++;
			if(adidasNMDCounter>=2)
			{
				for(int i = 0; i<shoes.size(); i++)
				{
					if(shoes.get(i).indexOf("Adidas NMD")>=0)
					{
						shoes.set(i, adidasNMDCounter + " Adidas NMD - $" + (adidasNMDCounter*adidasNMDCost)+"\n");
						subtotal += adidasNMDCost;
					}
				}
			}
			else if(adidasNMDCounter==1)
			{
				shoes.add(adidasNMDCounter + " Adidas NMD - $" + (adidasNMDCounter*adidasNMDCost)+"\n");
				subtotal += adidasNMDCost;
			}
			total = subtotal * TAX;
			total = .01 * Math.round(total*100.0);
			recieptActual = recieptActualStencil + shoes;
			endRecieptActual = "\n***********\n"
					+ "Subtotal: $" + subtotal
					+ "\nTax: 7%"
					+ "\nTotal: $" + total;
			reciept.setText(recieptActual+endRecieptActual);
		}
	}
	
	
	 // Creates and shows the GUI
	private static void runGUI()
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		
		GUIShoeStore shoeStore = new GUIShoeStore();
	}
	
	public static void main (String[] args)
	{
		  //event-dispatching thread					
		javax.swing.SwingUtilities.invokeLater(new Runnable()
		{
			public void run()
			{
				runGUI();
			}
		});
	}
}