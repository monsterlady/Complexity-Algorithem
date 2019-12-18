
/*
 * 此文件由徐瑞康所创建
 */

package Monsterlady;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {
    private final static int runTimes = 10;
    private final static int[] SIZE = /*{5000, 10000, 50000, 100000, 500000,*/{ 1000000, 5000000, 10000000, 50000000, 100000000};

    public static void main(String[] args) {
	    // write your code here
        long start,end;
        for(int i = 0; i < SIZE.length; i++) {
            start = System.nanoTime();
            for(int t = 0; t < runTimes;t++ ){
                //initiate array
                int[] listToSort = new Main().generateRandomList(SIZE[i]);
                // 1. sortedMinMax:
                // sortedMinMax(listToSort);
                // 2. seqMinMax:
                // seqMinMax(listToSort);
                // 3. recMinMax:
                 System.out.println("Running Algorithm 3 : recMinMax");
                 recMinMax(listToSort);
            }
            end = System.nanoTime();
            System.out.println("N: "+ SIZE[i] + " ; Average running Time for per time:" + ((end - start)/1000000) / 10 + "(ms)");
        }
        /*
        start = System.currentTimeMillis();
        recMinMax(new Main().generateRandomList(1000000));
        end = System.currentTimeMillis();
        System.out.println("N: "+ "1000000" + " ; Average running Time for per time:" + (end - start)  + "(ms)");*/
        System.out.println("Program Ends!");
    }

    private static void sortedMinMax(@NotNull int[] arrayList){
        System.out.println("Running Algorithm 1 : sortedMinMax");

        for( int i=0; i < arrayList.length-1; i++ ) {
            for( int j=i+1; j>0; j-- ) {
                if( arrayList[j-1] <= arrayList[j] )
                    break;
                int temp = arrayList[j];      //交换操作
                arrayList[j] = arrayList[j-1];
                arrayList[j-1] = temp;
            }
        }
    }

    private static void seqMinMax(@NotNull int[] arrayList){
        /*
        for(int i = 0; i < arrayList.length-1; i++){
            int min = i;
            for(int j = i+1; j < arrayList.length; j++){    //选出之后待排序中值最小的位置
                if(arrayList[j] < arrayList[min]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arrayList[min];      //交换操作
                arrayList[min] = arrayList[i];
                arrayList[i] = temp;
                //System.out.println("Sorting:  " + Arrays.toString(arrayList));
            }
        }*/
        System.out.println("Running Algorithm 2 : seqMinMax");
        int minNum = arrayList[0];
        int maxNum = arrayList[arrayList.length - 1];
        for(int i : arrayList){
            if(i < minNum){
                minNum = i;
            }
            if(i > maxNum){
                maxNum = i;
            }
        }

        //System.out.println(Arrays.toString(arrayList));
        System.out.println("Minimum: " + minNum + "    Maximum: " + maxNum);
    }

    private static int[] recMinMax(int[] arrayList){
        //If Array has only one or two elements, program could determine the biggest and smallest element immediately
        //if(arrayList.length == 2) return arrayList;

            if (arrayList.length <= 1) return arrayList;

            int num = arrayList.length >> 1;
            int[] leftArr = Arrays.copyOfRange(arrayList, 0, num);
            int[] rightArr = Arrays.copyOfRange(arrayList, num, arrayList.length);
           // System.out.println("split two array: " + Arrays.toString(leftArr) + " And " + Arrays.toString(rightArr));
            return mergeTwoArray(recMinMax(leftArr), recMinMax(rightArr));      //不断拆分为最小单元，再排序合并

    }
    @NotNull
    private static int[] mergeTwoArray(int[] arr1, int[] arr2){
        int i = 0, j = 0, k = 0;
        int[] result = new int[arr1.length + arr2.length];  //申请额外的空间存储合并之后的数组
        while(i < arr1.length && j < arr2.length){      //选取两个序列中的较小值放入新数组
            if(arr1[i] <= arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }
        while(i < arr1.length){     //序列1中多余的元素移入新数组
            result[k++] = arr1[i++];
        }
        while(j < arr2.length){     //序列2中多余的元素移入新数组
            result[k++] = arr2[j++];
        }
        //System.out.println("Merging: " + Arrays.toString(result));
        return result;
    }

    @NotNull
    private int[] generateRandomList(int size){
        int[] nwArrayList = new int[size];
        for(int i = 0; i < size; i ++){
            int randomNum = (int)(Math.random() * (1000000 - 1));
            nwArrayList[i] = randomNum;
        }
        return nwArrayList;
    }
}
