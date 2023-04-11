package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
	public static double distancia(Geo geo1, Geo geo2){
		double geoum = Math.toRadians(geo1.getLatitude());
		double geodois = Math.toRadians(geo2.getLatitude());
		double geoumum = Math.toRadians(geo1.getLongitude());
		double geodoisdois = Math.toRadians(geo2.getLongitude());
		double parenteses1 = Math.sin(geoum-geodois)/2;
		double parenteses2 = (geoumum-geodoisdois)/2;
		double sin2um = Math.pow(Math.sin(parenteses1), 2);
		double sin2dois = Math.pow(Math.sin(parenteses2), 2);
		double parenteseszao = (sin2um + sin2dois)*Math.cos(geoum)*Math.cos(geodois);
		double raiz = Math.sqrt(parenteseszao);
		double resultado=2*6371*Math.asin(raiz);
		return resultado;
	}
	public double distGeoDadosArmaz(Geo geo){
		return distancia(geo, geo);     //nao entendi o que é pra botar nos parenteses..

	}

	@Override
	public String toString() {
		return "Geo [latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	
		
}
