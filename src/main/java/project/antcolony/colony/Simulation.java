package project.antcolony.colony;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Simulation {

	private static final long UPDATE_PERIOD = 1000 / 30;

	private SimulationUI ui;

	private Timer timer;
	private int count;

	private List<Colony> colonies;

	public Simulation() {
		ui = new SimulationUI();
		this.colonies = new ArrayList<Colony>();
		colonies.add(new Colony(new Vector2(200, 200), 20));
		colonies.get(0).spawnAnt();
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
		updateGameboardObjects();
		ui.updateUI(colonies);
	}

	private void updateGameboardObjects() {
		for (Colony c : colonies) {
			c.updatePosition();
		}

	}

	public SimulationUI getSimulationUI() {
		return ui;
	}
}
