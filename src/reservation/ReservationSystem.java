package reservation;

public class ReservationSystem {
public static void main(String argv[]){
	ReservationControl reservationControl=new ReservationControl();
	MainFrame mainFrame=new MainFrame(reservationControl);
	mainFrame.setBounds(5,5,620,500);
	mainFrame.setVisible(true);	
}
}
