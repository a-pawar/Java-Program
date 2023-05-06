package com.mycompany.ad.javaclg;

public class ThreadedArraySearch {

    private int[] array;
    private int searchValue;
    private boolean found = false;

    public ThreadedArraySearch(int[] array, int searchValue) {
        this.array = array;
        this.searchValue = searchValue;
    }

    public boolean search() throws InterruptedException {
        int numThreads = 4; // number of threads to use
        int chunkSize = array.length / numThreads; // size of each chunk

        // Create and start threads
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = start + chunkSize;
            if (i == numThreads - 1) {
                end = array.length; // last thread gets the remaining elements
            }
            threads[i] = new Thread(new SearchThread(start, end));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }

        return found;
    }
    //member inner class
    private class SearchThread implements Runnable {
        private int start;
        private int end;

        public SearchThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i < end; i++) {
                if (array[i] == searchValue) {
                    found = true;
                    
                    break;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = new int[100]; // large array
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int searchValue = 123;

        ThreadedArraySearch searcher = new ThreadedArraySearch(array, searchValue);
        if (searcher.search()) {
            System.out.println("Value found!");
        } else {
            System.out.println("Value not found.");
        }
    }
}
