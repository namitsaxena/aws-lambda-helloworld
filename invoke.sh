# This script directly executes the function on AWS cloud
# and has no bearing with the code here (except until it is deployed)

aws lambda invoke \
--invocation-type RequestResponse \
--function-name Lambda-HelloWorld \
--region us-west-2 \
--payload file://src/test/resources/input1.json \
outputfile.txt