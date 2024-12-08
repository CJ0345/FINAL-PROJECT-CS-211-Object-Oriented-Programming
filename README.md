# Appliance Shop Management System
#### *CS211 – OBJECT ORIENTED PROGRAMMING*

## I. PROJECT OVERVIEW
<p align="justify"> &nbsp;&nbsp;&nbsp;&nbsp; The Appliance Shop Management System is a comprehensive console-based application specifically designed to optimize the operations of an appliance store. This application aims to provide a seamless and efficient way to manage various aspects of the store, from viewing and adding appliances to processing orders and tracking inventory. By automating these processes, the system addresses common challenges faced by appliance store owners, such as inventory mismanagement, order processing errors, and time-consuming manual tasks.</p>

## II. HOW OOP PRINCIPLES WERE APPLIED
### Encapsulation:
<p align="justify"> &nbsp;&nbsp;&nbsp;&nbsp; The Shop class encapsulates methods related to store operations, such as viewing, adding, and ordering appliances. By using private fields and public methods, we control access to data, ensuring that only authorized methods can modify it.</p>

### Inheritance:
<p align="justify"> &nbsp;&nbsp;&nbsp;&nbsp; I utilize inheritance to construct subclasses for several kinds of appliances. Classes such as air conditioner, microwave, refrigerator, and television, for example, derive from the Appliances superclass. This not only encourages code reuse, but also defines a clear hierarchical relationship among the many appliance kinds.</p>

### Polymorphism:
<p align="justify"> &nbsp;&nbsp;&nbsp;&nbsp; Method overriding allows subclasses to provide specific implementations for methods. For example, the print method in each appliance subclass overrides the print method in the Appliances superclass to display appliance-specific information, making the system more flexible and dynamic.</p>

### Abstraction:

<p align="justify"> &nbsp;&nbsp;&nbsp;&nbsp; Abstract classes and interfaces hide implementation details while exposing essential functionalities. The Appliances superclass serves as an abstract class, providing a template for specific appliance subclasses, thus simplifying the overall system design and enhancing readability.</p>

## III.  SUSTAINABLE DEVELOPMENT GOAL (SDG)
<p align="justify"> &nbsp;&nbsp;&nbsp;&nbsp; The Appliance Shop Management System contributes to Sustainable Development Goal (SDG) 8: Decent Work and Economic Growth. By digitizing the store’s operations, the system brings a traditional store into the modern digital age, enhancing efficiency, reducing errors, and streamlining workflow. Improved inventory management and order processing boost the store’s economic activity, facilitating better customer engagement and driving revenue, which contributes positively to economic growth. Moreover, the project promotes technological literacy among store owners and their staff, providing the skills and tools necessary for modern retail management. This fosters innovation and growth within the business. The system’s robust error handling and secure data management build user trust, ensuring the reliability and integrity of operations. This trust is crucial for sustained economic participation, as it reassures customers and business owners alike of the system's dependability.</p>

## IV. INSTRUCTIONS FOR RUNNING THE PROGRAM

Here’s how to get the Appliance Shop Management System up and running:

Certainly! Here's the detailed guide for running the Appliance Shop Management System:

### 1. **Run the program.**
   - Make sure that the program is working and doesn’t have any errors.

### 2. **Enter your command choice.**
   - On the output, the console has many options; these include:

   • **View Appliances**
     - When you choose this option, the system will display a list of all the available appliances in the store. The list will be sorted and include details such as the appliance name and quantity. If the inventory is empty, it will notify you.

   • **Add Appliances**
     - This option allows you to add new appliances to the inventory. You will be prompted to select the type of appliance (Aircon, Microwave, Refrigerator, or Television). Once selected, the appliance will be added to the inventory, and a banner “Successfully added” will appear.

   • **Order Appliances**
     - Choosing this option lets you place an order for appliances. The system will display the current inventory, allowing you to select the appliance and specify the quantity you wish to order. If the order is valid, it will update the inventory accordingly and confirm the successful order placement.

   • **View Ordered Appliances**
     - This option will display all the ordered appliances along with their details. It is useful for tracking what has been ordered and reviewing past transactions. If no orders have been placed, it will notify you.

   • **Exit**
     - Selecting this option will exit the program. The console will close, and you can restart the program as needed.

### 3. **Exit the console.**
   - When you choose the exit option, this will automatically exit your console program and allow you to run it again if needed.


