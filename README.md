# Diligent-Deliveries

In the Diligent Deliveries project, you will model the daily routine of a delivery rider at a logistics company. The goal is to track the riders' performance and determine who deserves a bonus based on successful deliveries.

You will work with the following entities:
1. Address: A class representing a customer's address, including zip code, street address, and name.
2. Parcel: Represents a package with an ID and an associated Address. It has a delivery method that returns a boolean indicating the success of the delivery, with a minimum success rate of 50%.
3. Rider: Represents a delivery rider with an ID, name, and re-attempt preference. Riders can allocate a maximum of five re-attempts across different locations.
4. Report: At the end of the day, each Rider will file a report containing the number of successful deliveries and the remaining re-attempts.

The focus of the project is on creating model classes, implementing classes with behavior and state, and working with random numbers. The Rider class will be the most complex, as it requires implementing a stateful behavior.

You will simulate one day of deliveries with three riders, each employing different re-attempt strategies. The application will display the winning riders who receive the bonus based on their delivery performance.

Through this project, you will gain experience in creating simple model classes, implementing behavior and state in classes, and working with random numbers to simulate real-world scenarios.