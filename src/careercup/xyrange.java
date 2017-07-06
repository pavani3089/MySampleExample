package careercup;

/**
 * Created by pavani on 6/6/17.
 */
public class xyrange {


    public static  int  getOccurence(int x, int y) {
        int count = 0;
        int itr = y;
        while(itr <= x) {

            if(itr % 10 == y) {
                count++;
                System.out.println(itr);
            }
            if(itr != 0 && itr/10 == y) {
                count++;
                itr++;
                System.out.println(itr);
            } else if(itr/10 == y-1) {
                itr = itr + (10 - y);
                System.out.println(itr);
            }
            else {
                itr += 10;
                System.out.println(itr);
            }
        }
        return count;
    }
    public static void main(String args[])
    {
        //int count=getOccurence(25,1);
        //System.out.print(count);

 int x=30, y=25, z;

 z=x;
 x=y;
 y=z;

System.out.println("x="+x+" y="+y);

    }
}
