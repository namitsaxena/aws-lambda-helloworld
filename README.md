## AWS Lambda Hello World
Simple Java example for an Amazon Web Services Lambda function

### Building
```
mvn clean package
```

### Deploying
-	build the package/jar as described above
-	Follow instructions from http://docs.aws.amazon.com/AWSToolkitEclipse/latest/ug/lambda-tutorial.html (for basic setup only not AWS explorer)
-	Go to AWS Lambda Console and create a new function
-	Skip templates
-	Provide any name and description, choose java 1.8
-	upload jar
-	Handler: com.namitsaxena.aws.lambda.HelloWorldLambda::myHandler
- 	Role: lambda_basic_execution (you will need to select and allow when prompted)

### Testing
-	Click Test (or use Actions -> configure test events) 
-	if prompted to confirm the test data then do so. It will look like:
	{
	  "key3": "value3",
	  "key2": "value2",
	  "key1": "value1"
	}
-	click save and test

#### Invoking from AWS CLI
-	./invoke.sh
-	This will get the output in outputfile.txt
-	http://docs.aws.amazon.com/lambda/latest/dg/API_Invoke.html

### Publishing
-	Formally Releasing the current version. Save the version ($LATEST to Version 1 or ..)

#### Amazon API Gateway Configuration
By default the function created will not be available via the web. 
-	In the function's 'API Endpoint' tab, add a new end point
-	Alternatively - use Amazon API gateway interface to define a new API gateway
-	Check here for example - http://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-create-api-from-example.html
-	Under the services resources section, choose a resources / GET or /Lambda-HelloWorld GET
- 	Create a new method and tie it back to the lambda function created
-	Deploy the service
-	Access the invoke URL from configuration (https://32m23x2vw0.execute-api.us-west-2.amazonaws.com/prod/Lambda-HelloWorld)
* Note that a method needs to be added to a resource and linked to the lambda function defined. Also make sure that the Authorization is None (at least for this example); otherwise the infamous 403 ("message": "Missing authentication token.") message to be displayed


### API Reference
-	http://docs.aws.amazon.com/lambda/latest/dg/getting-started.html
-	http://docs.aws.amazon.com/lambda/latest/dg/get-started-step4-optional.html (gives error ; corrected code included)
-	http://docs.aws.amazon.com/lambda/latest/dg/java-programming-model.html
-	http://docs.aws.amazon.com/apigateway/latest/developerguide/welcome.html



