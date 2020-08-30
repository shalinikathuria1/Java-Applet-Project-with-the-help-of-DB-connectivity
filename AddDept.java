import java.awt.*;
import java.awt.event.*;
class AddDept extends Frame
{
TextField name,unit;
Button b1,b2;
public AddDept()
 {
setLayout(new FlowLayout());
this.setLayout(null);
Label n=new Label("Name:",Label.CENTER);
Label u=new Label("Unit:",Label.CENTER);
name=new TextField(20);
unit=new TextField(20);
b1=new Button("save");
b2=new Button("cancel");
this.add(n);
this.add(name);
this.add(u);
this.add(unit);
this.add(b1);
this.add(b2);
 n.setBounds(70,90,90,60);
 u.setBounds(70,130,90,60);
 name.setBounds(200,100,90,20);
 unit.setBounds(200,140,90,20);
  b1.setBounds(100,260,70,40);
 b2.setBounds(180,260,70,40);
 }
public static void main(String args[])
{
AddDept obj=new AddDept();
obj.setVisible(true);
obj.setSize(400,400);
 obj.setTitle("inside in admin menu bar");
 }
}