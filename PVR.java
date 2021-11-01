/*Create a class PVR which represents a single screen theatre. due to covid situation it has 
decided to reduce the no of seats in cinema hall to 20. Create a class PVR which represents the
movie theatre and containing 20 seats initially which need to booked. PVR class should consist of 
method -- public void bookSeats(int n):which books n no of seats by substracting no from total 
number of seats available. if n is greater than number of seats available it should print
" Sufficient seats not available:can't book the seats". Create 3 object of PVR p1,p2,p3
where customer with p1 object will book 7 seats, p2 will try to book 10 seats and p3 will try 
to book 8 seats.*/

public class PVR
{
public int ava_seats=0;
public static int tot_seats=20;
public static int booked=0;


void bookSeats(int n)
 {
	System.out.println("\n Total seats available: "+tot_seats);
	tot_seats=(tot_seats-n);
	booked=tot_seats;
	//booked=20-(booked+n);
if(n>20 || tot_seats<=0)
{
    System.out.println(" Sufficient seats not available : can't book the seats. \n Please select the seats from available seats..!!");
}
else
{ 
    booked=n;
    System.out.println(" You have recently booked the seats: "+n);
    booked=booked+n;
    System.out.println(" Reamining seats: "+tot_seats);
    
}
 } 
 public static void main(String[] args)
{
	PVR p1=new PVR();
	PVR p2=new PVR();
	PVR p3=new PVR();
	p1.bookSeats(7);
	p2.bookSeats(10);
	p3.bookSeats(8);
}

}
