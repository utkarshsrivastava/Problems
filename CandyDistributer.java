package solution;

import java.util.Map;

public class CandyDistributer {
    public static void main(String[] args) throws java.io.IOException{
        java.util.Scanner in = new java.util.Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        java.io.BufferedWriter bw = new java.io.BufferedWriter(new 
//        		java.io.FileWriter(fileName));
        	int res;
        
        int _score_size = Integer.parseInt(in.nextLine());
        int[] _score = new int[_score_size];
        int _score_item;
        for(int _score_i = 0; _score_i < _score_size; _score_i++) {
            _score_item = Integer.parseInt(in.nextLine());
            _score[_score_i] = _score_item;
        }
        
        res = distributeCandy(_score);
//        bw.write(String.valueOf(res));
//        bw.newLine();
//        
//        bw.close();
        System.out.println("We need at least "+ res);
    }


/*
 * Complete the function below.
each person gets at least one  candy
each person with a better score than the another person gets more candies
find the minimum number of candies to be given.
 */

    static int distributeCandy(int[] score) {
    java.util.TreeMap<Integer,Integer> candcalmap=new java.util.TreeMap<Integer,Integer>();
        int totcand=0,numcan=1;
 /*   for(int indx=1;indx<score.length;indx++)
    {
        while(score[indx-1]<(indx<score.length?score[indx]:Integer.MAX_VALUE))
            {
            numcan++;
            indx++;
            totcand+=numcan;
            //System.out.println(numcan+"-"+indx+":"+totcand);
            if(indx==score.length)
                break;
            }
        numcan=1;
        totcand+=numcan;
        
    }
*/	for(int sc:score)
            {
        candcalmap.put(sc,candcalmap.get(sc)==null?1:candcalmap.get(sc)+1);
        }
        for(Map.Entry<Integer,Integer> e:candcalmap.entrySet())
            {
            totcand+=numcan*e.getValue();
//            System.out.println(e.getValue()+"-"+e.getKey()+":"+numcan+" "+totcand);
            numcan++;
            }
    return totcand;
    }


}
