package project.antcolony.colony;

import java.util.Timer;
import java.util.TimerTask;

public class Simulation {

	private static final long UPDATE_PERIOD = 1000 / 2;

	private SimulationUI ui;

	private Timer timer;
	private int count;

	public Simulation() {
		ui = new SimulationUI();
	}

	public void start() {

		startTimer();
	}

	public void stop() {
		stopTimer();
	}

	public void startTimer() {
		TimerTask timerTask = new TimerTask() {
			@Override
			public void run() {
				updateSimulation();
			}
		};
		if (timer != null) {
			timer.cancel();
		}
		timer = new Timer();
		timer.scheduleAtFixedRate(timerTask, UPDATE_PERIOD, UPDATE_PERIOD);
	}

	public void stopTimer() {
		if (timer != null) {
			timer.cancel();
		}
	}

	private void updateSimulation() {
		// System.out.println(count + " | updating simulation...");
		count++;
		ui.updateUI();
	}

	public SimulationUI getSimulationUI() {
		return ui;
	}
}
