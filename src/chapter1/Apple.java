package chapter1;

public class Apple {
	
	public Apple(String color, Integer weight) {
		this.color = color;
		this.weight = weight;
	}

	private String color;
	private Integer weight;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}
}
