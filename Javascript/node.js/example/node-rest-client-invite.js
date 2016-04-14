var Client = require('node-rest-client').Client;
var client = new Client();

var args = {
	path: { "id": 120 },
	parameters: { arg1: "hello", arg2: "world" },
	headers: { "test-header": "client-api" },
	data: "<xml><arg1>hello</arg1><arg2>world</arg2></xml>"
};

client.post("http://192.168.143.27:9000/webrtcserver/v1/tel:+8618410079483/invite", args, function (data, response) {
	// parsed response body as js object 
	//console.log(data);
	// raw response 
	console.log(response);
});