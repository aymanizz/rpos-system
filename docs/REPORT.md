---
title: RPOS System Project Report
date: September 24, 2018
---
\newpage
# 1 Technical Requirements

- Java 8 or higher
- MySQL

# 2 Prerun Setup

You have to create a database for the system.

Go to `src/main/database/init.sql` and run the file (or copy paste its content to mysql), this will create a database named `rposdb` and a user named `javadbc` in the `localhost` with password `0000`.

This step also creates a user in the system named `admin` with password `0000`, use it to login to the system.

# 3 Future Work

## 3.1 Refactoring

- `BillPanel` class is huge, tightly coupled and implements too much functionality (breaks
the single responsibility principle), this is largely due to the deadline, it had to be done quickly and with no prior design. It should be refactored as follows:
	- Text fields validation is done inside the class, this could be moved into it's own class.
	Create a class that extends a `JTextField` and extend it to provide validation (like a custom
	`PositiveIntegerField` that is aware of its state (valid or not) and converts its value to
	integer on request).
	- The bill panel has three panels: items, cart, and information panels. Each of these could be
	implemented as a standalone panel.
	- The `itemsList` and `cartTable` could be their own classes which extend `JList` and
	`JTable`
	respectively, or atLeast implement a `ListModel` and a `TableModel` to customize their
	functionality in an encapsulated and abstracted way. currently the way they (and their
	events)  are implemented (and handled) is adhoc and inflexible.
- `DBController` class does not abstract the connection in a proper way. This is evident in the
model classes (`UserModel` and `ItemModel`). This can be fixed by executing the statements in
the controller instead of in the model classes.

## 3.2 Saving bills in the database

Currently the bill model is not implemented (i.e, bills are not tracked nor stored in
the database). Once a bill is cleared all its data is lost for good.
	
## 3.3 Implementing future functionality specified in the technical specifications

This includes but is not limited to:

- Implementing the admin frame (dashboard).
- Creating the rest of the cashier dashboard (sales info, items search).

## 3.4 Extending printing functionality

Current print function only prints the table this should print
the whole bill (with the information included and a header)
instead.
