Bank system.
The user may have one or more bank accounts (deposit, credit). 
The user can make bank transfers, pay bills, display general information (account balance, recent transactions, expiration date). 
For Credit Accounts, information on the credit limit, current debt and credit rate is also available. 
For deposit accounts - deposit amount, rate, replenishment history.
The user can submit a request to open a credit account, if one is missing. The administrator confirms the opening of the account, taking into account the size of the deposit and the validity period.

Requirements:
- To work with DataBase - MySql
- Java version 8+
- Maven


How to install:
1. Clone project
2. Run createSchema.sql from resources/db/ folder
3. Run fillSchema.sql from resources/db/ folder
4. Go to webapp/META-INF/context.xml and and change database user and password
5. Run:
In terminal: mvn clean tomcat7:run
OR
Add configuration: clean package tomcat7:run
Go to the link: http://localhost:8888/bank-system/

Business Logic: 
1. User can login. - LoginCommand
2. User can change language. - LanguageCommand
3. If user does not have an account he can create one. - RegisterCommand
4. Homepage is visible to everyone. - HomePageCommand (GET)
5. Contact Page is visible to everyone. - ContactCommand (GET)
6. User can view his existing accounts.  - AccountCommand (GET)
7. User can add new deposit accounts and send a request for credit account creation. - AccountCommand (POST)
8. User can pay for services. - PaymentCommand (POST)
9. Admin can view user requests.  - AdminCommand
10. Admin can approve or decline user requests. - AdminCommand
11. Admin can send user notifications. - AdminCommand
12. User can reset password. - ResetPasswordCommand (POST)
13. User can logout.