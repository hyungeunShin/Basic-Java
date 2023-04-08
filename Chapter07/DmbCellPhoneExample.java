package Chapter07;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		DmbCellPhone d = new DmbCellPhone("자바폰", "검정", 10);
		
		CellPhone c = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델 : " + c.model);
		System.out.println("색상 : " + c.color);
		//System.out.println("채널 : " + c.channel);
		
		//c.turnondmb();
		//c.changechanneldmb(12);
		c.poweroff();
		
		System.out.println("모델 : " + d.model);
		System.out.println("색상 : " + d.color);
		System.out.println("채널 : " + d.channel);
		
		d.poweron();
		d.bell();
		d.sendvoice("여보세요");
		d.receivevoice("안녕하세요");
		d.sendvoice("반가워요");
		d.hangup();
		
		d.turnondmb();
		d.changechanneldmb(12);
		d.poweroff();		
	}
}
