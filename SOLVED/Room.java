public class Room {
    int roomNo;
    String roomType;
    int roomArea;
    boolean ACmachine;
    void setData(){
        this.roomNo=10;
        this.roomType="Four bed";
        this.roomArea=30;
        this.ACmachine=false;
    }
    void displayData(){
        System.out.println("Room no: "+roomNo);
        System.out.println("Room Type: "+roomType);
        System.out.println("Room Area: "+ roomArea + " sq");
        System.out.println("Room AcMachine: "+ACmachine);
    }

    public static void main(String[] args) {
        Room o=new Room();
        o.setData();
        o.displayData();
    }
}
