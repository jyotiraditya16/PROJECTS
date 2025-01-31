# PROJECTS

Description of AffineCipher
                   
We made the program using three methods: -
public static void main (String [] args) {}
public static String encrypt (String plaintext) {}
public static String decrypt (String ciphertext) {}

Function of main method: -
 In Input block, taking a paraphrase from the user and storing it in a String named “plaintext”.
In Output block, storing the return value “encrypt(plaintext)” in a String “ciphertext” and “decrypt(ciphertext)” in a String “decrypted”. And then the printing statements.


Function of Encryption block: -
We use a method string encrypt to enter the plain text, initialised the multiplicative key as “k1=7” and additive key as “k2=2” then used a for loop and if else, for the identification of case of plaintext(“character_check”) , introduced a variable k3 to store the value of characters in integer ,Using the formula according to the question , “ C =  (P x k1 x k2)mod 26” . At last “return new String (ciphertext)”.


Description of Decryption block: -
We use a method string decrypt to extract the plain text from the ciphertext, again initialised the multiplicative key as “k1=7” and additive key as “k2=2”. Here we introduce a new variable named “k1_inverse” for the multiplicative and additive inverse ,  then used a for loop and if else for the identification of case of ciphertext(“character_check”)  , introduced a variable k3 to store the value of characters in integer .Using the formula according to the question , “ P=((C-k2) x k^-1)mod26” . At last “return new String (plaintext)”. 
OUTPUTS:


	DESCRIPTION OF THE PROJECT: EMPLOYEE MANAGEMENT SYSTEM

In the project, first I have created a class Employee and then taken the instance variables. Then, I have initialized the variables through the instance method-  
public Employee(String name, int empId, double salary, Date hireDate, String jobPosition, String contactNumber, Address address)
Then as per question I have created another class – 
class Date
With the help of this class I have initialised the value of the Date in the format- DD/MM/YYYY. Now, another class Address is being made to get the address of the employee. The class have the below initials-
class Address
Now, ‘main’ method is made in class Test where I have given all the information required by the Company. It has the initials- 
class Test


OUTPUT:
Employees with job position 'manager':
Name: Employee 500
Employee ID: 1500
Salary: 599000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 500, ITER COLLEGE, ODISHA, INDIA
-----------------------
Name: Employee 499
Employee ID: 1499
Salary: 598000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 499, ITER COLLEGE, ODISHA, INDIA
-----------------------
Name: Employee 498
Employee ID: 1498
Salary: 597000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 498, ITER COLLEGE, ODISHA, INDIA
-----------------------
Name: Employee 497
Employee ID: 1497
Salary: 596000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 497, ITER COLLEGE, ODISHA, INDIA
-----------------------
Name: Employee 496
Employee ID: 1496
Salary: 595000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 496, ITER COLLEGE, ODISHA, INDIA
-----------------------
Name: Employee 495
Employee ID: 1495
Salary: 594000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 495, ITER COLLEGE, ODISHA, INDIA
-----------------------
Name: Employee 494
Employee ID: 1494
Salary: 593000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 494, ITER COLLEGE, ODISHA, INDIA
-----------------------
Name: Employee 493
Employee ID: 1493
Salary: 592000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 493, ITER COLLEGE, ODISHA, INDIA
-----------------------
Name: Employee 492
Employee ID: 1492
Salary: 591000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 492, ITER COLLEGE, ODISHA, INDIA
-----------------------
Name: Employee 491
Employee ID: 1491
Salary: 590000.0
Hire Date: 15-6-2022
Job Position: Manager
Contact Number: +91 123-456-7890
Address: Street 491, ITER COLLEGE, ODISHA, INDIA
-----------------------

and so on.




