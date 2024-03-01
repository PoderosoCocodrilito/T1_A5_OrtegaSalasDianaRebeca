import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class VentanaPrincipal extends JFrame {
	JComboBox<String> comboTempInicial, comcoTempFinal;
	JTextField cajaRes;
	int elecion;
	double valorInicial=0.0;
	Conversiones c = new Conversiones ();
	public VentanaPrincipal() {
		getContentPane().setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Convertir temp");
		setSize(280, 120);
		setLocationRelativeTo(null);
		setVisible(true);
		JLabel txtConvertir = new JLabel("Convertir");
		add(txtConvertir);
		JTextField cajaIngreseTemp = new JTextField(6);
		add(cajaIngreseTemp);
		comboTempInicial = new JComboBox<>();
		comboTempInicial.addItem("Elige opcion...");
		comboTempInicial.addItem("Fahrenheit");
		comboTempInicial.addItem("Kelvin");
		comboTempInicial.addItem("Rankine");
		comboTempInicial.addItem("Celsius");
		add(comboTempInicial);
		comboTempInicial.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//Validad datos
				System.out.println(cajaIngreseTemp.getText());
				try {
					valorInicial = Double.parseDouble( cajaIngreseTemp.getText());
				}catch(NumberFormatException ex) {
					if((cajaIngreseTemp.getText()+"").equals("")) {
						JOptionPane.showMessageDialog(getContentPane(), 
								"NO HA INGRESADO NINGUN VALOR","Error", JOptionPane.ERROR_MESSAGE);
					}else {
						JOptionPane.showMessageDialog(getContentPane(), 
								"SOLO NUMEROS REALES","Error", JOptionPane.ERROR_MESSAGE);
					}
				}
				System.out.println(valorInicial);
				String op =  (String) comboTempInicial.getSelectedItem();
				if(op.equalsIgnoreCase("Fahrenheit")) {
					elecion=1;
				}else if(op.equalsIgnoreCase("Kelvin")) {
					elecion=2;
				}else if(op.equalsIgnoreCase("Rankine")) {
					elecion=3;
				}else if(op.equalsIgnoreCase("Celsius")) {
					elecion=4;
				}else {
					JOptionPane.showMessageDialog(getContentPane(), 
							"Debes elegir una Temperatura!!!");
				}
			}
		});
		JLabel txtA = new JLabel("A:  ");
		add(txtA);
		comcoTempFinal = new JComboBox<>();
		comcoTempFinal.addItem("Elige opcion...");
		comcoTempFinal.addItem("Fahrenheit");
		comcoTempFinal.addItem("Kelvin");
		comcoTempFinal.addItem("Rankine");
		comcoTempFinal.addItem("Celsius");
		add(comcoTempFinal);
		comcoTempFinal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(elecion==4) {
					String op =  (String) comcoTempFinal.getSelectedItem();
					if(op.equalsIgnoreCase("Fahrenheit")) {
						cajaRes.setText(String.valueOf(c.celsiusFarenheit(valorInicial)));
					}else if(op.equalsIgnoreCase("Kelvin")) {
						cajaRes.setText(String.valueOf(c.celsiusKelvin(valorInicial)));
					}else if(op.equalsIgnoreCase("Rankine")) {
						cajaRes.setText(String.valueOf(c.celsiusRankie(valorInicial)));
					}else if(op.equalsIgnoreCase("Celsius")) {
						cajaRes.setText(String.valueOf(c.celsiusCelsios(valorInicial)));
					}else {
						JOptionPane.showMessageDialog(getContentPane(), 
								"Debes elegir una Temperatura!!!");
					}
				}
				if(elecion==3) {
					//Rankine
					String op =  (String) comcoTempFinal.getSelectedItem();
					if(op.equalsIgnoreCase("Fahrenheit")) {
						cajaRes.setText(String.valueOf(c.rankineFarenheit(valorInicial)));
					}else if(op.equalsIgnoreCase("Kelvin")) {
						cajaRes.setText(String.valueOf(c.rankineKelvin(valorInicial)));
					}else if(op.equalsIgnoreCase("Rankine")) {
						cajaRes.setText(String.valueOf(c.rankineRankie(valorInicial)));
					}else if(op.equalsIgnoreCase("Celsius")) {
						cajaRes.setText(String.valueOf(c.rankineCelsios(valorInicial)));
					}else {
						JOptionPane.showMessageDialog(getContentPane(), 
								"Debes elegir una Temperatura!!!");
					}
				}//Rankine
				if(elecion==2) {
					//kelvin
					String op =  (String) comcoTempFinal.getSelectedItem();
					if(op.equalsIgnoreCase("Fahrenheit")) {
						cajaRes.setText(String.valueOf(c.kelvinFarenheit(valorInicial)));
					}else if(op.equalsIgnoreCase("Kelvin")) {
						cajaRes.setText(String.valueOf(c.kelvinKelvin(valorInicial)));
					}else if(op.equalsIgnoreCase("Rankine")) {
						cajaRes.setText(String.valueOf(c.kelvinRankie(valorInicial)));
					}else if(op.equalsIgnoreCase("Celsius")) {
						cajaRes.setText(String.valueOf(c.kelvinCelsios(valorInicial)));
					}else {
						JOptionPane.showMessageDialog(getContentPane(), 
								"Debes elegir una Temperatura!!!");
					}
				}//Kelvin
				if(elecion==1) {
					//Fahrenheit
					String op =  (String) comcoTempFinal.getSelectedItem();
					if(op.equalsIgnoreCase("Fahrenheit")) {
						cajaRes.setText(String.valueOf(c.fahrenheitFarenheit(valorInicial)));
					}else if(op.equalsIgnoreCase("Kelvin")) {
						cajaRes.setText(String.valueOf(c.fahrenheitKelvin(valorInicial)));
					}else if(op.equalsIgnoreCase("Rankine")) {
						cajaRes.setText(String.valueOf(c.fahrenheitRankie(valorInicial)));
					}else if(op.equalsIgnoreCase("Celsius")) {
						cajaRes.setText(String.valueOf(c.fahrenheitCelsios(valorInicial)));
					}else {
						JOptionPane.showMessageDialog(getContentPane(), 
								"Debes elegir una Temperatura!!!");
					}
				}//fahrenheit
			}
		});
		JLabel txtIgual = new JLabel(" =  ");
		add(txtIgual);
		cajaRes = new JTextField(10);
		add(cajaRes);
	}
}
public class PruebaConversor {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new VentanaPrincipal();
			}
		});

	}
}
