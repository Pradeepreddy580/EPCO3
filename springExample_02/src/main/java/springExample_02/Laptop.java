package springExample_02;

public class Laptop {
	
	private RAM laptopRam;
	
	private HardDrive driveSize;

	public RAM getLaptopRam() {
		return laptopRam;
	}

	public void setLaptopRam(RAM laptopRam) {
		this.laptopRam = laptopRam;
	}

	public HardDrive getDriveSize() {
		return driveSize;
	}

	public void setDriveSize(HardDrive driveSize) {
		this.driveSize = driveSize;
	}
	
	
}
