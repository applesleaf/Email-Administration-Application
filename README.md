# Email-Administration-Application

The given code represents a simple email application in Java. It defines a class called Email within the emailApp package. The purpose of this class is to create and manage email accounts for users.

Here's a breakdown of what the code does:

It imports the java.util package to use the Scanner class for user input.

The Email class contains several private instance variables such as firstName, lastName, password, defaultPasswordLength, department, mailboxCapacity, email, alternateEmail, and companyName. These variables hold information related to the email account.

The class has a constructor that takes the user's first name and last name as parameters. It initializes the firstName and lastName variables with the provided values. It also prints a message indicating that an email account has been created for the user.

Inside the constructor, the setdepartment() method is called. It prompts the user to enter a department code from the following list:

1 for Sales
2 for Development
3 for Accounting
0 for none
The method returns the corresponding department name based on the user's choice.

The constructor then calls the randomPassword() method, which generates a random password of length defaultPasswordLength characters. The generated password is assigned to the password variable. The password is printed to the console.

Next, the elements such as firstName, lastName, department, and companyName are combined to generate the email address. The email address is stored in the email variable and printed to the console.

The class also provides setter and getter methods for modifying and retrieving the mailbox capacity (setMailboxCapacity() and getMailBoxCapacity()), alternate email address (setAlternateEmail() and getAlternateEmail()), and password (changePassword() and getchangePassoword()).

Overall, this code allows users to create email accounts by providing their personal information, generates a random password, and sets various properties associated with the email account.
