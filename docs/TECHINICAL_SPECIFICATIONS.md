---
title: RPOS System Technical Specifications
date: September 20, 2018
urlcolor: blue
---
\newpage
# RPOS System

The RPOS System is developed with Java, its Swing GUI library, and MySQL.
The system is responsible for managing bills and stocks in a single lane supermarket.

**NOTE**: Any feature marked as *[FUTURE]* is planned for implementation but might not be. Other features have priority and must be implemented before deadline.

[*FUTURE*] Add multi-lane support.

# Products

Any product in the supermarket must be registered in the database. A product has the following information associated with it:

1. Name
2. [*FUTURE*] Supplier
3. Barcode (see barcodes section)
4. [*FUTURE*] Available quantity

**Edit**: Products were renamed to *items*.

## Barcodes

This POS system should fully support barcodes in the [UPS format][1] (1D barcodes). [A barcode in the UPS format consists of 12 digits][1].

Any 1D barcode scanner will work with this system (barcode scanners [work like a keyboard][2] so no actual implementation of this support is required). However, a laser barcode scanner is recommended.

## [*FUTURE*] Suppliers

Any product supplier is registered in the database with the following information:

1. Name
2. Phone

# Users

There are two privilages for users: admins, and cashiers.

[*FUTURE*] A single user with admin privilage must exist after the setup (its username and password are as specified in the setup process).

Any cashier must have an account on the system for creating bills and tracking sales.

A user with admin privilage is able to do the following:

1. [*FUTURE*] Edit items in stock (delete, add, or update).
2. [*FUTURE*] Edit users with cashier privilage.
3. [*FUTURE*] See overall sales.

A user with cashier privilage is able to do the following:

1. Create bills.
2. [*FUTURE*] See sales related to the users account.
3. [*FUTURE*] Search for information about products.

**IMPLEMENTATION DETAIL**: User's passwords must be encrypted using a [proper hashing algorithm][3]. Use `char[]` in java and clear its content after authenticating[][4].

# GUI

## Login Screen

The login screen is the first screen that appears. it asks for user's username and password.

If the provided information is incorrect, the error that will be reported should be `Invalid username or password.

**Justification**: do not tell the user which of the information is incorrect! this is for security so that no one can guess a valid username or a password.

After the login screen the user is directed to the respective screen according to the user's privilage, admin or cashier.

## Main Header

This is the common interface between users with admin privilage and users with cashier privilage, and represents the header in their screens.

It contains the system's name, username, logout button and help button.

## Cashier Panel

the cashier screen is a dashboard with three panels. only a single panel is displayed at any instance of time.

The three panels are as follows:

1. Create Bill Panel
2. [*FUTURE*] Sales Panel
3. [*FUTURE*] Product Information Panel

The main cashier screen is divided into three sections:

1. Add item section
2. Cart section
3. Information section

### Add Item Section

This section includes: a search bar (functionality described below), an items list to display results, three fields: price field, quantity field, total field.

The last two fields must not be editable.

The search bar is able to search an item by its barcode or name. This is inferred from the typed search term (a 12-digit number is considered a barcode thus identifies a single product anything else is a name). The result is updated in real time as the user types in his search term.

The action performed by this search bar (when ENTER key is pressed) is to add one item from the first item in the results (if any) list to the cart.

If possible the search bar action should trigger automatically when a barcode scanner is used.

**IMPLEMENTATION DETAIL**: The automatic triggering can be done by monitoring the text entered by the user, if a jump of 12 characters occurs the action is triggered.

**EDIT**: Adding an item immediately after being scanned is supported but it does not clear the search field so the user must clear it by theirself. It's somewhat tricky to clear the field while in handling an event registered to the field itself, so it was left. but searching by barcode still works.

### Cart Section

This section includes: a table view of the cart items (item name, unit price, quantity, total price), two buttons for deleting and updating items.

The buttons act on the selected row in the table. Update button will remove the item from the table and insert its information to the add item section.

### Information Section

This section includes: total, recieved, and change money, two buttons: print and done.

Total and change amounts of money should be not editable and should update automatically as items are added to the cart.

The print button sends a print command to the printer to print out the bill. the done button registers the bill in the database ([*FUTURE*]), then clears the cart to enable the user to start creating a new bill.

**IMPLEMETATION DETAIL**: The done button action should be performed in the order specified to not lose data and enable recovering from errors like not being able to commit change to the database.

The print button should automatically trigger the done button. done button should warn the user that they did not print the bill.

## [*FUTURE*]  Admin Panel

This panel enables the admin to manage users and products (create, retrieve, update and delete) registered in the system.

**Not fully specified yet.**

[1]: https://www.barcodesinc.com/faq/?nav=ftr#what
	"What is a UPC barcode?"
[2]: https://www.barcodesinc.com/faq/?nav=ftr#barcode-scanning
	"Barcode Scanning | Do I need any special software to use a scanner?"
[3]: https://stackoverflow.com/a/2861125
	"How can I hash a password in Java?"
[4]: https://stackoverflow.com/a/8881376
	"Why is char[] preferred over String for passwords?"
