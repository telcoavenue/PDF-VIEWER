
/*

created by < tinoC23 /> @ 08/2019

-- pdf viewer v1.00 --

pdf viewer can display .pdf extension files .....

*/




import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.lang.Math;

import java.io.BufferedReader;

import java.io.IOException;

import java.nio.file.Files;

import java.nio.file.Paths;

import java.io.File;

import javax.swing.JFileChooser;

import javax.swing.filechooser.FileSystemView;

import java.text.Format;

import java.util.Formatter;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.Calendar;

import java.util.Date;

import java.time.LocalDate;

import java.io.FileWriter;

import java.io.BufferedWriter;

import java.util.*;

import java.util.List;

import java.util.LinkedList;

import java.util.Scanner;

import java.io.*;

import java.util.MissingResourceException;

import javax.swing.JScrollBar;

import javax.swing.JTextArea;

import java.awt.AWTException;

import java.awt.Image;

import java.awt.Toolkit;

import java.util.Random;

import javax.swing.Box;

import javax.swing.ImageIcon;

import java.awt.KeyEventDispatcher;

import java.awt.KeyboardFocusManager;

import java.awt.event.KeyEvent;

import java.lang.Object;

import java.awt.Robot;

import java.lang.ArrayIndexOutOfBoundsException;

 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;
 
import java.awt.event.*;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.plaf.metal.MetalIconFactory;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.JOptionPane;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JWindow;

import java.util.*;

import javax.swing.JScrollPane;

import javax.swing.JComboBox;

import java.util.Arrays;

import javax.swing.JCheckBox;

 import java.lang.ArrayIndexOutOfBoundsException;
 
 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;

import java.awt.event.*;

 import javax.swing.Popup;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.*;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JOptionPane;

import java.lang.Object;

import java.util.StringTokenizer;

import java.lang.Math;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.JTextArea;

import javax.swing.JColorChooser;

import javax.swing.Icon;

import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.awt.Graphics;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JLabel;

import javax.swing.border.*;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileWriter;

import java.io.IOException;

import java.io.*;

import java.util.MissingResourceException;

 import java.lang.ArrayIndexOutOfBoundsException;
 
 import java.io.IOException;
 
 import java.awt.Desktop;
 
 import java.io.File;

import java.awt.event.*;

 import javax.swing.Popup;

import java.awt.event.MouseMotionListener;

import java.awt.Window;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.*;

import java.awt.Component;

import javax.swing.JFrame;

import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JTextField;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JPanel;

import javax.swing.BoxLayout;

import javax.swing.JComponent;

import java.awt.GridLayout;

import java.awt.FlowLayout;

import javax.swing.JOptionPane;

import java.lang.Object;

import java.util.StringTokenizer;

import java.lang.Math;

import javax.swing.JMenu;

import javax.swing.JMenuItem;

import javax.swing.JMenuBar;

import java.awt.Color;

import javax.swing.border.LineBorder;

import javax.swing.border.Border;

import javax.swing.JTextArea;

import javax.swing.JColorChooser;

import javax.swing.Icon;
import javax.swing.ImageIcon;

import java.lang.Exception;

import java.awt.Dimension;

import javax.swing.JSeparator;

import java.util.Random;

import javax.swing.SwingUtilities;

import javax.imageio.ImageIO;

import java.lang.NullPointerException;

import java.lang.NumberFormatException;

import java.lang.ArithmeticException;

import java.lang.RuntimeException;

import java.awt.Graphics;

import java.io.IOException;

import  java.awt.Image;

import javax.swing.JRadioButton;

import javax.swing.ButtonGroup;

import javax.swing.BorderFactory;

import javax.swing.border.*;

import javax.swing.JLabel;

import javax.swing.border.*;



public class pdfVIEWER extends JFrame
{
	
	
	
	public File selectedFile;	
	
	
	
	public pdfVIEWER()
	{
		
		
		
		
		JPanel OPTIONSmenu = new JPanel(); 
		JPanel LAYOUTBOXbox=new JPanel(); 
		
		
		
			OPTIONSmenu.setLayout(new FlowLayout(FlowLayout.CENTER));    // footer layout
			OPTIONSmenu.setBackground(Color.GRAY); 
			OPTIONSmenu.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
			
			
		 
		LAYOUTBOXbox.setLayout((new BoxLayout( LAYOUTBOXbox, BoxLayout.Y_AXIS)));  // add all layouts in one main layout ..... 
		LAYOUTBOXbox.setBackground(Color.WHITE); 
		LAYOUTBOXbox.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			
			
			
			
		JMenuBar KBMenuBar = new JMenuBar();
		
		JMenu MENU = new JMenu("MENU");
		MENU.setForeground(Color.BLACK);
		MENU.setBackground(Color.WHITE);
		
		JMenu ABOUT = new JMenu("ABOUT");
		ABOUT.setForeground(Color.BLACK);
		ABOUT.setBackground(Color.WHITE); 
		
		 KBMenuBar.add(MENU);
		 KBMenuBar.add(ABOUT);
		
		
		
		
		
					
			
				JLabel deciph=new JLabel("Choose .pdf file to open");
	  deciph.setBackground(Color.WHITE);
	   deciph.setForeground(Color.BLACK);
	 deciph.setEnabled(true);
    deciph.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =deciph.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           deciph.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          deciph.setForeground(oldcolor);
         }
      }
      );
	deciph.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
					
					
					
	JOptionPane.showMessageDialog(null," \n choose a .pdf file \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
			

					
		
						
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

		int returnValue = jfc.showOpenDialog(null);     

		if (returnValue == JFileChooser.APPROVE_OPTION) 
		{
			
			 selectedFile = jfc.getSelectedFile();
			
		//	System.out.println(selectedFile.getAbsolutePath());
			
		}
		
		
		
		String path=selectedFile.getAbsolutePath().toString();
		
		
		try
		{
    	
    
			
    if (selectedFile.getAbsolutePath().toString().endsWith(".pdf"))
    {
    
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + new File(path));
        
    }
    else 
	{
        Desktop desktop = Desktop.getDesktop();
        desktop.open(new File(path));
}
        
    } 
    	catch (IOException ex) 
    	{
    		
        	JOptionPane.showMessageDialog(null,"\n ERROR : \n [1] File requested not found or \n [2] You have choosen to open a non .pdf file  \n","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);// file not found error message ... 
        
    }
		
		
					
		 	
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	 MENU.add(deciph);	
	MENU.add(new JSeparator());//add a seperator line
			

	  

			//
	  
					
	JLabel EXIT=new JLabel("EXIT PROGRAM");
	  EXIT.setBackground(Color.WHITE);
	   EXIT.setForeground(Color.BLACK);
	 EXIT.setEnabled(true);
    EXIT.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =EXIT.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           EXIT.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
          EXIT.setForeground(oldcolor);
         }
      }
      );
	EXIT.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
				try
				{
					
	JOptionPane.showMessageDialog(null," \n Press the OK button \n in order for the program to terminate \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 	System.exit(0);
					
		 		    } 
    	catch (Exception ex) 
    	{
    		
		ex.printStackTrace();
		
    }
        }
		
      }
      );
	 MENU.add(EXIT);	
	MENU.add(new JSeparator());//add a seperator line
      
	  
	  //
	  
	  
	  
	    
      
      		JLabel programAuthor=new JLabel("author");
	  programAuthor.setBackground(Color.WHITE);
	  programAuthor.setForeground(Color.BLACK);
	 programAuthor.setEnabled(true);
   programAuthor.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programAuthor.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programAuthor.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programAuthor.setForeground(oldcolor);
         }
      }
      );
	programAuthor.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n program created by <tinoC23/> @ 08/2019 \n","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
	  ABOUT.add(new JSeparator());//add a seperator line
      ABOUT.add(programAuthor);
	  ABOUT.add(new JSeparator());//add a seperator line
      
	  
				
				 //
	  
	  
	    
      
      		JLabel programVsion=new JLabel("about ");
	  programVsion.setBackground(Color.WHITE);
	  programVsion.setForeground(Color.BLACK);
	 programVsion.setEnabled(true);
   programVsion.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =programVsion.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           programVsion.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         programVsion.setForeground(oldcolor);
         }
      }
      );
	programVsion.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n pdf viewer version 1.00 @ 08/2019 \n ;-) \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(programVsion);
	  ABOUT.add(new JSeparator()); 
      
	  
	  
	  //
	  
	  
	  	JLabel technologyUSED=new JLabel("technologies used");
	  technologyUSED.setBackground(Color.WHITE);
	  technologyUSED.setForeground(Color.BLACK);
	 technologyUSED.setEnabled(true);
   technologyUSED.addMouseListener(new MouseAdapter() 
	{
         Color oldcolor =technologyUSED.getForeground();
         public void mouseEntered(MouseEvent me) 
		{
			Color c=Color.orange;
           technologyUSED.setForeground(c);
         }
         public void mouseExited(MouseEvent me) 
	 {
         technologyUSED.setForeground(oldcolor);
         }
      }
      );
	technologyUSED.addMouseListener(new MouseAdapter() 
	{
		
		 public void mousePressed(MouseEvent e)
		 	{
		 		
	JOptionPane.showMessageDialog(null," \n Technologies : \n 1) Java JDK version 8 \n 2) SciTE text editor version 4 \n ;-) \n ","INFORMATION MESSAGE",JOptionPane.INFORMATION_MESSAGE);
        
		 		
        }
		
      }
      );
      ABOUT.add(technologyUSED);
	  ABOUT.add(new JSeparator()); 
		
		
		
		
		
			  OPTIONSmenu.add(KBMenuBar);	

		
		
		
		LAYOUTBOXbox.add(OPTIONSmenu);
		     
			 
			 
		
		JFrame frame=new JFrame(" PDF VIEWER V1.00");
		frame.add(LAYOUTBOXbox);
		frame.setDefaultLookAndFeelDecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.pack();
		
			
			
			
		
	}
	
	
	
	public static void main(String [] pdfVIEWER)
	{
		
		new pdfVIEWER();
		
	}
	
	
}














