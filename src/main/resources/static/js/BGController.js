app.controller("BGController",['$scope','$http', '$window', function($scope, $http, $window){
	$scope.bg={};
	$scope.bg.name="";
	$scope.bg.blood_group_type="";
	
	$scope.submit= function(){
		console.log($scope.bg);
		$http.post("api/addBG", $scope.bg).then(function(response) {
	        console.log(response);
	        if(response.status= 200){
	        	alert("Saved successfully");
	        	$window.location="#!/listPage";
	        }
	    });
	}
	
}]);