public class WorkingOnArrays {
    public static void main(String[] args) {
        float [] marks = new float[6];
        marks[1]=96.5f;
        marks[2]=89.7f;
        System.out.println(marks[2]);
        // 2-d array
        int [][] flats = new int [3][3] ;//
        flats[0][0] = 200;
        flats[0][1] = 300;
        flats[0][2] = 400;
        flats[1][0] = 500;
        flats[1][1] = 600;
        flats[1][2] = 700;
        flats[2][0] = 800;
        flats[2][1] = 900;
        flats[2][2] = 100;
        System.out.println(flats.length);
        System.out.println(flats[0].length);
        System.out.println(flats[1].length);
        System.out.println(flats[2].length);
for(int i = 0 ;i< flats.length;i++){
    for(int j = 0 ; j<flats[i].length;j++){
        System.out.printf("%d ",flats[i][j]);
    }
    System.out.println();
}
        


    }
}
