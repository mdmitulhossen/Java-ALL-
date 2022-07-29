public class Problem4 {
    public static void main(String[] args) {
        //Array declaration
        // int arr[] = new int[3];
        int arr[]={10,20,30};//one dimentional array
        System.out.println(arr.length);
        System.out.println();
        System.out.println("One dimentional Array traversing");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        //multi dimentioanl array
        int arr2[][]={{10,20,30},{40,50,60},{70,80,90}};
        System.out.println();
        System.out.println("Multi dimentional Array traversing");
        for(int i=0;i<3;i++){
            for(int j =0;j<3;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
