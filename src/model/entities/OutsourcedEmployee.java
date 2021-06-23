package model.entities;

public class OutsourcedEmployee extends Employee {

	protected Double additionalCharge;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hour, Double valuePerHour, Double additionalCharge) {
		super(name, hour, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	public Double getAdctionalCharge() {
		return additionalCharge;
	}

	public void setAdctionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + 1.1*additionalCharge;
	}

}
