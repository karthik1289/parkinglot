# PARKING LOT

a. Extract the tar file parkinglot-1.0-SNAPSHOT.tar.gz using command
   tar -xvf parkinglot-1.0-SNAPSHOT.tar.gz

b. You will find bin folder with shell script, README.MD, samples folder
   with file_inputs.txt and the runnable jar file

c. To Execute the program there are two ways, either via interactive
   shell or via file input.
   For interactive shell run below command:
   sh bin/parkinglot.sh
   For file input run below command:
   sh bin/parkinglot.sh 'filePath'

d. Sample file has been given in samples folder, so user can try it out
   by running command
   sh bin/parking.sh samples/file_inputs.txt

e. All user commands in shell and file are validated before getting
   executed.

f. Sample valid commands are below:
   --> create_parking_lot 6
   --> park KA-01-HH-1234 White
   --> leave 1
   --> status
   --> registration_numbers_for_cars_with_colour White
   --> slot_numbers_for_cars_with_colour White
   --> slot_number_for_registration_number KA-01-HH-1234
