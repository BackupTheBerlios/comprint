/*
 * @(#)MyApp.java  1.2  2003-06-01
 *
 * Copyright (c) 1999-2003 Werner Randelshofer
 * Staldenmattweg 2, Immensee, CH-6405, Switzerland
 * All rights reserved.
 *
 * This material is provided "as is", with absolutely no warranty expressed
 * or implied. Any use is at your own risk.
 *
 * Permission to use or copy this software is hereby granted without fee,
 * provided this copyright notice is retained on all copies.
 */

import javax.swing.*;


/**
 * A hello world application.
 *
 * @author Werner Randelshofer, Staldenmattweg 2, Immensee, CH-6405, Switzerland.
 * @version 1.2  2003-06-01  Revised.
 */
public class MyApp extends JFrame {
    
    /**
     * Creates a new instance.
     */
    public MyApp() {
        setTitle("My App");
        getContentPane().add(new JLabel("Hello World"));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        pack();
    }
    
    /**
     * This method launches the application without showing
     * a SplashScreen. This method returns when the initialisation
     * of the application is done.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new MyApp().show();
    }
}