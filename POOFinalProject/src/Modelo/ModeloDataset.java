package Modelo;

public class ModeloDataset {
	
	int count0;
	int[] count = new int[10];
	String[] ageColNames = new String[10];
	
	public ModeloDataset() {
		count0 = 0;
		for(int i = 0; i < count.length; i++) {
			count[i] = 0;
			ageColNames[i] = "";
		}
	}
	
	public void setCount0(int count) {
		this.count0 = count;
	}
	
	public int getCount0() {
		return count0;
	}
	
	public void setCount(int[] count) {
		this.count = count;
	}
	
	public int[] getCount() {
		return count;
	}
	
	public void setAgeColNames(String names[]) {
		this.ageColNames = names;	
	}
	
	public String[] getAgeColNames() {
		return ageColNames;
	}
}
