import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Conversiones {
//Celsius**********************************************************************************
public double celsiusFarenheit(double tempInicial) {
	return (tempInicial* (1.8)+32)  ;
}
public double celsiusKelvin(double tempInicial) {
	return tempInicial + 273.15 ;
}
public double celsiusRankie(double tempInicial) {
	return tempInicial*( 1.8) + 491.67;
}
public double celsiusCelsios(double tempInicial) {
	return tempInicial;
}
//rankine*********************************************************************************
public double rankineFarenheit(double tempInicial) {
	return (tempInicial-459.67)  ;
}
public double rankineKelvin(double tempInicial) {
	return tempInicial/(1.8);
}
public double rankineRankie(double tempInicial) {
	return tempInicial;
}
public double rankineCelsios(double tempInicial) {
	return (tempInicial- 491.67)*(0.5555) ;
}
//kelvin*********************************************************************************
public String kelvinFarenheit(double tempInicial) {
	DecimalFormat formato = new DecimalFormat("#.000");
	return formato.format(((tempInicial- 273.15) *1.8) +32);
}
public double kelvinKelvin(double tempInicial) {
	return tempInicial;
}
public double kelvinRankie(double tempInicial) {
	return tempInicial*1.8;
}
public double kelvinCelsios(double tempInicial) {
	return tempInicial -273.15 ;
}

//fahrenheit*********************************************************************************
public double fahrenheitFarenheit(double tempInicial) {
	return tempInicial;
}
public double fahrenheitKelvin(double tempInicial) {
	return (tempInicial-32)*(5/9)+273.15 ;
}
public double fahrenheitRankie(double tempInicial) {
	return tempInicial+ 459.67;
}
public double fahrenheitCelsios(double tempInicial) {
	return (tempInicial - 32) * (5/9);
}


}
