package 开源项目;

public class Input {
	
	private int[] time;
	private String thing_name;
	private String color;
	private String[] time_S = {"2003","4","6","12","12","12"};
	private boolean on = true;
	public boolean getOn() {
		return on;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public Input(){
		
	}
	public Input(int[] time,String thing_name,String color) {
		this.color = color;
		this.thing_name = thing_name;
		this.time = time;
		
	}
	public int[] getTime() {
		return time;
	}
	public void setTime(int[] time) {
		this.time = time;
	}
	public String getThing_name() {
		return thing_name;
	}
	public void setThing_name(String thing_name) {
		this.thing_name = thing_name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public static String frontCompWithZore(int formatLength,int formatNumber){
		
		String newString = String.format("%0"+formatLength+"d", formatNumber);
		return newString;
	}
	public  void toString_Time() {
		
		for(int i =0;i<6;i++) {
			
				time_S[i] = Input.frontCompWithZore(2, time[i]);
			}
		}
	
	public String toString() {
		return time_S[0]+"年"+time_S[1]+"月"+time_S[2]+"日"+" "+time_S[3]+"时"
				+time_S[4]+"分"+time_S[5]+"秒";
	}

}
