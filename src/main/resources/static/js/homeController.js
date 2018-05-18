app.controller("homeController",['$scope','$http', '$window', function($scope, $http, $window){
	
	$scope.home=function(){
		$window.location="/";
	}
}]);