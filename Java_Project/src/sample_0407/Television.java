package sample_0407;

public class Television {
	int channel;
	int volume;
	boolean onoff;
	
	void pr(){
		System.out.println(channel+" "+volume+" "+onoff);
		
	
	}
	
	int 
	changeChannel(int ch){
		channel = ch;
		return channel;
	}
	
	public Television() {
		this(10,20,false);
		//this.channel = 10;
		//this.volume = 10;
		//this.onoff = true;
	}
	
	public Television(int channel, int volume, boolean onoff) {
		this.channel = channel;
		this.volume = volume;
		this.onoff = onoff;
	}

}
