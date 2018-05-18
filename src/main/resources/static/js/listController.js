app.controller("listController",['$scope','$http', '$window', function($scope, $http, $window){
	
	$scope.listOfBG=[];
	
	$scope.loadData= function(){
		$http.get("api/getBGList").then(function(response){
			$scope.listOfBG= response.data;
		});
	}
	$scope.loadData();
	$scope.add= function(){
		$window.location="#!/addBG";
	}
	$scope.edit = function(id){
		alert("call");
	}
}]);
