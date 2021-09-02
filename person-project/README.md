Person Project

This is a sample project to showcase the features of Java 8. The module consists of below important classes

* Person - A pojo classes with 5 members name, age, gender, place and salary
* Main - This class contains a main method, that can be used to run and view the sorted/processed list of persons based on various pre-defined conditions.
* Respective unit tests based on JUnit 3 and above 


Instructions to set-up/run this project in local :-

Open eclipse

Import the project as a Java project.

Navigate to the Main class > open in editor > Run main() method

The output will be displayed in the console along with the appropriate headings of that specific list.

Sample output is given below for reference :

<code>
============================ List of all Persons ============================

Person [age=38, name=Francis, location=Chennai, gender=Male, salary=10000]
Person [age=40, name=Akhil, location=Bangalore, gender=Male, salary=42000]
Person [age=29, name=Praveen, location=Bangalore, gender=Male, salary=15000]
Person [age=31, name=Venkat, location=Hyderabad, gender=Male, salary=36500]
Person [age=31, name=Reena, location=Bangalore, gender=Female, salary=36000]
Person [age=23, name=Michael, location=Hyderabad, gender=Male, salary=37500]
Person [age=30, name=Tony, location=Chennai, gender=Male, salary=12000]
Person [age=45, name=Modi, location=Chennai, gender=Male, salary=45000]
Person [age=36, name=Rekha, location=Bangalore, gender=Female, salary=42000]


======================== Persons sorted by Location ========================

Person [age=40, name=Akhil, location=Bangalore, gender=Male, salary=42000]
Person [age=29, name=Praveen, location=Bangalore, gender=Male, salary=15000]
Person [age=31, name=Reena, location=Bangalore, gender=Female, salary=36000]
Person [age=36, name=Rekha, location=Bangalore, gender=Female, salary=42000]
Person [age=38, name=Francis, location=Chennai, gender=Male, salary=10000]
Person [age=30, name=Tony, location=Chennai, gender=Male, salary=12000]
Person [age=45, name=Modi, location=Chennai, gender=Male, salary=45000]
Person [age=31, name=Venkat, location=Hyderabad, gender=Male, salary=36500]
Person [age=23, name=Michael, location=Hyderabad, gender=Male, salary=37500]

============================ Persons Age >= 30 =============================

Person [age=38, name=Francis, location=Chennai, gender=Male, salary=10000]
Person [age=40, name=Akhil, location=Bangalore, gender=Male, salary=42000]
Person [age=31, name=Venkat, location=Hyderabad, gender=Male, salary=36500]
Person [age=31, name=Reena, location=Bangalore, gender=Female, salary=36000]
Person [age=30, name=Tony, location=Chennai, gender=Male, salary=12000]
Person [age=45, name=Modi, location=Chennai, gender=Male, salary=45000]
Person [age=36, name=Rekha, location=Bangalore, gender=Female, salary=42000]

============================ Persons Salary >= 35000 =======================

Person [age=40, name=Akhil, location=Bangalore, gender=Male, salary=42000]
Person [age=31, name=Venkat, location=Hyderabad, gender=Male, salary=36500]
Person [age=31, name=Reena, location=Bangalore, gender=Female, salary=36000]
Person [age=23, name=Michael, location=Hyderabad, gender=Male, salary=37500]
Person [age=45, name=Modi, location=Chennai, gender=Male, salary=45000]
Person [age=36, name=Rekha, location=Bangalore, gender=Female, salary=42000]

===================== Persons Salary >= 35000 and Age >= 30
 and Location = Bangalore and Gender = Female =============================

Person [age=31, name=Reena, location=Bangalore, gender=Female, salary=36000]
Person [age=36, name=Rekha, location=Bangalore, gender=Female, salary=42000]
</code>


Pre-requisites :-
Below softwares to be installed and available/recognised by the OS at the system/class path.
Java 8 i.e. JDK 8 / JRE 8
Eclipse