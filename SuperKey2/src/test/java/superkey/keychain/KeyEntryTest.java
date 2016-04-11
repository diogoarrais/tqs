/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superkey.keychain;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ico
 */
public class KeyEntryTest {
    private KeyEntry entryA, entryEmpty;
    
    public KeyEntryTest() {
    }
    
    @Before
    public void setUp() {
        entryA = new KeyEntry();
        entryA.setApplicationName("appx");
        entryA.setUsername("xx");
        entryA.setPassword("secret@@@");
        
    }
    
    @After
    public void tearDown() {
    }

   
    @Test( expected = IllegalArgumentException.class)
    public void testSetApplicationNameWithNull() {
        entryA.setApplicationName( null);
    }

    @Test
    public void testKey() {
        // the key is the application name
        assertEquals("failed to get existing key field", entryA.getApplicationName(), "appx");
    }

    @Test
    public void testFormatAsCsv() {
        String expects = "appx" + KeyEntry.FIELDS_DELIMITER + "xx" + KeyEntry.FIELDS_DELIMITER + "secret@@@";
        assertEquals("failed to format entry to delimited string", entryA.formatAsCsv(), expects);
                   
    }

    @Test
    public void testToString() { 
        /**
        builder.append( getApplicationName());builder.append("\t");
        builder.append( getUsername());builder.append("\t");
        builder.append( getPassword());
        return builder.toString();
         */
        
        String result = entryA.getApplicationName() + "\t" + entryA.getUsername() + "\t" + entryA.getPassword();
        assertEquals(entryA.toString(),result);      
    }

    @Test
    public void testParse() {
      
        /**
         * String[] parts = csvLine.split(FIELDS_DELIMITER);
           KeyEntry retValue = new KeyEntry();
           retValue.setApplicationName( parts[0]);
           retValue.setUsername(parts[1]);
           retValue.setPassword(parts[2]);
           return retValue;
         * 
         */

        String result =  entryA.getApplicationName() +";" + entryA.getUsername() + ";"+ entryA.getPassword();
        assertEquals(entryA.formatAsCsv(), result);
        
     
    }

   
}
