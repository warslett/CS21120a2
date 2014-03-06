/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting2014;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author wia2
 */
public class DataFile extends File {

    DataFile(String fileName) {

        super(fileName);

    }

    public Comparable[] getComparables(){

        LinkedList<Comparable> items = new LinkedList<>();

        BufferedReader reader;
        
        int linecount =0;

        try {

            reader = new BufferedReader(new FileReader(this));
            
            String line = reader.readLine();

            while (line!=null) {
                
                linecount++;
                items.add(line);
                line = reader.readLine();

            }

        } catch (IOException e) {

            System.out.println("File not found " + getName());

        }

            return items.toArray(new Comparable[linecount]);
        
    }
    
}
