class Mobike
{
String bikeno;
String cname;
int days;
int charge;
void input()
{
System.out.println("Enter the bike number");
bikeno=new java.util.Scanner(System.in).nextLine();
System.out.println("Enter the Customer name");
cname=new java.util.Scanner(System.in).nextLine();
System.out.println("Enter the number of days");
days=new java.util.Scanner(System.in).nextInt();
}
void compute()
{
if(days<=5)
{
charge=500*days;
}
else if(days>=5&&days<=10)
{
charge=2500+400*(days-5);
}
else if(days>10)

 {
charge=2500+2000+200*(days-10);
}
}
void display()
{
System.out.print("bikeno"+"\t\t"+"cname"+"\t"+"days"+"\t"+"charge");
System.out.println(" ");
System.out.print(bikeno+"\t");
System.out.print(cname+"\t");
System.out.print(days+"\t");
System.out.print(charge+"\t");
}
public static void main(String[] args)
{
Mobike e1=new Mobike();
e1.input();
e1.compute();
e1.display();
}
}

