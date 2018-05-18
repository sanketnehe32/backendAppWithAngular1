var app = angular.module('myApp', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
    .when('/', {
    	templateUrl: '/views/welcomePage.html',
    	controller: 'homeController'
    })
    .when('/listPage',{
            templateUrl: '/views/listPage.html',
            controller: 'listController'
        })
        .when('/addBG',{
            templateUrl: '/views/bloodGroup.html',
            controller: 'BGController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});
