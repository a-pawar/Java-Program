
package com.mycompany.ad.javaclg;

import java.util.Arrays;

/**
 *
 * @author Anshul Pawar
 */
public class ThreadedArraySort {
    private static int array[];
    
    ThreadedArraySort(int[] array){
        this.array = array;
    }
    public boolean sort() throws InterruptedException{
        int numThreads = 4;
        int chunkSize = array.length/numThreads;
        //array for storing start and end index
        int [] storeSE = new int[numThreads*2];
        //create and start thread
        Thread[] threads = new Thread[numThreads];
        for(int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = start + chunkSize;
            storeSE[i*2]=start;
            storeSE[i*2+1]=end;
            if (i == numThreads - 1) {
                end = array.length; // last thread gets the remaining elements
            }
            threads[i] = new Thread(new SortRunnable(start, end));
            threads[i].start();
            
        }
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }
            merge(storeSE[0],storeSE[1],storeSE[2],storeSE[3]);
            merge(storeSE[4],storeSE[5],storeSE[6],storeSE[7]);
     
            merge(storeSE[0],storeSE[3],storeSE[4],storeSE[7]);

        
        return true;
    }
    
    
    private class SortRunnable implements Runnable{
        private int start;
        private int end;
        SortRunnable(int start ,int end){
           this.start = start;
           this.end = end;
//           System.out.println(start + " me "+ end);
        }
        
        public void run(){           
//            System.out.println("Anshul");
            Arrays.sort(array,start,end);
        }       
    }
    public static void main(String [] args) throws InterruptedException{
        
        int [] array = new int [20];
        for(int i=0;i<array.length;i++){
            array[i] =(int) ((Math.random() * 100)%20);    
        }
//        for(int a:array){
//            System.out.print(a+" ");
//        }    
        ThreadedArraySort obj = new ThreadedArraySort(array);
        if(obj.sort()){
            System.out.println("Sorting done");
        }
        else{
            System.out.println("Sorting is interrupted");
        }
        for(int a:array){
            System.out.println(a+" ");
        }
        //merge()
        
    }
    public static void merge(int a, int b,int c, int d){
        int varstart=a;
        int varend=d;
        int k=a;
        int [] temp = new int[100];
        while(a<b && c<d){
            if(array[a]<array[c]){
                temp[k++]=array[a++];
            }
            else{
                temp[k++] = array[c++];
            }
        }
        while(a<b){
         
                temp[k++]=array[a++];
            
        }
        while(c<d){
                temp[k++] = array[c++];
        }
        for(int i=varstart;i<varend-1;i++){
            array[i]=temp[i];
        }
    }
}

//remaining - merge 4 sorted array
