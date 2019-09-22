package by.htp.task08.main.task03;

public class Student {
	private String name;
	private int group;
	private int[] progress = new int[5];

	public Student(String name, int group, int[] progress) {
		this.name = name;
		this.group = group;
		for (int i = 0; i < this.progress.length; i++) {
			if (i < progress.length) {
				this.progress[i] = progress[i];
			} else {
				this.progress[i] = 0;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int[] getProgress() {
		return progress;
	}

	public void setProgress(int[] progress) {
		this.progress = progress;
	}
	
	
}