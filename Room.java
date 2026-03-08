class Room{
	int rate;
	public int getrate(int rate){
		this.rate=rate;
		return(this.rate);
	}
}


class DeluxeRoom extends Room{
	int rate;
	public int getrate(int rate){ 
		this.rate=rate+1500;
		return(this.rate);
	}

}
class StandardRoom extends Room{
	int rate;
	public int getrate(int rate){
		this.rate=rate;
		return(this.rate);
	}
}
class RoomSelection{
	public static void main(String[] args){
		DeluxeRoom d=new DeluxeRoom();
		StandardRoom s=new StandardRoom();
		Room r=new Room();
		System.out.println("Rate for those who just asked for a room without details:"+r.getrate(2500));
		System.out.println("Rate for the DeluxeRoom:"+d.getrate(2500));
		System.out.println("Rate for the standard room:"+s.getrate(2500));


	}
	

}
