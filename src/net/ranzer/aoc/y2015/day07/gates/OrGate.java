package net.ranzer.aoc.y2015.day07.gates;

import net.ranzer.aoc.y2015.day07.Wire;

public class OrGate extends Gate {

	Wire a;
	Wire b;

	public OrGate(Wire a, Wire b, Wire o){
		super(o);
		this.a = a;
		this.a.attachGate(this);
		this.b = b;
		this.b.attachGate(this);
		update();
	}

	@Override
	public void update() {
		if (a.hasActiveSignal()&&b.hasActiveSignal()) {

			int output = a.getValue() | b.getValue();
			o.setValue(output);
			System.out.println(this);
		} else {
			o.setActiveSignal(false);
		}
	}

	@Override
	public String toString() {
		return String.format("running %s OR %s -> %s",a,b,o);
	}
}
