## Lambda Hello World
Simple Java example for an aws lambda function

## Building
mvn clean package

## Deploying
-	build the package/jar as described above
-	Follow instructions from http://docs.aws.amazon.com/AWSToolkitEclipse/latest/ug/lambda-tutorial.html (for basic setup only not AWS explorer)
-	Go to AWS Lambda Console and create a new function
-	Skip templates
-	Provide any name and description, choose java 1.8
-	upload jar
-	Handler: com.namitsaxena.aws.lambda.HelloWorldLambda::myHandler
- 	Role: lambda_basic_execution (you will need to select and allow when prompted)

## Testing
-	Click Test (or use Actions -> configure test events) 
-	if prompted to confirm the test data then do so. It will look like:
	{
	  "key3": "value3",
	  "key2": "value2",
	  "key1": "value1"
	}
-	click save and test

## Invoking from AWS CLI
-	./invoke.sh
-	This will get the output in outputfile.txt
-	http://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html


## Publishing
-	This will convert $LATEST to Version 1 

## API Reference
-	http://docs.aws.amazon.com/lambda/latest/dg/getting-started.html
-	http://docs.aws.amazon.com/lambda/latest/dg/get-started-step4-optional.html (gives error ; corrected code included)
-	http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model.html



