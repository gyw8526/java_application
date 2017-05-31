package termProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;
import java.io.*;
import javax.swing.table.*;
import javax.swing.tree.*;
import javax.swing.border.*;

public class playGame extends JFrame implements ActionListener{

	JButton b[] = new JButton[20];
	JButton clera;
	JPanel panel,Card_panel;
	ImageIcon img[] = new ImageIcon[10];
	ImageIcon imgDefault, blank;
	JMenuBar manuBar;
	JMenu manu_0;
	JMenuItem g_new,g_exit;
	JMenu menu_2;
	JMenuItem v_Ranks;
	
	String ImageIcon[] = {};
	
	String tmpStr[] = {"a","b","c","d","e","f","g","h","i","j"};
	int randInt[][] = {};
	
	boolean Card_Changed = false;
	int count = 0;
	int GameCount = 0;
	int removeCount = 0;
	String OpenCard[] = new String[2];
	Random r = new Random();
	int nansu[] = new int[20];
	int tmp[] = {100,200};
	long firstTime,lastTime;
	
	public void ProjectGame()
	{
		UIManager.put("swing.boldMetal",Boolean.FALSE);
		
		setTitle("같은 카드 찾기");
		setResizable(false);
		setBounds(170,58,400,560);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		makeComponent();
		makeMenuBar();
		
		getContentPane().add(panel,BorderLayout.CENTER);
	}
	
	public void makeComponent()
	{
		Card_panel = new JPanel();
		Card_panel.setLayout(new GridLayout(4,5));
		Card_panel.setFont(new Font("Dialog.plain",0,12));
		Card_panel.setBackground(new Color(-1677216));
		Card_panel.setBounds(15,15,360,480);
		
		imgDefault = new ImageIcon("저장해놓은 이미지");
		blank = new ImageIcon("이미지");
		int rnk = r.nextInt(15);
		
		for(int i =0;i<b.length;i++){
			b[i] = new JButton(Integer.toString(4,5));
			b[i].setBackground(Color.black);
			b[i].setIcon(imgDefault);
			b[i].setSize(80,120);
			b[i].setMargin(new Insets(0,0,0,0));
			b[i].addActionListener(this);
		}
		for(int i = 0; i<20;i++){
			Card_panel.add(b[randInt[rnk][i]]);
		}	//랜덤카드배치
		for(int i = 0; i<img.length;i++){
			img[i]=new ImageIcon(imgicon[i]);
		}
		panel.add(Card_panel);
		firstTime = System.currentTimeMillis();
	}
	public void makeMenuBar(){
		menuBar = new JMenuBar();
		menu_O = new JMenu("게임");
		g_exit = new JMenuItem("종료");
		g_new = new JMenuItem("새 게임");
		menu_O.add(g_new);
		menu_O.add(g_exit);
		menuBar.add(menu_O);
		
	}
	public void actionPerformed(ActionEvent e){
		
	}
}
