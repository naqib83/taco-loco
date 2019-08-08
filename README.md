# Introductory Info
A test project for detroitlabs 

Deliverable: JAR

# Quick Start Guid
1. Place the tacoloco.jar any directory

2. Go to the directory using command line and run `java -jar tacoloco.ja`

3. Open Postman and make post request with this url: `http://localhost:8090/api/v1/create-order`

4. Use this Json format: 
`{
	"vegTacoQuantity": 1,
	"chickenOrBeefTacoQuantity": 2,
	"chorizoTacoQuantity": 1
}`

Make sure to set content-type to application\json
