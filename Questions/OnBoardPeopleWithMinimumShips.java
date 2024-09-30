package Questions;

import java.util.ArrayList;
import java.util.Arrays;

class OnBoardPeopleWithMinimumShips {

    public static void main(String[] args) {
        int w[] = {50,80,70,50,20,30,40};   // 30,50,50,70,80
        int c = 100;
        int temp=c;
        int l=0;
        int r= w.length-1;
        Arrays.sort(w);
        int ship=0;
        while(l<=r){
            if(l==r && w[l]<=c){
                ship++;
                break;
            }
            if((w[l]+w[r])<=c){
                c=c-w[l]-w[r];
                l++;
                r--;
                if(l>r){
                    ship++;
                    break;
                }
            }else if(w[l]<=c){
                c=c-w[l];
                l++;
            }else{
                c = temp;
                ship++;
            }
        }
        System.out.println(ship);
    }
}
