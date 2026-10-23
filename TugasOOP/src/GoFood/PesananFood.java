package GoFood;

public class PesananFood {
	package gofood;

	public class PesananFood {
	    private String namaMakanan;
	    private int jumlah;
	    private double totalHarga;

	    public PesananFood(String namaMakanan, int jumlah) {
	        this.namaMakanan = namaMakanan;
	        this.jumlah = jumlah;
	        this.totalHarga = 0;
	    }

	    public void hitungTotal(double hargaSatuan) {
	        if (hargaSatuan > 0 && jumlah > 0) {
	            this.totalHarga = hargaSatuan * jumlah;
	        }
	    }

	    public String getNamaMakanan() {
	        return namaMakanan;
	    }

	    public int getJumlah() {
	        return jumlah;
	    }

	    public double getTotalHarga() {
	        return totalHarga;
	    }
	}
}
