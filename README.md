#  Project Title

This is a temperature converter program. Users should be able to convert the temperature units in Kelvin, Celsius, Fahrenheit, and Rankine.

## How to run the program

Please check the code in the flexion repository. The GitHub repository is hooked up with CircleCI build engine. 
Once the code check-in is detected, a new build is created by the CircleCI and artifact(in our case), a jar file is produced.
To view and download the artifact, please click on the "Artifacts" tab on the CircleCI. 

Download the artifact ( kote-1.0-SNAPSHOT.jar) onto your local machine.

Run the following command to execute the program
java -cp c:\tmp\kote-1.0-SNAPSHOT.jar flexion.App

### Prerequisites
CircleCI needs to be integrated with the GitHub.
JDK 1.8.0_131

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [CircleCI](https://circleci.com/)
