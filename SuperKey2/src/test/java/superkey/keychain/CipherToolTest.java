/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superkey.keychain;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arrais
 */
public class CipherToolTest {
    
    public CipherToolTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of writeProtectedKeychain method, of class CipherTool.
     */
    @Test
    public void testWriteProtectedKeychain() throws Exception {
        System.out.println("writeProtectedKeychain");
        String allChain = "";
        File target = null;
        CipherTool instance = null;
        instance.writeProtectedKeychain(allChain, target);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readProtectedKeychain method, of class CipherTool.
     */
    @Test
    public void testReadProtectedKeychain() throws Exception {
        System.out.println("readProtectedKeychain");
        KeyChain chain = null;
        File target = null;
        CipherTool instance = null;
        instance.readProtectedKeychain(chain, target);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
