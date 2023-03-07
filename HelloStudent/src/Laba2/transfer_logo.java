package Laba2;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class transfer_logo implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JComboBox box = (JComboBox) e.getSource();
		String item = (String) box.getSelectedItem();
	
		if (item=="Переместить логотип УГАТУ в верхний правый угол") 
		{
			start.student.getIcon().setBounds(350,20, 250,150);
			
		}
		
		if (item=="Переместить логотип УГАТУ в середину") 
		{
			start.student.getIcon().setBounds(180,20, 250,150);
		}
		
		if (item=="Переместить логотип УГАТУ в левый верхний угол") 
		{
			start.student.getIcon().setBounds(10,20, 250,150);
		}
		

		}
	}


