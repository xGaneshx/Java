import java.io.*;
public class car
{
int modelYear;
String modelName;

public car(int year, String name) {
modelYear = year;
modelName = name;
}
public static void main(String[] args) {
car myCar = new car(1969, "Mustang");
System.out.println(myCar.modelYear +" "+ myCar.modelName);
}
}