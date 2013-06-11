function RobotPageInterface($scope) {
	$scope.title = "Salvius";

	$scope.alert = "Danger! Something with the robot needs your attention!";
	
	$scope.sensors = {
    sensortype: 'Sensor',
	valuetype: 'Value',
    components: [
		{"type": "Temperature",
		"reading": "71.0",
		"unit": "C"},
		{"type": "Light",
		"reading": "2.2",
		"unit": "U"},
		{"type": "Ultrasonic",
		"reading": "20.4",
		"unit": "cm"}
    ]
  };
  
}