public class sepedamaju implements kendaraan {
	
	@Override
		public String merk() {
			return "sepeda polygon";
		}
	
	@Override
		public void melaju() {
			System.out.println("sepeda sedang maju");
		}
}