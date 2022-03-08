/**
 HashTable Lab
 The program creates a Driver for HashTable
 Author: Ishan Tandon
 Collaborator(s):n/A
 Collaboration:n/A
 Date: 3/7/22
 On My Honor, I confirm that I followed all collaboration policy guidelines,
 and that the work I am submitting is my own: IT
 **/

public class Driver {
    public static void main(String[] args) {
        HashTable test = new HashTable(2000);
        System.out.println(test.put("ishan", "will "));//put method, returns true
        System.out.println(test.put("colin", "robot "));//put method, returns true


        System.out.println("Testing get method (return will) " + test.get("ishan"));//get method
        System.out.println("Testing get method (return robot) " + test.get("colin"));


        System.out.print("Testing put method (return false) ");//edge cases
        System.out.println(test.put("ishan", "ryan"));
    }
}
