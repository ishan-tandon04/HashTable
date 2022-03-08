/**
 HashTable Lab
 The program creates a HashTable
 Author: Ishan Tandon
 Collaborator(s):n/A
 Collaboration:n/A
 Date: 3/7/22
 On My Honor, I confirm that I followed all collaboration policy guidelines,
 and that the work I am submitting is my own: IT
 **/

public class HashTable {
    private String[] aHashTable; //instance data for hashTable and sectionsFilled
    int sectionsFilled;

    //default constructor
    public HashTable(int capacity){
        aHashTable = new String[capacity];
        sectionsFilled = 0;
    }

    //put method
    public boolean put(String key, String value){
        boolean work = false; //value for boolean set to false default
        int h1 = hashCode(key); // setting h1 as an int to hashCode with a specific key

        if(sectionsFilled == aHashTable.length){ //grow array if needed

            String[] newHashTable = new String[aHashTable.length * 2]; //doubleing the length

            System.arraycopy(aHashTable, 0, newHashTable, 0, aHashTable.length);
            aHashTable = newHashTable;
        }

        while(h1 >= aHashTable.length){ //making the array bigger
            String[] aNewHashTable = new String[aHashTable.length * 2];

            for(int i=0; i<aHashTable.length; i++){//for loop to sort through the sections filled
                aNewHashTable[i] = aHashTable[i];//indexes
            }
            aHashTable = aNewHashTable;
        }

        if (aHashTable[h1] == null) {
            work = true;
            aHashTable[h1] = value;
            sectionsFilled++;
        }
        return work;
    }

    //get method
    public String get(String key){
        int h1 = hashCode(key);

        while(h1 >= aHashTable.length){//white loop to sort through length
            String[] newHashTable = new String[aHashTable.length * 2];

            System.arraycopy(aHashTable, 0, newHashTable, 0, aHashTable.length);
            aHashTable = newHashTable;
        }
        return aHashTable[h1];//returning value
    }


    private int hashCode(String key){ //returns int from a certain range

        String value = ""; //initial string value as a blank string

        for(int i = 0; i<key.length(); i++){ //for loop to put values into certain sections
            //adding the value to past ones
            value += (int)key.charAt(i)-'a';
        }
        return (int) Integer.parseInt(value);
    }
}
