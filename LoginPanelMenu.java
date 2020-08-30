import java.awt.*;
import java.awt.event.*;
 public class LoginPanelMenu extends Frame implements ActionListener
{
 Menu admin, suggestion,logout,changepassword;
public LoginPanelMenu()
{			
MenuBar mb = new MenuBar();		        
setMenuBar(mb);				
 admin = new Menu("Admin Menu");		 
 suggestion = new Menu("Suggestion Menu");
 logout=new Menu("Logout Menu");
 changepassword=new Menu("Change password Menu");	
 mb.add(admin);				
  mb.add(suggestion);
 mb.add(logout);
 mb.add(changepassword);
 admin.addActionListener(this);		
 suggestion.addActionListener(this);
  logout.addActionListener(this);
 changepassword.addActionListener(this);
 admin.add(new MenuItem("Add Department"));
 admin.add(new MenuItem("Add Employee"));
admin.add(new MenuItem("Add workers"));
 suggestion.add(new MenuItem("view suggestion"));
suggestion.add(new MenuItem("Delete suggestion"));
logout.add(new MenuItem("logout this"));
 changepassword.add(new MenuItem(" "));
setTitle(" Menu Bar");		
 setSize(300, 300);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
 String str = e.getActionCommand();		
System.out.println("You selected " + str);
}
 public static void main(String args[])
{
 new LoginPanelMenu();
  }
}