import java.awt.*;
import java.awt.event.*;
class AddEmp1 extends Frame
{
 TextField name,cadre,dept,mobileno;
 Button b1,b2;
 public AddEmp1()
{
setSize(700, 700);
setLayout(new FlowLayout());
this.setLayout(null);
Label n=new Label("Name:",Label.CENTER);
Label c=new Label("Cadre:",Label.CENTER);
Label d=new Label("Department:",Label.CENTER);
Label m=new Label("Mobileno:",Label.CENTER);
 name=new TextField(20);
 cadre=new TextField(20);
 dept=new TextField(20);
 mobileno=new TextField(20);
 b1=new Button("save");
 b2=new Button("cancel");
 this.add(n);
 this.add(name);
 this.add(c);
this.add(cadre);
this.add(d);
this.add(dept);
this.add(m);
this.add(mobileno);
this.add(b1);
this.add(b2);
 n.setBounds(80,70,200,30);
 c.setBounds(80,120,200,30);
d.setBounds(80, 150, 200, 30);  
m.setBounds(80, 170, 200, 30);    
name.setBounds(300,70,200,30);
 cadre.setBounds(300,110,200,20);
dept.setBounds(300, 230, 200, 30);  
mobileno.setBounds(300, 270, 200, 30);  
  b1.setBounds(100,260,70,40);
 b2.setBounds(180,260,70,40);
 }
 public static void main(String args[])
 {
 AddEmp1 obj=new AddEmp1();
 obj.setVisible(true);
 obj.setSize(400,400);
obj.setTitle("inside in admin menu bar");
 }
}