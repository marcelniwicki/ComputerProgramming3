
public class CinemaTicket
{
  static String cinemaName = "Helios";
  String filmTitle;
  int row;
  int seat;
  double price;
  
  void displayTicket(){
    System.out.println("Information about ticket: " + "Film title: " + filmTitle + "\nRow: " + 
    row + "\nSeat: " + seat + "\nPrice: " + price);
    }
  
  CinemaTicket(String filmTitle, int row, int seat){
    this.filmTitle = filmTitle;
    this.row = row;
    this.seat = seat;
    if (this.row>2){
        this.price = 25.0;
        }
        else {
            this.price = 10.0;
        }
    }  
  public static void main(String[] args){
      CinemaTicket ticket1 = new CinemaTicket("Gladioator", 2, 8);
      CinemaTicket ticket2 = new CinemaTicket("Pulp Fiction", 7, 10);
      
      ticket1.displayTicket();
      ticket2.displayTicket();
  }
  

}

