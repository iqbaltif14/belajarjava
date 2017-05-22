public class	sepedaenkap {
	
	public static void main(String[] args) {
		kendaraanenkap	bike = new kendaraanenkap();
		kendaraanenkap	bikem = new kendaraanenkap();
		bike.setMerk("WimCycle");
		System.out.println(bike.getMerk());
		bikem.setTipe("MTB");
		System.out.println(bikem.getTipe());
	}
}