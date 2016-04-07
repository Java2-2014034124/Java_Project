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

}
