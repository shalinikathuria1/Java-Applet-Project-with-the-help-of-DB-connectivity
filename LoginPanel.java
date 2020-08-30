import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class LoginPanel extends Frame implements ActionListener
{
Label l1, l2, l3;
TextField tf1,tf2;
 Button btn1;
  public LoginPanel()
 {
setTitle("Admin Login Form ");
setVisible(true);
setSize(800, 800);
setLayout(null);
 l1 = new Label("Admin Login Form");
 l1.setFont(new Font("Serif", Font.BOLD, 30));
 l2 = new Label("Enter Name:");
l3 = new Label("Enter Password:");
 tf1 = new TextField();
tf2=new TextField();
 btn1 = new Button("Login");
 l1.setBounds(100, 30, 400, 30);
 l2.setBounds(80, 70, 200, 30);
 l3.setBounds(80, 110, 200, 30);
 tf1.setBounds(300, 70, 200, 30);
tf2.setBounds(300,140, 210, 30);

 btn1.setBounds(150, 160, 100, 30);
add(l1);
add(l2);
 add(tf1);
add(l3);
 add(tf2);

add(btn1);
btn1.addActionListener(this);
 }
public void actionPerformed(ActionEvent e)
 {
new LoginPanelMenu();	
  showData();
}
 public void showData()
{
Frame f1 = new Frame();
Label l, l0;
String str1 = tf1.getText();
 String str2 = new String();
try
 {
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con = DriverManager.getConnection("Jdbc:Odbc:logindsn");
 PreparedStatement ps = con.prepareStatement("select name from reg where name=? and pass=?");
 ps.setString(1, str1);
 ps.setString(2, str2);
            ResultSet rs = ps.executeQuery();
 if (rs.next())
 {
 f1.setVisible(true);
 f1.setSize(600, 600);
   f1.setLayout(null);
  l = new Label();
   l0 = new Label("you are succefully logged in..");
l0.setFont(new Font("Serif", Font.BOLD, 30));
 l.setBounds(60, 50, 400, 30);
 l0.setBounds(60, 100, 400, 40);
 f1.add(l);
    f1.add(l0);
 l.setText("hello " + rs.getString(1));
 l.setFont(new Font("Serif", Font.BOLD, 30));
}
 else
{
System.out.println("Incorrect name or password..Try Again ");
}
 }
catch (Exception ex)
{
System.out.println(ex);
}
 }
 public static void main(String arr[])
{
LoginPanel obj=new LoginPanel();
obj.showData();
}
}
