# java-queue-application
Project Description: add, remove, and view tasks in linked list queue. The Task class in the model package creates, modifies, and extracts information from a task. The TaskQueueService class in the service package allows tasks to be added, removed, and viewed from a queue. Finally, the QueueApp class in the app package creates a command line interface for the user to directly interact with application.

Instructions to Compile: javac -d bin src/app/QueueApp.java
Instructions to Run: java -cp bin app.QueueApp
Notes: I chose to use Linked List rather than array because the number of tasks that would be added to the queue is not predetermined. Although a linked list takes up more space, it is more efficient for this application since it involves frequently removing and adding elements. If I were to use an array, I would need to shift multiple elements each time a task is added and removed. 
