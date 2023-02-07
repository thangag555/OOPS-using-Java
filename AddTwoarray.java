import java.util.Scanner;

class AddTwoarray
{
public static void main(String args[])
{
int row, column,i,j;
Scanner s= new Scanner(System.in);

System.out.println("Enter the number of rows");
row = s.nextInt();

System.out.println("Enter the number columns");
column = s.nextInt();

int row2, column2;

System.out.println("Enter the number of rows2");
row2 = s.nextInt();

System.out.println("Enter the number columns2");
column2 = s.nextInt();


int a[][] = new int[row][column];
int b[][] = new int[row2][column2];
int c[][] = new int[row][column];


if(row==row2 && column==column2)
{
System.out.println("Enter the elements of a");

for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < column ;j++ )
{
a[i][j] = s.nextInt();
}
}

System.out.println("a array");

for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < column ;j++ )
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}



System.out.println("Enter the elements of b");

for ( i= 0 ; i < row ; i++ )
{
for ( j= 0 ; j < column ;j++ )
{
b[i][j] = s.nextInt();
}
}
System.out.println("b array");

for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < column ;j++ )
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}



for ( i= 0 ; i < row ; i++ )
{
for ( j= 0 ; j < column ;j++ )
{
c[i][j] = a[i][j] + b[i][j] ; 
}
}

System.out.println("Answer");

for ( i= 0 ; i < row ; i++ )
{ 
for ( j= 0 ; j < column;j++ )
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}
}

else
{
System.out.print("not possible");
}

}
}