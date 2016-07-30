package fleetofjets;

public class Jet {
	private String model;
	private float speedMPH;
	private float range;
	private float price;
	public float speedMach = 0.0F;
	// CONSTRUCTORS

	public Jet() {
		super();
	}

	public Jet(String model, float speedMPH, float range, float price) {
		super();
		this.model = model;
		this.speedMPH = speedMPH;
		this.range = range;
		this.price = price;
		calculateMach();
	}

	// GET SET

	public String getModel() {
		return model;
	}

	public float getSpeedMPH() {
		return speedMPH;
	}

	public float getRange() {
		return range;
	}

	public float getPrice() {
		return price;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeedMPH(float speedMPH) {
		this.speedMPH = speedMPH;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	// METHODS

	public float calculateMach() {
		speedMach = (speedMPH / 660.1F);
		return speedMach;

	}

	// toString
	@Override
	public String toString() {
		return "Jet [model=" + model + ", speedMPH=" + speedMPH + ", range=" + range + ", price=" + price
				+ ", speedMach=" + speedMach + "]";
	}

}
