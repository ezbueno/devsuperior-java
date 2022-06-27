package herancamultipla.problemadiamante.devices;

public abstract class Device {
	protected String serialNumber;

	protected Device(String serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}

	public abstract void processDoc(String doc);
}
