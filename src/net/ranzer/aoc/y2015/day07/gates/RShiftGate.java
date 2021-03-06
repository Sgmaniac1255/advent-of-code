package net.ranzer.aoc.y2015.day07.gates;

import net.ranzer.aoc.y2015.day07.Wire;

public class RShiftGate extends Gate{
	Wire a;
	int distance;

	public RShiftGate(Wire a, int distance, Wire o){
		super(o);
		this.a = a;
		this.a.attachGate(this);
		this.distance = distance;

		update();
	}

	@Override
	public void update() {
		if(a.hasActiveSignal()) {
			o.setValue(a.getValue() >> distance);
			o.setActiveSignal(true);
			System.out.println(this);
		} else {
			o.setActiveSignal(false);
		}
	}

	@Override
	public String toString() {
		return String.format("running %s RSHIFT %d -> %s",a,distance,o);
	}
}